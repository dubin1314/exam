package exam.com.cn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exam.com.cn.db.dao.UserInfoMapper;
import exam.com.cn.db.model.UserInfo;
import exam.com.cn.db.model.UserInfoQuery;
import exam.com.cn.db.model.UserInfoQuery.Criteria;

@Service
public class UserService {
	public static Logger log = Logger.getLogger(UserService.class);
	@Autowired
	UserInfoMapper userInfoMapper;

	/**
	 * 根据用户名和密码，查询第一个用户信息
	 * 
	 * @param candidateNumber
	 * @param password
	 * @return
	 */
	public UserInfo getUserInfo(String candidateNumber, String password) {
		// 设置条件
		UserInfoQuery userInfoQuery = new UserInfoQuery();
		Criteria createCriteria = userInfoQuery.createCriteria();
		createCriteria.andUCandidateNumberEqualTo(candidateNumber);
		createCriteria.andUPasswordEqualTo(password);
		// 查询结果
		List<UserInfo> userInfoList = new ArrayList<UserInfo>();
		userInfoList = userInfoMapper.selectByExample(userInfoQuery);
		// 返回结果
		UserInfo userInfo = null;
		if (userInfoList.size() > 0) {
			userInfo = userInfoList.get(0);
		}
		return userInfo;
	}

	/**
	 * 根据当前年月和身份证号前三位，生成准考证号
	 * 
	 * @param dateAndCardNumber
	 * @return
	 */
	public String getCandidateNumber(String dateAndCardNumber) {
		UserInfo userInfo = null;
		// 查询年月身份证号开头的最后一个人的准考证号，可能没查到，也可能查到
		// 如果查到，则新建考生准考证号需要加1，如果没查到，则从001开始计算
		String param = dateAndCardNumber + "%";
		userInfo = userInfoMapper.selectByDateAndCardNumber(param);
		if (userInfo != null) {
			String candidateNumber = userInfo.getuCandidateNumber() + 1;
			return candidateNumber;
		} else {
			String candidateNumber = dateAndCardNumber + "001";
			return candidateNumber;
		}
	}

	/**
	 * 新增考生信息
	 * 
	 * @param userInfo
	 * @return
	 */
	public int insertUserInfo(UserInfo userInfo) {
		int result = 0;
		UUID uuid = UUID.randomUUID();
		userInfo.setuId(uuid.toString());
		result = userInfoMapper.insert(userInfo);
		return result;
	}
}
