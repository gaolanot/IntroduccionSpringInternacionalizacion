/*
 * Implementación Ejemplo Introducción Spring
 * http://acodigo.blogspot.com/2017/02/spring-tutorial-de-introduccion.html
 * Creación de Clase para Servicio Hello \ implementa de HelloService
 */
package com.golano.spring.introduccionspring;

/**
 * 16/04/2019
 * @author gaolanot
 */
public class HelloServiceImpl implements HelloService{
    //Implementación método saludar
    @Override
    public void saludar() {
        System.out.println("Ejemplo introducción Spring sin XML");
    }
}
