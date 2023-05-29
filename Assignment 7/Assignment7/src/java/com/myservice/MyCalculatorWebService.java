/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.myservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author samsep
 */
@WebService(serviceName = "MyCalculatorWebService")
public class MyCalculatorWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addition")
    public int addition(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1 +num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtraction")
    public int subtraction(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1-num2;
    }

    /**
     * Web service operation
     */
    

   
}
