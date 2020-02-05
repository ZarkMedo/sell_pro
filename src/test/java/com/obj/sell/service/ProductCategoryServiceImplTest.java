package com.obj.sell.service;

import com.obj.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    ProductCategoryService productCategoryService;

    @Test
    public void testServiceFindAll(){
        List<ProductCategory> all = productCategoryService.findAll();
        System.out.println(all);
    }

}