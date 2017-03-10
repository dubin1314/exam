package exam.com.cn.db.dao;

import exam.com.cn.db.model.PrivilegeInfo;
import exam.com.cn.db.model.PrivilegeInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrivilegeInfoMapper {
    int countByExample(PrivilegeInfoQuery example);

    int deleteByExample(PrivilegeInfoQuery example);

    int deleteByPrimaryKey(String pId);

    int insert(PrivilegeInfo record);

    int insertSelective(PrivilegeInfo record);

    List<PrivilegeInfo> selectByExample(PrivilegeInfoQuery example);

    PrivilegeInfo selectByPrimaryKey(String pId);

    int updateByExampleSelective(@Param("record") PrivilegeInfo record, @Param("example") PrivilegeInfoQuery example);

    int updateByExample(@Param("record") PrivilegeInfo record, @Param("example") PrivilegeInfoQuery example);

    int updateByPrimaryKeySelective(PrivilegeInfo record);

    int updateByPrimaryKey(PrivilegeInfo record);
}