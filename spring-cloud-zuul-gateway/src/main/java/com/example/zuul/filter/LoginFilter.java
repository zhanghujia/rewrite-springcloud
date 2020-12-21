package com.example.zuul.filter;

import com.example.zuul.constants.ZuulConstants;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author 10696
 * @since 2020/12/14 15:02
 */

@Component
public class LoginFilter extends ZuulFilter {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String filterType() {
        return ZuulConstants.ZUUL_ROUTERS_PRE;
    }


    /**
     * 返回值是 int 会根据返回值进行定义过滤器的执行顺序
     * 值越小优先级越高
     *
     * @return int
     */
    @Override
    public int filterOrder() {
        return 0;
    }


    /**
     * 当前过滤器是否被执行
     *
     * @return 判断
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 定义 过滤功能 token校验
     */
    @Override
    public Object run() throws ZuulException {
        // 获取上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getParameter("token");
        if (token == null) {
            // 没有登录 不进行转发
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(200);
            try {
                currentContext.getResponse().getWriter().write("token is null");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        logger.info("校验通过。。。。");
        //通过
        return null;
    }

}
