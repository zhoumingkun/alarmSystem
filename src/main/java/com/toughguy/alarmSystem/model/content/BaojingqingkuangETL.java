package com.toughguy.alarmSystem.model.content;

public class BaojingqingkuangETL {
	private int id;
	private String xzqh;    //行政区划
	private String tbdw;   //填报单位
	private String bjqk;  //报警情况
	private String wffzaj;       //违法犯罪案件
	private String zaaj;    //治安案件
	private String hzsg;       //火灾事故
	private String jtsg;        //交通事故
	private String zazhsg;   //治安灾害事故
	private String zhsg;   //灾害事故
	private String zs;   //来自杀源
	private String jf;   //纠纷
	private String jtbl;   //家庭暴力
	private String gmqz;   //公民求助
	private String zsxr;   //走失寻人
	private String jwjd;   //警务监督
	private String qt;   //其他
	private String hj;   //合计
	private String tbr;   //填报人
	private String tjyf;	//统计月份
	private String state;	//状态   正常1   非正常-1
	private String time;	//原数据接警时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getXzqh() {
		return xzqh;
	}
	public void setXzqh(String xzqh) {
		this.xzqh = xzqh;
	}
	public String getTbdw() {
		return tbdw;
	}
	public void setTbdw(String tbdw) {
		this.tbdw = tbdw;
	}
	public String getBjqk() {
		return bjqk;
	}
	public void setBjqk(String bjqk) {
		this.bjqk = bjqk;
	}
	public String getWffzaj() {
		return wffzaj;
	}
	public void setWffzaj(String wffzaj) {
		this.wffzaj = wffzaj;
	}
	public String getZaaj() {
		return zaaj;
	}
	public void setZaaj(String zaaj) {
		this.zaaj = zaaj;
	}
	public String getHzsg() {
		return hzsg;
	}
	public void setHzsg(String hzsg) {
		this.hzsg = hzsg;
	}
	public String getJtsg() {
		return jtsg;
	}
	public void setJtsg(String jtsg) {
		this.jtsg = jtsg;
	}
	public String getZazhsg() {
		return zazhsg;
	}
	public void setZazhsg(String zazhsg) {
		this.zazhsg = zazhsg;
	}
	public String getZhsg() {
		return zhsg;
	}
	public void setZhsg(String zhsg) {
		this.zhsg = zhsg;
	}
	public String getZs() {
		return zs;
	}
	public void setZs(String zs) {
		this.zs = zs;
	}
	public String getJf() {
		return jf;
	}
	public void setJf(String jf) {
		this.jf = jf;
	}
	public String getJtbl() {
		return jtbl;
	}
	public void setJtbl(String jtbl) {
		this.jtbl = jtbl;
	}
	public String getGmqz() {
		return gmqz;
	}
	public void setGmqz(String gmqz) {
		this.gmqz = gmqz;
	}
	public String getZsxr() {
		return zsxr;
	}
	public void setZsxr(String zsxr) {
		this.zsxr = zsxr;
	}
	public String getJwjd() {
		return jwjd;
	}
	public void setJwjd(String jwjd) {
		this.jwjd = jwjd;
	}
	public String getQt() {
		return qt;
	}
	public void setQt(String qt) {
		this.qt = qt;
	}
	public String getHj() {
		return hj;
	}
	public void setHj(String hj) {
		this.hj = hj;
	}
	public String getTbr() {
		return tbr;
	}
	public void setTbr(String tbr) {
		this.tbr = tbr;
	}
	public String getTjyf() {
		return tjyf;
	}
	public void setTjyf(String tjyf) {
		this.tjyf = tjyf;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "BaojingqingkuangETL [id=" + id + ", xzqh=" + xzqh + ", tbdw=" + tbdw + ", bjqk=" + bjqk + ", wffzaj="
				+ wffzaj + ", zaaj=" + zaaj + ", hzsg=" + hzsg + ", jtsg=" + jtsg + ", zazhsg=" + zazhsg + ", zhsg="
				+ zhsg + ", zs=" + zs + ", jf=" + jf + ", jtbl=" + jtbl + ", gmqz=" + gmqz + ", zsxr=" + zsxr
				+ ", jwjd=" + jwjd + ", qt=" + qt + ", hj=" + hj + ", tbr=" + tbr + ", tjyf=" + tjyf + ", state="
				+ state + ", time=" + time + "]";
	}

	
}
