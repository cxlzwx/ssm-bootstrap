package com.it.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.ssm.dao.TblEmpMapper;
import com.it.ssm.pojo.TblEmp;

import javax.annotation.Resource;

/**
 * <p>Title: EmpService.java</p>
 * <p>Description: </p>
 * <p>Copyrightopyrigh: Ct (c) 2018</p>
 * <p>Company: </p>
 *
 * @author thinkc
 * @version 1.0
 * @date 2018年4月30日
 */
@Service
public class EmpService {

    @Autowired
    private TblEmpMapper tblEmpMapper;

    /**
     *
     * @return·
     */
    public List<TblEmp> findPageList() {
        return tblEmpMapper.selectByExampleWithDept(null);
    }


}





