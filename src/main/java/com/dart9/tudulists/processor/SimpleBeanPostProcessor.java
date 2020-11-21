package com.dart9.tudulists.processor;

import com.dart9.tudulists.user.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SimpleBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof User){
            ((User) bean).setCreateDate(new Date());
        }
        return bean;
    }
}
