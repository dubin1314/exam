package exam.com.cn.db.dao;

import exam.com.cn.db.model.Question;
import exam.com.cn.db.model.QuestionQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionMapper {
    int countByExample(QuestionQuery example);

    int deleteByExample(QuestionQuery example);

    int deleteByPrimaryKey(String qId);

    int insert(Question record);

    int insertSelective(Question record);

    List<Question> selectByExample(QuestionQuery example);

    Question selectByPrimaryKey(String qId);

    int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionQuery example);

    int updateByExample(@Param("record") Question record, @Param("example") QuestionQuery example);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}