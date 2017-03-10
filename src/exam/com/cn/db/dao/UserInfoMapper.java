package exam.com.cn.db.dao;

import exam.com.cn.db.model.UserInfo;
import exam.com.cn.db.model.UserInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    int countByExample(UserInfoQuery example);

    int deleteByExample(UserInfoQuery example);

    int deleteByPrimaryKey(String uId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoQuery example);

    UserInfo selectByPrimaryKey(String uId);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoQuery example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoQuery example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    UserInfo selectByDateAndCardNumber(@Param("dateAndCardNumber") String dateAndCardNumber);
}