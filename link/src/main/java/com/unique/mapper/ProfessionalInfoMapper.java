package com.unique.mapper;

import com.unique.pojo.ProfessionalInfo;
import com.unique.pojo.ProfessionalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfessionalInfoMapper {
    int countByExample(ProfessionalInfoExample example);

    int deleteByExample(ProfessionalInfoExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(ProfessionalInfo record);

    int insertSelective(ProfessionalInfo record);

    List<ProfessionalInfo> selectByExampleWithBLOBs(ProfessionalInfoExample example);

    List<ProfessionalInfo> selectByExample(ProfessionalInfoExample example);

    ProfessionalInfo selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") ProfessionalInfo record, @Param("example") ProfessionalInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ProfessionalInfo record, @Param("example") ProfessionalInfoExample example);

    int updateByExample(@Param("record") ProfessionalInfo record, @Param("example") ProfessionalInfoExample example);

    int updateByPrimaryKeySelective(ProfessionalInfo record);

    int updateByPrimaryKeyWithBLOBs(ProfessionalInfo record);

    int updateByPrimaryKey(ProfessionalInfo record);
}