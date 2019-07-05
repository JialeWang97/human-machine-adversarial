package com.biggiser.beans;

import java.util.ArrayList;
import java.util.List;

import weka.classifiers.trees.RandomForest;

/**
 * @author Jiale Wang, Yao Yao
 * HPSCIL & LIESMARS
 */
public class UserRatingBean {
	private Integer id;//用户id
	private List<BaseScore> scoredImg;//不包含特征列
	private Integer curNum;//当前打了几张街景
	private RandomForest wealthyForest;
	private RandomForest safelyForest;
	private RandomForest livelyForest;
	private RandomForest beautifulForest;
	private RandomForest boringForest;
	private RandomForest depressionForest;
	//预测值
	private double pwealthyValue;
	private double psafelyValue;
	private double plivelyValue;
	private double pbeautifulValue;
	private double pboringValue;
	private double pdepressionValue;

	public UserRatingBean() {
		super();
		this.id = -1;
		scoredImg = new ArrayList<>();
		curNum=0;
		wealthyForest = new RandomForest();
		safelyForest = new RandomForest();
		livelyForest = new RandomForest();
		beautifulForest = new RandomForest();
		boringForest = new RandomForest();
		depressionForest = new RandomForest();
		
		pwealthyValue=-1;
		psafelyValue=-1;
		plivelyValue=-1;
		pbeautifulValue=-1;
		pboringValue=-1;
		pdepressionValue=-1;
	}

	public UserRatingBean(Integer id) {
		super();
		this.id = id;
		scoredImg = new ArrayList<>();
		curNum=0;
		wealthyForest = new RandomForest();
		safelyForest = new RandomForest();
		livelyForest = new RandomForest();
		beautifulForest = new RandomForest();
		boringForest = new RandomForest();
		depressionForest = new RandomForest();
		
		pwealthyValue=-1;
		psafelyValue=-1;
		plivelyValue=-1;
		pbeautifulValue=-1;
		pboringValue=-1;
		pdepressionValue=-1;
	}
	
	public double getPwealthyValue() {
		return pwealthyValue;
	}

	public void setPwealthyValue(double pwealthyValue) {
		this.pwealthyValue = pwealthyValue;
	}

	public double getPsafelyValue() {
		return psafelyValue;
	}

	public void setPsafelyValue(double psafelyValue) {
		this.psafelyValue = psafelyValue;
	}

	public double getPlivelyValue() {
		return plivelyValue;
	}

	public void setPlivelyValue(double plivelyValue) {
		this.plivelyValue = plivelyValue;
	}

	public double getPbeautifulValue() {
		return pbeautifulValue;
	}

	public void setPbeautifulValue(double pbeautifulValue) {
		this.pbeautifulValue = pbeautifulValue;
	}

	public double getPboringValue() {
		return pboringValue;
	}

	public void setPboringValue(double pboringValue) {
		this.pboringValue = pboringValue;
	}

	public double getPdepressionValue() {
		return pdepressionValue;
	}

	public void setPdepressionValue(double depressionValue) {
		this.pdepressionValue = depressionValue;
	}
	
	public RandomForest getWealthyForest() {
		return wealthyForest;
	}

	public void setWealthyForest(RandomForest wealthyForest) {
		this.wealthyForest = wealthyForest;
	}

	public RandomForest getSafelyForest() {
		return safelyForest;
	}

	public void setSafelyForest(RandomForest safelyForest) {
		this.safelyForest = safelyForest;
	}

	public RandomForest getLivelyForest() {
		return livelyForest;
	}

	public void setLivelyForest(RandomForest livelyForest) {
		this.livelyForest = livelyForest;
	}

	public RandomForest getBeautifulForest() {
		return beautifulForest;
	}

	public void setBeautifulForest(RandomForest beautifulForest) {
		this.beautifulForest = beautifulForest;
	}

	public RandomForest getBoringForest() {
		return boringForest;
	}

	public void setBoringForest(RandomForest boringForest) {
		this.boringForest = boringForest;
	}

	public RandomForest getDepressionForest() {
		return depressionForest;
	}

	public void setDepressionForest(RandomForest depressionForest) {
		this.depressionForest = depressionForest;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<BaseScore> getScoredImg() {
		return scoredImg;
	}

	public void setScoredImg(List<BaseScore> scoredImg) {
		this.scoredImg = scoredImg;
	}

	public Integer getCurNum() {
		return curNum;
	}

	public void setCurNum(Integer curNum) {
		this.curNum = curNum;
	}
	
	@Override
	public String toString() {
		return String.format("UserRatingBean [id=%s, curNum=%s]", id, curNum);
	}
}
