package com.example.demo.model;

import java.util.Date;

import lombok.Data;

@Data
public class ResponseExample {

    public ResponseExample(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    private String responseMessage = "";
    private Date startConvert = new Date();
}
