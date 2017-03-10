package exam.com.cn.db.dao;

import exam.com.cn.db.model.TestPaperInfo;
import exam.com.cn.db.model.TestPaperInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestPaperInfoMapper {
    int countByExample(TestPaperInfoQuery example);

    int deleteByExample(TestPaperInfoQuery example);

    int deleteByPrimaryKey(String tId);

    int insert(TestPaperInfo record);

    int insertSelective(TestPaperInfo record);

    List<TestPaperInfo> selectByExample(TestPaperInfoQuery example);

    TestPaperInfo selectByPrimaryKey(String tId);

    int updateByExampleSelective(@Param("record") TestPaperInfo record, @Param("example") TestPaperInfoQuery example);

    int updateByExample(@Param("record") TestPaperInfo record, @Param("example") TestPaperInfoQuery example);

    int updateByPrimaryKeySelective(TestPaperInfo record);

    int updateByPrimaryKey(TestPaperInfo record);
}