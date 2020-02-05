package com.obj.sell.service;


import com.obj.sell.dataobject.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    // id查询
    ProductCategory findById(Integer id);

    // 查询所有
    List<ProductCategory> findAll();

    // type查询
    List<ProductCategory> findByCategoryTypeIn(List<Integer> typeIds);

    // 保存新的商品种类
    ProductCategory save(ProductCategory productCategory);


}
