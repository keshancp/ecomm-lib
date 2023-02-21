package com.ecomm.ecommlib.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ECommResponse {

    private int statusCode;
    private String message;
    private Object data;

    public ECommResponse(int statusCode, String message){
        this.statusCode=statusCode;
        this.message=message;
    }

    public ECommResponse(Object data){
        this.data=data;
    }

    public ECommResponse(String message){
        this.message=message;
    }


    public ECommResponse(String message, Object data){
        this.message=message;
        this.data=data;
    }

}
