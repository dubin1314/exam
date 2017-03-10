package exam.com.cn.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exam.com.cn.db.dao.SystemAdminMapper;
import exam.com.cn.db.model.SystemAdmin;
import exam.com.cn.db.model.SystemAdminQuery;
import exam.com.cn.db.model.SystemAdminQuery.Criteria;

@Service
public class AdminService {
	public static Logger log = Logger.getLogger(AdminService.class);
	@Autowired
	SystemAdminMapper systemAdminMapper;

	/**
	 * 根据用户名和密码，查询第一个用户信息
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	public SystemAdmin getAdminInfo(String name, String password) {
		// 设置查询条件
		SystemAdminQuery systemAdminQuery = new SystemAdminQuery();
		Criteria createCriteria = systemAdminQuery.createCriteria();
		createCriteria.andSNameEqualTo(name);
		createCriteria.andSPasswordEqualTo(password);
		// 查询结果
		List<SystemAdmin> systemAdminList = new ArrayList<SystemAdmin>();
		systemAdminList = systemAdminMapper.selectByExample(systemAdminQuery);
		SystemAdmin systemAdmin = null;
		if (systemAdminList.size() > 0) {
			systemAdmin = systemAdminList.get(0);
		}
		return systemAdmin;
	}
}
