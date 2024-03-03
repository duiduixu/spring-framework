package ry.aop.service;

/**
 * @author: ry
 * @date: 2024/2/28
 */
public class Order {
    private String id;
    private String userName;
    private String product;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
