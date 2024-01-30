package ry.resolveBeforeInstantiation;

/**
 * @author: xzy
 * @date: 2024/1/30
 */
public class BeforeInstantiationUser {
    private int userId;
    private String userName;
    private String userAddress;
    private String beanName;

    public BeforeInstantiationUser() {
        System.out.println("BeforeInstantiationUser()构造方法被执行");
    }

    public void start(){
        System.out.println("执行自定义初始化的方法init-method....");
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", beanName='" + beanName + '\'' +
                '}';
    }
}
