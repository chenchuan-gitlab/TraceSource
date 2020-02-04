package com.tracesource.service.impl;

import com.tracesource.dao.CowFoodRecordMapper;
import com.tracesource.pojo.CowFood;
import com.tracesource.service.CowFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CowFoodServiceImpl implements CowFoodService {
    @Autowired
    CowFoodRecordMapper cowFoodRecordMapper;



    @Override
    public CowFood getRecordByID(int id) {
        return cowFoodRecordMapper.getRecordByID(id);
    }

    @Override
    public int createRecord(CowFood cowFood) {
        return cowFoodRecordMapper.createRecord(cowFood);
    }

    @Override
    public List<CowFood> getRecordList(Map<String, Object> paramsMap) {
        return cowFoodRecordMapper.getRecordList(paramsMap);
    }

    @Override
    public int updateRecord(CowFood cowFood) {
        return cowFoodRecordMapper.updateRecord(cowFood);
    }
}
