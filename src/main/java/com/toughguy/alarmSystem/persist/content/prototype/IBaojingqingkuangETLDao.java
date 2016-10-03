package com.toughguy.alarmSystem.persist.content.prototype;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.toughguy.alarmSystem.controller.content.BaojingqingkuangETLController;
import com.toughguy.alarmSystem.model.content.BaojingqingkuangETL;
import com.toughguy.alarmSystem.persist.prototype.IGenericDao;



public interface IBaojingqingkuangETLDao extends IGenericDao<BaojingqingkuangETL, Integer> {

	/**
	 * 地级市添加报警情况根据行政区划查询抽取固定数据
	 * @param bjqk
	 * @return
	 */
	public List<BaojingqingkuangETL> findEtl(BaojingqingkuangETL bjqk);
}
