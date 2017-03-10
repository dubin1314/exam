package exam.com.cn.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import exam.com.cn.db.model.UserInfo;
import exam.com.cn.service.UserService;
import exam.com.cn.util.ConfigInfo;
import net.sf.json.JSONObject;

@Controller
public class UserInfoController {
	public static Logger log = Logger.getLogger(UserInfoController.class);
	@Autowired
	private UserService userService;

	/**
	 * 新建考生信息
	 * 
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/userInfo/insert", method = RequestMethod.POST)
	public String insert(HttpServletRequest request, HttpServletResponse response) {
		// 获取对象信息
		String name = request.getParameter("uName");
		String sex = request.getParameter("uSex");
		String mobilePhone = request.getParameter("uMobilePhone");
		String idCard = request.getParameter("uIdCard");
		String subordinateUnits = request.getParameter("uSubordinateUnits");
		String batch = request.getParameter("uBatch");

		// 插入信息
		UserInfo userInfo = new UserInfo();
		userInfo.setuName(name);
		userInfo.setuSex(sex);
		userInfo.setuMobilePhone(mobilePhone);
		userInfo.setuIdCard(idCard);
		userInfo.setuSubordinateUnits(subordinateUnits);
		userInfo.setuBatch(batch);

		// 创建准考证号
		String candidateNumber = getCandidateNumber(idCard);
		userInfo.setuCandidateNumber(candidateNumber);
		// 创建准考证密码
		String passowrd = "";
		// 创建生成时间
		Date nowDate = new Date();
		userInfo.setuCreateTime(nowDate);
		// 设置考生状态
		userInfo.setuStatus(ConfigInfo.CANDIDATE_STATUS_NORMAL);

		log.info("------- insert 新建考生信息 paramter: name=" + name + " ,sex=" + sex + " ,mobilePhone=" + mobilePhone
				+ " ,idCard=" + idCard + " ,subordinateUnits=" + subordinateUnits + " ,batch=" + batch
				+ " ,candidateNumber=" + candidateNumber + " ,passowrd=" + passowrd + " -------");

		int result = userService.insertUserInfo(userInfo);
		if (result != 0) {
			JSONObject userInfoJson = JSONObject.fromObject(userInfo);
			// 返回结果
			return JSONPackager.jsonObjData(true, userInfoJson, "成功");
		} else {
			return JSONPackager.jsonObjData(false, null, "考生信息新增失败");
		}
	}

	/**
	 * 创建准考证号
	 * 
	 * @return
	 */
	private String getCandidateNumber(String idCard) {
		String date = getYearAndMonth();
		String cardNumber = idCard.substring(0, 3);
		String dateAndCardNumber = date + cardNumber;
		String candidateNumber = userService.getCandidateNumber(dateAndCardNumber);
		return candidateNumber;
	}

	/**
	 * 获得当前年月信息，用户组装准考证号
	 * 
	 * @return
	 */
	private String getYearAndMonth() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateNowStr = sdf.format(now);
		String[] strs = dateNowStr.split("-");
		String year = strs[0].substring(2, 4);
		String month = strs[1];
		String result = year + month;
		log.info("------ getYearAndMonth 返回结果：" + result + " ------");
		return result;
	}
}
