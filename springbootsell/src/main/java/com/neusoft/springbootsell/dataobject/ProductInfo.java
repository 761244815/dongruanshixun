package com.neusoft.springbootsell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * 商品详情
 */
@Entity
@Data
public class ProductInfo {

    /** 商品Id*/
     @Id
    private String productId;

    /** 商品名字*/
    private String productName;

    /** 单价*/
    private BigDecimal productPrice;

    /** 库存*/
    private Integer productStock;

    /** 描述*/
    private String productDescription;

    /** 小图*/
    private String porductIcon;

    /** 状态 0正常 1下架*/
    private Integer productStatus = 0;

    /** 类目编号*/
    private Integer categoryType;

    /** 创建时间*/
    private Date createrTime;

    /** 更新时间*/
    private Date updateTime;


}
