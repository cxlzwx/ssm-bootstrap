package com.it.ssm.dao;

import com.it.ssm.pojo.TblDept;
import com.it.ssm.pojo.TblDeptExample;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TblDeptMapper {
    int countByExample(TblDeptExample example);

    int deleteByExample(TblDeptExample example);

    int deleteByPrimaryKey(Integer deptId);

    int insert(TblDept record);

    int insertSelective(TblDept record);

    List<TblDept> selectByExample(TblDeptExample example);

    TblDept selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(TblDept record);

    int updateByPrimaryKey(TblDept record);
}