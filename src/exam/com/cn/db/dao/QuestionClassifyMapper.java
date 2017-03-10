package exam.com.cn.db.dao;

import exam.com.cn.db.model.QuestionClassify;
import exam.com.cn.db.model.QuestionClassifyQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionClassifyMapper {
    int countByExample(QuestionClassifyQuery example);

    int deleteByExample(QuestionClassifyQuery example);

    int deleteByPrimaryKey(String cId);

    int insert(QuestionClassify record);

    int insertSelective(QuestionClassify record);

    List<QuestionClassify> selectByExample(QuestionClassifyQuery example);

    QuestionClassify selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") QuestionClassify record, @Param("example") QuestionClassifyQuery example);

    int updateByExample(@Param("record") QuestionClassify record, @Param("example") QuestionClassifyQuery example);

    int updateByPrimaryKeySelective(QuestionClassify record);

    int updateByPrimaryKey(QuestionClassify record);
}