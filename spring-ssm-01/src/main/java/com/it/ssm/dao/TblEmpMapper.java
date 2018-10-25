package com.it.ssm.dao;

import com.it.ssm.pojo.TblEmp;
import com.it.ssm.pojo.TblEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface TblEmpMapper {
	int countByExample(TblEmpExample example);

	int deleteByExample(TblEmpExample example);

	int deleteByPrimaryKey(Integer empId);

	int insert(TblEmp record);

	int insertSelective(TblEmp record);

	List<TblEmp> selectByExample(TblEmpExample example);

	TblEmp selectByPrimaryKey(Integer empId);

	// 带有部门信息的查询
	List<TblEmp> selectByExampleWithDept(TblEmpExample example);

	// 带有部门信息的查询，得到一个对象
	TblEmp selectByPrimaryKeyWithDept(Integer empId);

	int updateByExampleSelective(@Param("record") TblEmp record, @Param("example") TblEmpExample example);

	int updateByExample(@Param("record") TblEmp record, @Param("example") TblEmpExample example);

	int updateByPrimaryKeySelective(TblEmp record);

	int updateByPrimaryKey(TblEmp record);
}