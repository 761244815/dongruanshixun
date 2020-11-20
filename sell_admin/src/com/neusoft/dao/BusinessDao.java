package com.neusoft.dao;

import com.neusoft.domain.Business;

import java.util.List;

public interface BusinessDao {
    // 所有商家列表
    public List<Business> listBusiness();
    //保存商家
     //public int saveBusiness(Business business);
     public int saveBusiness(String businessName) ;
    // 删除商家
    public int removeBusiness(int businessId ) ;
    // 修改商家
    public int updateBusiness(Business business);
    //通过id查询
    public Business getBusinessById(Integer businessId);

}