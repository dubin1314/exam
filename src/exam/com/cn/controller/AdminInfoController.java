package exam.com.cn.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import exam.com.cn.service.AdminService;

@Controller
public class AdminInfoController {
	public static Logger log = Logger.getLogger(AdminInfoController.class);

	@Autowired
	private AdminService adminService;

}
