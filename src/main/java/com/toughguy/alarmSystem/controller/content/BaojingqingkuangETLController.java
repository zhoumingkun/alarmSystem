package com.toughguy.alarmSystem.controller.content;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.toughguy.alarmSystem.model.content.BaojingqingkuangETL;
import com.toughguy.alarmSystem.service.content.prototype.IBaojingqingkuangETLService;

@RestController
@RequestMapping("/baojingqingkuangETL")
public class BaojingqingkuangETLController {
	
	@Autowired
	private IBaojingqingkuangETLService baojingqingkuangETLService;
	
	
	/**
	 * 地级市添加报警情况查询抽取固定数据
	 * @return
	 */
	@RequestMapping("/findEtl")
	public List<BaojingqingkuangETL> findEtl(BaojingqingkuangETL bjqk){
		return baojingqingkuangETLService.findEtl(bjqk);
	}

}
