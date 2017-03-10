package exam.com.cn.db.dao;

import exam.com.cn.db.model.SystemAdmin;
import exam.com.cn.db.model.SystemAdminQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemAdminMapper {
    int countByExample(SystemAdminQuery example);

    int deleteByExample(SystemAdminQuery example);

    int deleteByPrimaryKey(String sId);

    int insert(SystemAdmin record);

    int insertSelective(SystemAdmin record);

    List<SystemAdmin> selectByExample(SystemAdminQuery example);

    SystemAdmin selectByPrimaryKey(String sId);

    int updateByExampleSelective(@Param("record") SystemAdmin record, @Param("example") SystemAdminQuery example);

    int updateByExample(@Param("record") SystemAdmin record, @Param("example") SystemAdminQuery example);

    int updateByPrimaryKeySelective(SystemAdmin record);

    int updateByPrimaryKey(SystemAdmin record);
}