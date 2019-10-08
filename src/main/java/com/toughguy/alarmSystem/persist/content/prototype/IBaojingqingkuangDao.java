package com.toughguy.alarmSystem.persist.content.prototype;


import java.util.List;
import java.util.Map;

import com.toughguy.alarmSystem.model.content.Baojingqingkuang;
import com.toughguy.alarmSystem.persist.prototype.IGenericDao;

/**
 * 报警情况Dao接口类
 * @author zmk
 *
 */
public interface IBaojingqingkuangDao extends IGenericDao<Baojingqingkuang, Integer>{
	
	public Baojingqingkuang findAllBJ(Map<String,String> map);
	
	public Baojingqingkuang findOneBJ(Map<String,String> map);
	
	public List<Baojingqingkuang> selectAll(String time);
	
	public List<Baojingqingkuang> selectOne(Map<String,String> map);
	
	//选了时间  选了地市(没选时间  选了地市)
	public List<Baojingqingkuang> selectList(Map<String,String> map);
	
	//选了时间  没选地市(没选时间  没选地市 )
	public List<Baojingqingkuang> selectAllList(Map<String,String> map);
	
	//导出省报警情况报表
	public List<Baojingqingkuang> findByTjyfTime(Map<String,String> map);
	
	//导出省报警情况报表（合计）
	public Baojingqingkuang  findShenHj(String tjyf);
		
	//导出市报警情况报表
	public List<Baojingqingkuang> findByTjyfAndRegion(Map<String,String> map);
	
	//导出市报警情况报表（合计）
	public Baojingqingkuang  findShiHj(Map<String,String> map);

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
	 * 查询省厅数据抽取开关
	 * @param state
	 */
	public String findSwitch();
	
	/**
	 * 根据ip查询数据库该ip是否合法
	 * @param state
	 */
	public String findIP(String ip);
	
	/**
	 * 地级市添加报警情况根据行政区划查询抽取固定数据
	 * @param bjqk
	 * @return
	 */
	public List<Baojingqingkuang> findEtl(Baojingqingkuang bjqk);
	
	/**
	 * 根据统计月份查询假库是否存在该条数据
	 * @param tjyf
	 * @return
	 */
	public List<Baojingqingkuang> selectSave(String tjyf);
	
	/**
	 * 添加数据到假库（数据共享）
	 * @param tjyf
	 * @return
	 */
	public void insertFalse(Baojingqingkuang bjqk);
	
	/**
	 * 修改数据到假库（数据共享）
	 * @param tjyf
	 * @return
	 */
	public void updateFalse(Baojingqingkuang bjqk);

	/**
	 * 查询数据共享列表
	 * @return
	 */
	public List<Baojingqingkuang> listFbjqk();

	/**
	 * 查询省假库汇总
	 * @param tjyf
	 * @return
	 */
	public List<Baojingqingkuang> selectFbjqk(String tjyf);
	
	/**
	 * 查询假库省报警情况合计
	 * @param tjyf
	 * @return
	 */
	public Baojingqingkuang  findFShenHj(String tjyf);
}
