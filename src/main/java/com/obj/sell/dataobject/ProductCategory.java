package com.obj.sell.dataobject;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

// 指定表名
@Table(name = "product_category")
@Entity
// 动态更新， 数据库的修改时间，通过sql自动完成(一旦数据修改，mysql自动修改时间)
@DynamicUpdate
@Data
public class ProductCategory{

    @Id // 指定逐渐
    // 指定主键的变化格式，默认按照AUTO自动查找
    @GeneratedValue
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;


}
