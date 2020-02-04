package com.tracesource.dao;

import com.tracesource.pojo.ProductInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProductInfoMapper {
    ProductInfo getRecordByID(@Param("id") int id);

    int createRecord(ProductInfo productInfo);

    List<ProductInfo> getRecordList(Map<String,Object> paramsMap);

    int updateRecord(ProductInfo productInfo);
}
