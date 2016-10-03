package com.toughguy.alarmSystem.service.content.prototype;

import java.util.List;

import org.springframework.stereotype.Service;

import com.toughguy.alarmSystem.controller.content.BaojingqingkuangETLController;
import com.toughguy.alarmSystem.model.content.BaojingqingkuangETL;
import com.toughguy.alarmSystem.service.prototype.IGenericService;


public interface IBaojingqingkuangETLService  extends IGenericService<BaojingqingkuangETL, Integer> {

	/**
	 * 为了返回值不是0 新写的数据抽取查询
	 * @param bjqk
	 * @return
	 */
	public List<BaojingqingkuangETL> findEtl(BaojingqingkuangETL bjqk);
	

}
