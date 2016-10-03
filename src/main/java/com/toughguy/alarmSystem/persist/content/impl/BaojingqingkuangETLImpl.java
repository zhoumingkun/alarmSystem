package com.toughguy.alarmSystem.persist.content.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.toughguy.alarmSystem.controller.content.BaojingqingkuangETLController;
import com.toughguy.alarmSystem.model.content.BaojingqingkuangETL;
import com.toughguy.alarmSystem.persist.content.prototype.IBaojingqingkuangDao;
import com.toughguy.alarmSystem.persist.content.prototype.IBaojingqingkuangETLDao;
import com.toughguy.alarmSystem.persist.impl.GenericDaoImpl;

@Repository
public class BaojingqingkuangETLImpl  extends GenericDaoImpl<BaojingqingkuangETL, Integer> implements IBaojingqingkuangETLDao {

	@Override
	public List<BaojingqingkuangETL> findEtl(BaojingqingkuangETL bjqk) {
		// TODO Auto-generated method stub
		System.out.println("-------------------"+bjqk);
		return sqlSessionTemplate.selectList(typeNameSpace + ".findEtl",bjqk);
	}
}
