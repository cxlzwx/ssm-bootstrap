package com.it.ssm.web.controller;

import java.util.List;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.ssm.pojo.TblEmp;
import com.it.ssm.service.EmpService;

/**
 * <p>Title: UserListController.java</p>  
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>  
 * <p>Company: </p>  
 * @author thinkc  
 * @date 2018年4月30日  
 * @version 1.0  
*/
@Controller
public class EmpController {
	
	@Autowired
	private EmpService empService;
	/**
	 *
	 *
	 * @param pageNo
	 * @param mode
	 * @return
	 */
	@RequestMapping("/emp/list")
	public String findPageList(@RequestParam(value="pageNo",defaultValue="1") String pageNo,Model mode){
		PageHelper.startPage(Integer.valueOf(pageNo), 5);
		List<TblEmp> list = empService.findPageList();
		PageInfo<TblEmp> pageInfo = new PageInfo<TblEmp>(list);
		mode.addAttribute("pageInfo",pageInfo);
		return "empList";
	}

}










