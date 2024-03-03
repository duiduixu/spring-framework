package ry.aop.service;

/**
 * @author: ry
 * @date: 2024/2/28
 */
public interface UserService {
    User createUser(String firstName, String lastName, int age);

    User queryUser();
}
