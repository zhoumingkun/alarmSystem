package com.toughguy.alarmSystem.model.authority;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.toughguy.alarmSystem.dto.OperationDTO;
import com.toughguy.alarmSystem.model.AbstractModel;
import com.toughguy.alarmSystem.util.JsonUtil;
/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the"License"); 
 * you may not use this file except in compliance with the License.  
 * You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 * See the License for the specific language governing permissions and limitations under the License.
 * Copyright [2017] [RanJi] [Email-jiran1221@163.com]
 * 
 * Authority模块中的Resource资源类
 * @author FengJie
 * @date 2017-9-13
 * @since JDK1.7
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL) //为空字段不返回
public class Resource extends AbstractModel{

	private static final long serialVersionUID = -6121495662185377546L;
	
	private int id;
	private String resourceName; // 资源名称
	private int resourceType;  // 资源类型 [1 菜单][2元素] [3文件][4操作]
	private String resourceURL; // 资源URL
	private int resourcePId; // 资源父ID
	private String resourcePName; //资源父名称
	private List<Resource> list = new ArrayList<Resource>();
	private List<Operation> operationList = new ArrayList<Operation>();
	private List<OperationDTO> ListDTO = new ArrayList<OperationDTO>();
	
	private String OperatingNum; //资源对应的操作名集合    （前台）
	
	
	public String getOperatingNum() {
		return OperatingNum;
	}

	public void setOperatingNum(String operatingNum) {
		OperatingNum = operatingNum;
	}

	public List<Operation> getOperationList() {
		return operationList;
	}

	public void setOperationList(List<Operation> operationList) {
		this.operationList = operationList;
	}

	public List<Resource> getList() {
		return list;
	}

	public void setList(List<Resource> list) {
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getResourceType() {
		return resourceType;
	}
	
	public void setResourceType(int resourceType) {
		this.resourceType = resourceType;
	}
	
	public String getResourceName() {
		return resourceName;
	}
	
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
	public String getResourceURL() {
		return resourceURL;
	}
	
	public void setResourceURL(String resourceURL) {
		this.resourceURL = resourceURL;
	}
	
	public int getResourcePId() {
		return resourcePId;
	}
	
	public void setResourcePId(int resourcePId) {
		this.resourcePId = resourcePId;
	}

	public String getResourcePName() {
		return resourcePName;
	}

	public void setResourcePName(String resourcePName) {
		this.resourcePName = resourcePName;
	}

	
	public List<OperationDTO> getListDTO() {
		return ListDTO;
	}

	public void setListDTO(List<OperationDTO> listDTO) {
		ListDTO = listDTO;
	}

	@Override
	public String toString() {
		return JsonUtil.objectToJson(this);
	}

}
