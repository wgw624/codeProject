package com.meishihui.action.sysmenu;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@ParentPackage(value="myInterceptor")
@Scope(value="prototype")
@Namespace(value="/sysMenu")
@Results({@Result(name="login",location="/jsp/systemFirstPage.jsp")})
public class SystemMenuAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("do execute().....menu");
		return "success";
	}
	/**
	 * 打开订餐系统页面
	 * @return
	 * @throws Exception
	 */
	@Action(value="SystemMenuAction_openOrderMenu",results={@Result(name="success",location="/jsp/orderMenu/orderMenuMain.jsp")})
	public String openOrderMenu()throws Exception{	
		System.out.println("openOrderMenu()......");
		return "success";
	}
}
