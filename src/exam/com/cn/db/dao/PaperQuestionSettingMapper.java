package exam.com.cn.db.dao;

import exam.com.cn.db.model.PaperQuestionSetting;
import exam.com.cn.db.model.PaperQuestionSettingQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperQuestionSettingMapper {
    int countByExample(PaperQuestionSettingQuery example);

    int deleteByExample(PaperQuestionSettingQuery example);

    int deleteByPrimaryKey(String pId);

    int insert(PaperQuestionSetting record);

    int insertSelective(PaperQuestionSetting record);

    List<PaperQuestionSetting> selectByExample(PaperQuestionSettingQuery example);

    PaperQuestionSetting selectByPrimaryKey(String pId);

    int updateByExampleSelective(@Param("record") PaperQuestionSetting record, @Param("example") PaperQuestionSettingQuery example);

    int updateByExample(@Param("record") PaperQuestionSetting record, @Param("example") PaperQuestionSettingQuery example);

    int updateByPrimaryKeySelective(PaperQuestionSetting record);

    int updateByPrimaryKey(PaperQuestionSetting record);
}