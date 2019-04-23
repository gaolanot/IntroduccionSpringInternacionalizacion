/*
 * Implementación Ejemplo Introducción Spring
 * http://acodigo.blogspot.com/2017/02/spring-tutorial-de-introduccion.html
 * Creación de Clase de contenedor y prueba
 */
package com.golano.spring.introduccionspring;

import java.util.Locale;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * 17/04/2019   
 * @author golanot
 */
public class Introduccion {

    public static void main(String[] args) {
        AbstractApplicationContext ctx = 
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        String msg_en_title = ctx.getMessage("title", null, Locale.ENGLISH);  
        String msg_en_text = ctx.getMessage("text",null, Locale.ENGLISH);  
        String msg_es_title = ctx.getMessage("title", null, new Locale("es"));  
        String msg_es_text = ctx.getMessage("text", null,  new Locale("es"));  
        HelloService saluda = ctx.getBean("saludaService",HelloService.class);
        saluda.saludar();
        System.out.println(msg_en_title);
        System.out.println(msg_en_text);
        System.out.println(msg_es_title);
        System.out.println(msg_es_text);
        ctx.close();
    }    
}
