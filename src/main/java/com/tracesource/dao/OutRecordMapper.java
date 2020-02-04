package com.tracesource.dao;

import com.tracesource.pojo.OutRecord;

import java.util.List;
import java.util.Map;

public interface OutRecordMapper {
    OutRecord getOutRecordByID(String out_number);

    int createOutRecord(OutRecord outRecord);

    List<OutRecord> getOutRecords(Map<String,Object> paramsMap);

}
