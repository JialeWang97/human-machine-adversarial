package com.biggiser.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.biggiser.beans.Init;
import com.biggiser.mapper.UserMapper;
import com.biggiser.service.IRandomImgService;

/**
 * @author Jiale Wang, Yao Yao
 * HPSCIL & LIESMARS
 */

@Service
public class RandomImgServiceImpl implements IRandomImgService{

	@Resource
    private UserMapper um;
	
	@Override
	public int getRandomImg() {
		System.out.println("getRandomImg----");
		
		int random=(int)(Math.random()*Init.imgScores.size());
		
		return random;
	}

}
