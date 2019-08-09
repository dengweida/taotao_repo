package com.taotao.service;

import com.taotao.pojo.TaotaoResult;

public interface ItemParamService {

	TaotaoResult getItemParamByCid(Long cid);
	
	
	//提交规格参数模板
	TaotaoResult insertItemParam(Long cid, String paramData);
}
