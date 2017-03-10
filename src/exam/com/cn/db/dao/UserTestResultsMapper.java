package exam.com.cn.db.dao;

import exam.com.cn.db.model.UserTestResults;
import exam.com.cn.db.model.UserTestResultsQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTestResultsMapper {
    int countByExample(UserTestResultsQuery example);

    int deleteByExample(UserTestResultsQuery example);

    int deleteByPrimaryKey(String uId);

    int insert(UserTestResults record);

    int insertSelective(UserTestResults record);

    List<UserTestResults> selectByExample(UserTestResultsQuery example);

    UserTestResults selectByPrimaryKey(String uId);

    int updateByExampleSelective(@Param("record") UserTestResults record, @Param("example") UserTestResultsQuery example);

    int updateByExample(@Param("record") UserTestResults record, @Param("example") UserTestResultsQuery example);

    int updateByPrimaryKeySelective(UserTestResults record);

    int updateByPrimaryKey(UserTestResults record);
}