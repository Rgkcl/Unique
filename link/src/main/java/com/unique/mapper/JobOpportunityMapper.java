package com.unique.mapper;

import com.unique.pojo.JobOpportunity;
import com.unique.pojo.JobOpportunityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobOpportunityMapper {
    int countByExample(JobOpportunityExample example);

    int deleteByExample(JobOpportunityExample example);

    int deleteByPrimaryKey(Integer jid);

    int insert(JobOpportunity record);

    int insertSelective(JobOpportunity record);

    List<JobOpportunity> selectByExampleWithBLOBs(JobOpportunityExample example);

    List<JobOpportunity> selectByExample(JobOpportunityExample example);

    JobOpportunity selectByPrimaryKey(Integer jid);

    int updateByExampleSelective(@Param("record") JobOpportunity record, @Param("example") JobOpportunityExample example);

    int updateByExampleWithBLOBs(@Param("record") JobOpportunity record, @Param("example") JobOpportunityExample example);

    int updateByExample(@Param("record") JobOpportunity record, @Param("example") JobOpportunityExample example);

    int updateByPrimaryKeySelective(JobOpportunity record);

    int updateByPrimaryKeyWithBLOBs(JobOpportunity record);

    int updateByPrimaryKey(JobOpportunity record);
}