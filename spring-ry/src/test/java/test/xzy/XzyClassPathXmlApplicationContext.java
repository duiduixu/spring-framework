package test.xzy;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xzy
 * @date: 2024/1/2
 */
public class XzyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public XzyClassPathXmlApplicationContext(String... configLocations){
        super(configLocations);
    }

    @Override
    public void initPropertySources(){
//        ConfigurableListableBeanFactory beanFactory = this.getBeanFactory();
        System.out.println("initPropertySources: 1");
        super.initPropertySources();
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        System.out.println("customizeBeanFactory: 2");
        super.customizeBeanFactory(beanFactory);
    }

    
}
