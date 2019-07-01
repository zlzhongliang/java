package com.vince.ui;

import com.vince.bean.User;
import com.vince.utils.BusinessException;

/**
 * Created by didi on 2019/7/1.
 */
public class RegisterClass extends BaseClass{
    public void register() throws BusinessException{
        println(getString("input.username"));
        String username = input.nextLine();
        println(getString("input.password"));
        String password = input.nextLine();
        User user = new User();


    }
}
