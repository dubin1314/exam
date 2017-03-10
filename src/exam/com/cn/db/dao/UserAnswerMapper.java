package exam.com.cn.db.dao;

import exam.com.cn.db.model.UserAnswer;
import exam.com.cn.db.model.UserAnswerQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAnswerMapper {
    int countByExample(UserAnswerQuery example);

    int deleteByExample(UserAnswerQuery example);

    int deleteByPrimaryKey(String aId);

    int insert(UserAnswer record);

    int insertSelective(UserAnswer record);

    List<UserAnswer> selectByExample(UserAnswerQuery example);

    UserAnswer selectByPrimaryKey(String aId);

    int updateByExampleSelective(@Param("record") UserAnswer record, @Param("example") UserAnswerQuery example);

    int updateByExample(@Param("record") UserAnswer record, @Param("example") UserAnswerQuery example);

    int updateByPrimaryKeySelective(UserAnswer record);

    int updateByPrimaryKey(UserAnswer record);
}