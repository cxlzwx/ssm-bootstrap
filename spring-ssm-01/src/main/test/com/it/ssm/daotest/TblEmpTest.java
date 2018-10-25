package com.it.ssm.daotest;

import com.it.ssm.dao.TblEmpMapper;
import com.it.ssm.pojo.TblEmp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Think on 2018/5/4.
 */
public class TblEmpTest {

    @Test
    public void testFindTblEmp() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/application*.xml");
        TblEmpMapper bean = context.getBean(TblEmpMapper.class);
        List<TblEmp> tblEmps = bean.selectByExample(null);
        for (TblEmp t: tblEmps) {
            if(t.getdId()<50) {
                System.out.println(t.getEmpName());
            }
        }


    }
}
