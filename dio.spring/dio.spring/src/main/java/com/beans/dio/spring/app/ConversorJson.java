package com.beans.dio.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;


@Component
public class ConversorJson {
     //private Gson gson = new Gson();  nao pode mais 

     @Autowired // além de importar o autowired
        private Gson gson;

    public ViaCepResponse converter(String json){
            ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
            return response;
    }


}
