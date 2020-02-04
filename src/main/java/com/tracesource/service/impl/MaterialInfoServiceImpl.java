package com.tracesource.service.impl;

import com.tracesource.dao.MaterialInfoMapper;
import com.tracesource.pojo.MaterialInfo;
import com.tracesource.service.MaterialInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MaterialInfoServiceImpl implements MaterialInfoService {

    @Autowired
    private MaterialInfoMapper materialInfoMapper;


    @Override
    public MaterialInfo getRecordByBatch(String material_batch) {
        return materialInfoMapper.getRecordByBatch(material_batch);
    }

    @Override
    public int createRecord(MaterialInfo materialInfo) {
        return materialInfoMapper.createRecord(materialInfo);
    }

    @Override
    public List<MaterialInfo> getRecordList(Map<String, Object> paramsMap) {
        return materialInfoMapper.getRecordList(paramsMap);
    }
}
