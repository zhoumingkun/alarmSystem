package com.toughguy.alarmSystem.service.content.prototype;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.toughguy.alarmSystem.model.content.Baojingqingkuang;
import com.toughguy.alarmSystem.model.content.Saoheichue;
import com.toughguy.alarmSystem.service.prototype.IGenericService;

/**
 * 报警情况Service层接口类
 * @author zmk
 *
 */
public interface IBaojingqingkuangService extends IGenericService<Baojingqingkuang, Integer>{
	/**
	 * 省厅报警情况柱状图
	 * @return
	 */
	public Map<String ,Baojingqingkuang> findAllBJ();

	/**
	 * 地级市报警情况柱状图
	 * @return
	 */
	public Map<String ,Baojingqingkuang> findOneBJ(String xzqh);
	   

	/**
	 * 省厅查询报警情况统计表
	 * @return
	 */
	public Map<String,Object> selectAll(String time);
	
	/**
	 * 地级市查询报警情况统计表
	 * @return
	 */
	public Map<String,Object> selectOne(String time,String xzqh);
	
	
	
	/**
	 * 查询报警情况列表展示
	 * @return
	 */
	public  Map<String,Object> selectList(String time,String xzqh);
	
	
	/**
	 * 导出省报警情况表
	 * @return
	 */
	public void ExportShenBjqk(HttpServletResponse response,String tjyf);
	/**
	 * 导出市报警情况表
	 * @return
	 */
	public void ExportShiBjqk(HttpServletResponse response, String tjyf, String xzqh);

	
	
	/**
	 * 地级市报警情况查询是否添加过数据
	 * @return
	 */
	public List<Baojingqingkuang> findOne(Map<String,String> map);
	
	/**
	 * 地级市报警情况修改数据
	 * @return
	 */
	public void updateAll(Baojingqingkuang baojingqingkuang);
	
	/**
	 * 省厅开关数据抽取开关
	 * @param state
	 */
	public void etlSwitch(String state);
	
	/**
	 * 查询省厅开关
	 * @param state
	 */
	public String findSwitch();
	
	/**
	 * 数据抽取接口
	 * @param state
	 */
	public List<Baojingqingkuang> etl_BJQK(String time);
	
	/**
	 * 根据ip查询数据库  判断是否可以抽取数据
	 * @param ip
	 * @return
	 */
	public String findIP(String ip);
	
	/**
	 * 地级市添加报警情况根据行政区划查询抽取固定数据
	 * @param bjqk
	 * @return
	 */
	public List<Baojingqingkuang> findEtl(Baojingqingkuang bjqk);
	
	/**
	 * 添加数据到假库（数据共享）
	 * @param list
	 * @return
	 */
	public String insertFalse(List<Baojingqingkuang> list);
	
	/**
	 * 查询数据共享列表
	 * @return
	 */
	public Map<String,Object> listFbjqk();
	
	/**
	 * 查询数据共享列表
	 * @return
	 */
	public Map<String,Object> selectFbjqk(String tjyf);
	
	/**
	 * 查询数据共享列表
	 * @return
	 */
	public List<Baojingqingkuang> selectTFbjqk(String tjyf);
}
