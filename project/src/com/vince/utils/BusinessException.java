package com.vince.utils;

/**
 * Created by didi on 2019/7/1.
 */
public class BusinessException extends RuntimeException{

    public BusinessException(){
        super();
    }

    public BusinessException(String errorMessage){
        super(errorMessage);
    }

}
