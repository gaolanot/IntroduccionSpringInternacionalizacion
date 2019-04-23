/*
 * Implementación Ejemplo Introducción Spring sin XML
 * http://acodigo.blogspot.com/2017/02/spring-tutorial-de-introduccion.html
 * Creación de Clase de configuración para Spring (sin XML)
 */
package com.golano.spring.introduccionspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
/* 17/04/2019
 * @author gaolanot
 */
@Configuration
public class SpringConfiguration {
    @Bean
    public ResourceBundleMessageSource messageSource(){
        ResourceBundleMessageSource rbms =
                new ResourceBundleMessageSource();
        rbms.setBasename("I18N/message");
        return rbms;
    }
    @Bean
    public HelloService saludaService(){
        return new HelloServiceImpl();
    }
}
