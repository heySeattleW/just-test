package com.hey.justtest.new1.dao;

import com.hey.justtest.dao.BaseDao;
import com.hey.justtest.new1.entity.Test1;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TestDao
 * @Author liuzai
 * @Date 2019/7/16 20:41
 **/
@Repository
public class TestDao1 extends BaseDao {


    public Integer test(List<Test1> list) throws SQLException {
        Map<String, Object> paraMap = new HashMap<>();
        paraMap.put("users", list);
        return (Integer) getSqlMapInstance().insert("ProductPriceCustomerModel.savelist", paraMap);
    }

    public Integer testUpdate(int age) throws SQLException {
        Map<String, Object> paraMap = new HashMap<>();
        List<Integer> integers = new ArrayList<>();
        integers.add(age);
        paraMap.put("ages", integers);
        return (Integer) getSqlMapInstance().insert("ProductPriceCustomerModel.update", paraMap);
    }
}
