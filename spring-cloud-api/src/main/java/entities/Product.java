package entities;

import java.io.Serializable;

/**
 * @author 10696
 * @since 2020/12/2 16:59
 */

public class Product implements Serializable {

    private static final long serialVersionUID = 1762949555278249803L;

    private Long pid;

    private String productName;

    private String dbSource;

    public Product() {

    }

    public Product(Long pid, String productName, String dbSource) {
        this.pid = pid;
        this.productName = productName;
        this.dbSource = dbSource;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

}
