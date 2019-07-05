package com.biggiser.beans;

/**
 * @author Jiale Wang, Yao Yao
 * HPSCIL & LIESMARS
 */
public class LogBean {
	private Integer logid;
	private Integer userid;
	private String imgname;
	private double wealthyuser;
	private double safelyuser;
	private double livelyuser;
	private double beautifuluser;
	private double boringuser;
	private double depressionuser;
	private double wealthypredict;
	private double safelypredict;
	private double livelypredict;
	private double beautifulpredict;
	private double boringpredict;
	private double depressionpredict;
		
	public LogBean(Integer logid, Integer userid, String imgname, double wealthyuser, double safelyuser,
			double livelyuser, double beautifuluser, double boringuser, double depressionuser, double wealthypredict,
			double safelypredict, double livelypredict, double beautifulpredict, double boringpredict,
			double depressionpredict) {
		super();
		this.logid = logid;
		this.userid = userid;
		this.imgname = imgname;
		this.wealthyuser = wealthyuser;
		this.safelyuser = safelyuser;
		this.livelyuser = livelyuser;
		this.beautifuluser = beautifuluser;
		this.boringuser = boringuser;
		this.depressionuser = depressionuser;
		this.wealthypredict = wealthypredict;
		this.safelypredict = safelypredict;
		this.livelypredict = livelypredict;
		this.beautifulpredict = beautifulpredict;
		this.boringpredict = boringpredict;
		this.depressionpredict = depressionpredict;
	}
	
	public Integer getLogid() {
		return logid;
	}
	public void setLogid(Integer logid) {
		this.logid = logid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	public double getWealthyuser() {
		return wealthyuser;
	}
	public void setWealthyuser(double wealthyuser) {
		this.wealthyuser = wealthyuser;
	}
	public double getSafelyuser() {
		return safelyuser;
	}
	public void setSafelyuser(double safelyuser) {
		this.safelyuser = safelyuser;
	}
	public double getLivelyuser() {
		return livelyuser;
	}
	public void setLivelyuser(double livelyuser) {
		this.livelyuser = livelyuser;
	}
	public double getBeautifuluser() {
		return beautifuluser;
	}
	public void setBeautifuluser(double beautifuluser) {
		this.beautifuluser = beautifuluser;
	}
	public double getBoringuser() {
		return boringuser;
	}
	public void setBoringuser(double boringuser) {
		this.boringuser = boringuser;
	}
	public double getDepressionuser() {
		return depressionuser;
	}
	public void setDepressionuser(double depressionuser) {
		this.depressionuser = depressionuser;
	}
	public double getWealthypredict() {
		return wealthypredict;
	}
	public void setWealthypredict(double wealthypredict) {
		this.wealthypredict = wealthypredict;
	}
	public double getSafelypredict() {
		return safelypredict;
	}
	public void setSafelypredict(double safelypredict) {
		this.safelypredict = safelypredict;
	}
	public double getLivelypredict() {
		return livelypredict;
	}
	public void setLivelypredict(double livelypredict) {
		this.livelypredict = livelypredict;
	}
	public double getBeautifulpredict() {
		return beautifulpredict;
	}
	public void setBeautifulpredict(double beautifulpredict) {
		this.beautifulpredict = beautifulpredict;
	}
	public double getBoringpredict() {
		return boringpredict;
	}
	public void setBoringpredict(double boringpredict) {
		this.boringpredict = boringpredict;
	}
	public double getDepressionpredict() {
		return depressionpredict;
	}
	public void setDepressionpredict(double depressionpredict) {
		this.depressionpredict = depressionpredict;
	}
	
	
}
