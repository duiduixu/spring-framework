package ry.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author: xzy
 * @date: 2024/1/10
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
