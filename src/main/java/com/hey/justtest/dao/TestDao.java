package com.hey.justtest.dao;

import com.hey.justtest.entity.ProductPriceCustomerModel;
import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TestDao
 * @Author liuzai
 * @Date 2019/7/16 20:41
 **/
@Repository
public class TestDao extends BaseDao {


    public Integer getCustomerPriceCount(List<ProductPriceCustomerModel> list) throws SQLException {
        Map<String, Object> paraMap = new HashMap<>();
        paraMap.put("customerPriceModelList", list);
        paraMap.put("dbid", 553194);
        return (Integer) getSqlMapInstance().queryForObject("ProductPriceCustomerModel.getCustomerPriceCount", paraMap);
    }
}
