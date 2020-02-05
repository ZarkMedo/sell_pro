package com.obj.sell.service.impl;

import com.obj.sell.dataobject.ProductCategory;
import com.obj.sell.repository.ProductCategoryRepository;
import com.obj.sell.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: ProductCategoryServiceImpl
 * @Auther: medo
 * @Date: 2020-02-05 20:36
 * @Description: TODO
 **/
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryRepository categoryRepository;

    @Override
    public ProductCategory findById(Integer id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public List<ProductCategory> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> typeIds) {
        return categoryRepository.findByCategoryTypeIn(typeIds);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return categoryRepository.save(productCategory);
    }
}
