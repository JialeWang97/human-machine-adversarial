package com.biggiser.service;

import com.biggiser.beans.UserBean;

/**
 * @author Jiale Wang, Yao Yao
 * HPSCIL & LIESMARS
 */
public interface IRegisterService {
	public UserBean Login(String username,String password);//注册成功查询id
	public int Register(UserBean user);
}
