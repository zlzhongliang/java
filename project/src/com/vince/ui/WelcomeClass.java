package com.vince.ui;

/**
 * Created by didi on 2019/7/1.
 */
public class WelcomeClass extends BaseClass{
    public void start(){
        println(getString("info.welcome"));
        boolean flag = true;
        while(flag){
            println(getString("info.login.reg"));
            println(getString("info.select"));
            String select = input.nextLine();
            switch (select){
                case "1":
                    flag = false;
                    break;
                case "2":
                    flag = false;
                    break;
                default:
                    println(getString("input.error"));
                    break;
            }
        }
    }
}
