package com.obj.sell.repository;

import com.obj.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;


    @Test
    public void testFindOne(){
        ProductCategory category = productCategoryRepository.findOne(1);
        System.out.println(category.toString());

        // 修改数据
        category.setCategoryType(5);
        productCategoryRepository.save(category);
    }

    @Test
    @Transactional // 事务注解，如果是非测试类，报错回滚， 测试类则都会回滚
    public void testSave(){
//        productcategory category = new Productcategory();
//        category.setcategoryname("美女最爱");
//        category.setcategorytype(2);
//        productcategoryrepository.save(category);

        ProductCategory category = new ProductCategory();
        category.setCategoryName("男士最爱");
        category.setCategoryType(3);
        ProductCategory category1 = productCategoryRepository.save(category);
        Assert.assertNotNull(category1);
    }

    @Test
    public void testFindByCategoryTypeIds(){

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<ProductCategory> productCategories = productCategoryRepository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, productCategories.size());
    }
}