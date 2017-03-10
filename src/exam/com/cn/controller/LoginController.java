package exam.com.cn.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import exam.com.cn.db.model.SystemAdmin;
import exam.com.cn.db.model.UserInfo;
import exam.com.cn.service.AdminService;
import exam.com.cn.service.UserService;
import exam.com.cn.util.ConfigInfo;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/LoginController")
public class LoginController {
	public static Logger log = Logger.getLogger(LoginController.class);

	@Autowired
	private AdminService adminService;
	@Autowired
	private UserService userService;

	/**
	 * 登录方法
	 * 
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response) {

		// 获取身份
		int role = Integer.parseInt(request.getParameter("role"));
		// 考生登录
		if (role == ConfigInfo.CANDIDATE) {
			String candidateNumber = request.getParameter("candidateNumber");
			String password = request.getParameter("password");
			if (StringUtils.isBlank(candidateNumber) || StringUtils.isBlank(password)) {
				return JSONPackager.jsonObjData(false, null, "用户名或密码为空");
			}
			UserInfo userInfo = userService.getUserInfo(candidateNumber, password);
			// 判空
			if (userInfo == null) {
				return JSONPackager.jsonObjData(false, null, "用户名或密码错误");
			}
			// 如果考生状态是停用
			if (userInfo.getuStatus() == ConfigInfo.CANDIDATE_STATUS_SUSPENDED) {
				return JSONPackager.jsonObjData(false, null, "该考生信息已经停止使用");
			}
			request.getSession().setAttribute("userInfo", userInfo);
			request.getSession().setAttribute("privilege", ConfigInfo.CANDIDATE);
		} else {
			// 管理员登录
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			if (StringUtils.isBlank(name) || StringUtils.isBlank(password)) {
				return JSONPackager.jsonObjData(false, null, "用户名或密码为空");
			}
			SystemAdmin systemAdmin = adminService.getAdminInfo(name, password);
			// 判空
			if (systemAdmin == null) {
				return JSONPackager.jsonObjData(false, null, "用户名或密码错误");

			}
			request.getSession().setAttribute("userInfo", systemAdmin);
			request.getSession().setAttribute("privilege", ConfigInfo.ADMIN);
		}
		JSONObject object = new JSONObject();
		// 返回结果
		return JSONPackager.jsonObjData(true, object, "成功");
	}
}
