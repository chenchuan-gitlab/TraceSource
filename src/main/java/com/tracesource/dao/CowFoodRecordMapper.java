package com.tracesource.dao;

import com.tracesource.pojo.CowFood;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CowFoodRecordMapper {
    CowFood getRecordByID(@Param("id") int id);

    int createRecord(CowFood cowFood);

    List<CowFood> getRecordList(Map<String,Object> paramsMap);

    int updateRecord(CowFood cowFood);
}
