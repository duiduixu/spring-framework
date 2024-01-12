package ry.custom;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author: xzy
 * @date: 2024/1/10
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    //Element对应的类
    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    //从Element中解析并提取对应的元素
    @Override
    protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder beanDefinitionBuilder) {
        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");
        if (StringUtils.hasText(userName)) {
            beanDefinitionBuilder.addPropertyValue("userName", userName);
        }
        if (StringUtils.hasText(email)) {
            beanDefinitionBuilder.addPropertyValue("email", email);
        }
    }
}
