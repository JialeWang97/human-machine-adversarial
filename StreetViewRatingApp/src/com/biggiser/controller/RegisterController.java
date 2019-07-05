package com.biggiser.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.biggiser.beans.BaseScore;
import com.biggiser.beans.Init;
import com.biggiser.beans.UserBean;
import com.biggiser.beans.UserRatingBean;
import com.biggiser.service.IRandomImgService;
import com.biggiser.service.IRegisterService;

/**
 * @author Jiale Wang, Yao Yao
 * HPSCIL & LIESMARS
 */

@Controller
public class RegisterController {
	private Logger log = Logger.getLogger(this.getClass());

	@Resource
	private IRegisterService RegisterServiceImpl;
	
	@Resource
	private IRandomImgService RandomImgServiceImpl;

	@RequestMapping("/register")
	public ModelAndView login(HttpServletRequest req, UserBean user) {
		user.setLast_ip(req.getLocalAddr());//设置ip
		user.setLast_visit(new Date());//设置注册时间
		log.info(user);
		
		ModelAndView mv = new ModelAndView();
		int b = RegisterServiceImpl.Register(user);

		if (b>0) {
			UserBean u = RegisterServiceImpl.Login(user.getUsername(),user.getPassword());
			UserRatingBean userScoredImg=new UserRatingBean(u.getId());//新建打分用户	
			HttpSession session=req.getSession();
			session.setAttribute("userScoredImg", userScoredImg);
			session.setAttribute("user", u);//用户名存储
			
			int imgId=RandomImgServiceImpl.getRandomImg();
			String imgUrl = Init.imgScores.get(imgId).fileName;
			session.setAttribute("filename", imgUrl);//图片url
			mv.addObject("imgUrl", imgUrl);
			
			//设置上一张的预测值
			BaseScore prediction=new BaseScore(0,0,0,0,0,0,"");//""代表此时模型没有训练好			
			session.setAttribute("prediction", prediction);		
			
			session.setAttribute("isModelOK", false);
			session.setAttribute("number", 0);
			
			mv.addObject("pwealthyValue", 0);
			mv.addObject("psafelyValue", 0);
			mv.addObject("plivelyValue", 0);
			mv.addObject("pbeautifulValue", 0);
			mv.addObject("pboringValue", 0);
			mv.addObject("pdepressionValue", 0);
			
			int index = imgUrl.lastIndexOf('.');
			String location = imgUrl.substring(0, index);
			mv.addObject("location", location);			
			
			mv.setViewName("rating");
		}else{
			mv.setViewName("register");
		}

		return mv;
	}
}
