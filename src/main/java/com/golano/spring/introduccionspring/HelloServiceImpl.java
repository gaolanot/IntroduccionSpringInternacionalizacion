/*
 * Implementación Ejemplo Introducción Spring
 * http://acodigo.blogspot.com/2017/02/spring-tutorial-de-introduccion.html
 * Creación de Clase para Servicio Hello \ implementa de HelloService
 */
package com.golano.spring.introduccionspring;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

/**
 * 16/04/2019
 * @author gaolanot
 */
public class HelloServiceImpl implements HelloService{
    //Implementación método saludar
    //El autowired permite la inyección automática
    @Autowired
    private MessageSource ms;
    
    @Override
    public void saludar() {
        System.out.println("Ejemplo introducción Spring con i18n");
    }

    @Override
    public void saludarMensaje(String nombre, String pais) {
        System.out.println(ms.getMessage("greeting", 
                           new Object[] {nombre,pais},
                           new Locale("es")));
    }
   
}
