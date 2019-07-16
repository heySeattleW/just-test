package com.hey.justtest;

import com.hey.justtest.dao.TestDao;
import com.hey.justtest.entity.ProductPriceCustomerModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JustTestApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    TestDao testDao;

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

}
