package ry.aop.service;

/**
 * @author: ry
 * @date: 2024/2/28
 */
public interface OrderService {
    Order createOrder(String username, String product);
    Order queryOrder(String username);
}
