package com.dart9.tudulists.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
@Import({HibernateConfig.class})
@ComponentScan(basePackages = "com.dart9.tudulists")
public class RootConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertyPlaceHolderConfigurer(){
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        pspc.setLocation(new ClassPathResource("application.properties"));
        pspc.setIgnoreUnresolvablePlaceholders(true);
        return pspc;
    }
}
