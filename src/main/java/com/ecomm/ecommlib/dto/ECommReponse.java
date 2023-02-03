package com.ecomm.ecommlib.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ECommReponse {

    private int statusCode;
    private String message;
    private Object data;

    public ECommReponse(int statusCode,String message){
        this.statusCode=statusCode;
        this.message=message;
    }

    public ECommReponse(Object data){
        this.data=data;
    }

    public ECommReponse(String message){
        this.message=message;
    }


    public ECommReponse(String message,Object data){
        this.message=message;
        this.data=data;
    }

}
