package com.dio.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MyApp implements CommandLineRunner{
    //Não se da new para componentes 
    @Autowired
    private  Calculadora c;
    
    
    @Override
    public void run(String... args) throws Exception {
        //como eliminar a existencia do new e garantir que virem beans
        System.out.println("O resultado é: " + c.somar(5, 11));
       
    }
    //comportamento semelhante a main

    
}
