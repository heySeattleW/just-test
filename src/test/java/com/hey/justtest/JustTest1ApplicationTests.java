package com.hey.justtest;

import com.hey.justtest.dao.TestDao;
import com.hey.justtest.entity.ProductPriceCustomerModel;
import com.hey.justtest.new1.entity.Test1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JustTest1ApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    TestDao testDao;

    @Autowired
    com.hey.justtest.new1.dao.TestDao1 testDao1;

    @Test
    public void test()throws Exception{
        List<ProductPriceCustomerModel> list = new ArrayList<>();
        ProductPriceCustomerModel model1 = new ProductPriceCustomerModel();
        model1.setCustomerId(1L);
        model1.setProductId(2L);
        ProductPriceCustomerModel model2 = new ProductPriceCustomerModel();
        model2.setCustomerId(1L);
        model2.setProductId(2L);
        testDao.getCustomerPriceCount(list);
    }

    @Test
    public void testInsert() throws SQLException {
        List<Test1> list = new ArrayList<>();
        Test1 test1 = new Test1();
        test1.setName("hey");
        test1.setAge(new BigDecimal(-2147483648));
        Test1 test11 = new Test1();
        test11.setName("hey");
        test11.setAge(new BigDecimal(-2147483648.00));
        list.add(test1);
        list.add(test11);
        testDao1.test(list);
    }

    @Test
    public void testUpdate()throws Exception{
        testDao1.testUpdate(22);
    }

}
