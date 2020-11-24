package com.neusoft.dao;

import com.neusoft.domain.Business;

import java.util.List;

public interface BusinessDao {
    // 所有商家列表
    public List<Business> listBusiness(String businiessName,String businessAddress);
    //保存商家
    //当前商家列表
    public List<Business> listThisBusiness(Integer businessId);
     //public int saveBusiness(Business business);
     public int saveBusiness(String businessName) ;
    // 删除商家
    public int removeBusiness(int businessId ) ;
    // 修改商家
    public int updateBusiness(Business business);
    //通过id查询
    public Business getBusinessById(Integer businessId);
    //通过id和password进行查询返回Business对象
    public Business getBusinessByIdAndPassword(Integer businessId,String password);
    //更新密码
    public int updateBusinessPassword(Integer businessId,String password);
}