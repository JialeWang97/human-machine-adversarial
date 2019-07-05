package com.biggiser.service;

import com.biggiser.beans.UserBean;

/**
 * @author Jiale Wang, Yao Yao
 * HPSCIL & LIESMARS
 */
public interface ILoginService {
	public UserBean Login(String username,String password);
}
