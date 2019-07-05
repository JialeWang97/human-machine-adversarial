package com.biggiser.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.biggiser.beans.UserBean;
import com.biggiser.mapper.UserMapper;
import com.biggiser.service.ILoginService;

/**
 * @author Jiale Wang, Yao Yao
 * HPSCIL & LIESMARS
 */

@Service
public class LoginServiceImpl implements ILoginService{
    
    @Resource
    private UserMapper um;


    @Override
    public UserBean Login(String username, String password) {
        return um.login(username, password);
    }
}
