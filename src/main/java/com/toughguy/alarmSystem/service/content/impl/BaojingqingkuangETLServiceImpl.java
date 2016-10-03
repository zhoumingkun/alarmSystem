package com.toughguy.alarmSystem.service.content.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toughguy.alarmSystem.controller.content.BaojingqingkuangETLController;
import com.toughguy.alarmSystem.model.content.Baojingqingkuang;
import com.toughguy.alarmSystem.model.content.BaojingqingkuangETL;
import com.toughguy.alarmSystem.persist.content.prototype.IBaojingqingkuangETLDao;
import com.toughguy.alarmSystem.service.content.prototype.IBaojingqingkuangETLService;
import com.toughguy.alarmSystem.service.content.prototype.IBaojingqingkuangService;
import com.toughguy.alarmSystem.service.impl.GenericServiceImpl;

@Service
public class BaojingqingkuangETLServiceImpl extends GenericServiceImpl<BaojingqingkuangETL, Integer> implements IBaojingqingkuangETLService {
	
	@Autowired
	private IBaojingqingkuangETLDao baojingqingkuangETLDao;

	@Override
	public List<BaojingqingkuangETL> findEtl(BaojingqingkuangETL bjqk) {
					// TODO Auto-generated method stub
					Date date = new Date();
					SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM");
					String year =sf.format(date).substring(0,4);			//2019
					String month =sf.format(date).substring(5,7);			//09
					String time = sf.format(date);
					if(month.equals("1")) {		//是一月份
						int parseInt = Integer.parseInt(year)-1;		//年减一
						month="12";
						time=parseInt+"-"+month;
					}else {
						int Imonth =Integer.parseInt(month)-1;
						String s = "";
						if(Imonth<10) {
							s ="0"+Imonth;
						}
						time=year+"-"+s;
					}
					bjqk.setTjyf(time);			//查询当前月份-1的数据
					List<BaojingqingkuangETL> list=baojingqingkuangETLDao.findEtl(bjqk);
					for(int i =0;i<list.size();i++) {
						if(list.get(i).getWffzaj()==null || list.get(i).getWffzaj().equals(null)) {
							list.get(i).setWffzaj("-1");
						}
						
						if(list.get(i).getZaaj()==null || list.get(i).getZaaj().equals(null)) {
							list.get(i).setZaaj("-1");
						}
						
						if(list.get(i).getHzsg()==null || list.get(i).getHzsg().equals(null)) {
							list.get(i).setHzsg("-1");
						}
						
						if(list.get(i).getJtsg()==null || list.get(i).getJtsg().equals(null)) {
							list.get(i).setJtsg("-1");
						}
						if(list.get(i).getZazhsg()==null || list.get(i).getZazhsg().equals(null)) {
							list.get(i).setZazhsg("-1");
						}
						if(list.get(i).getZhsg()==null || list.get(i).getZhsg().equals(null)) {
							list.get(i).setZhsg("-1");
						}
						if(list.get(i).getZs()==null || list.get(i).getZs().equals(null)) {
							list.get(i).setZs("-1");
						}
						if(list.get(i).getJf()==null || list.get(i).getJf().equals(null)) {
							list.get(i).setJf("-1");
						}
						if(list.get(i).getJtbl()==null || list.get(i).getJtbl().equals(null)) {
							list.get(i).setJtbl("-1");
						}
						if(list.get(i).getGmqz()==null || list.get(i).getGmqz().equals(null)) {
							list.get(i).setGmqz("-1");
						}
						if(list.get(i).getZsxr()==null || list.get(i).getZsxr().equals(null)) {
							list.get(i).setZsxr("-1");
						}
						if(list.get(i).getJwjd()==null || list.get(i).getJwjd().equals(null)) {
							list.get(i).setJwjd("-1");
						}
						if(list.get(i).getQt()==null || list.get(i).getQt().equals(null)) {
							list.get(i).setQt("-1");
						}
						
					}
					Set<String> set = new HashSet<>();
					for(int a=0;a<list.size();a++) {
						int iii=Integer.parseInt(list.get(a).getZaaj())+
								Integer.parseInt(list.get(a).getHzsg())+
								Integer.parseInt(list.get(a).getJtsg())+
								Integer.parseInt(list.get(a).getZhsg())+
								Integer.parseInt(list.get(a).getJf())+
								Integer.parseInt(list.get(a).getGmqz())+
								Integer.parseInt(list.get(a).getJwjd())+
								Integer.parseInt(list.get(a).getQt());
						list.get(a).setHj(iii+"");
						set.add(list.get(a).getBjqk());
					}
					//此处需要判断110接警那一列本该传过来  但是一月中就没有该类型的情况
					List<String> arr = new ArrayList<>();
					arr.add("110接警");
					arr.add("执勤巡逻发现");
					arr.add("器材报警");
					arr.add("口头报警");
					arr.add("电话报警");
					arr.add("短信微信报警");
					arr.add("举报");
					arr.add("扭送现行");
					arr.add("投案自首");
					arr.add("其他部门移送");
					arr.add("其他");
					arr.add("出动警力");
					arr.add("处置报警(起)");
					arr.add("现场抓获违反犯罪人员(人)");
					arr.add("逃犯(人)");
					arr.add("救助伤员(人)");
					arr.add("救助群众(人)");
					arr.add("继续盘问(人)");
					arr.add("无效报警(起)");
					arr.add("死亡(人)");
					arr.add("受伤(人)");
					for (String ss : set) {
						for(int b =0;b<arr.size();b++) {
							if(ss.equals(arr.get(b))) {
								arr.remove(b);
							}
						}
					}
					//String[] s =new String [] {"执勤巡逻发现","器材报警","电话报警","短信微信报警","举报","扭送现行","投案自首","其他部门移送","其他","出动警力","处置报警(起)","现场抓获违反犯罪人员(人)","逃犯(人)","救助伤员(人)","救助群众(人)","继续盘问(人)","无效报警(起)","死亡(人)","受伤(人)"};
					for(int i =0;i<arr.size();i++) {
						BaojingqingkuangETL b = new BaojingqingkuangETL();
						b.setBjqk(arr.get(i));
						b.setWffzaj("-1");
						b.setZaaj("-1");
						b.setHzsg("-1");
						b.setJtsg("-1");
						b.setZazhsg("-1");
						b.setZhsg("-1");
						b.setZs("-1");
						b.setJf("-1");
						b.setJtbl("-1");
						b.setGmqz("-1");
						b.setZsxr("-1");
						b.setJwjd("-1");
						b.setQt("-1");
						b.setHj("-1");
						list.add(b);
					}
					return list;
	}

}
