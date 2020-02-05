package com.obj.sell.repository;

import com.obj.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName: ProductCategoryRespository
 * @Auther: medo
 * @Date: 2020-02-05 14:05
 * @Description: TODO
 **/
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    // 新增方法，查询多个type集合，返回多个类目对象集合
//    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
