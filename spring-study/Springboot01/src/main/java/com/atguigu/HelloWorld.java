package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2019/7/1 0001.
 */
//标注一个主程序类,说明这是一个Spring boot应用
@SpringBootApplication
public class HelloWorld {
    public static void main(String[] args) {
        //Spring 应用启动起来
        SpringApplication.run(HelloWorld.class,args);
    }
}