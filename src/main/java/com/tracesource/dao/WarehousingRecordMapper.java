package com.tracesource.dao;

import com.tracesource.pojo.WarehousingRecord;

import java.util.List;
import java.util.Map;

public interface WarehousingRecordMapper {
    WarehousingRecord getWarehousingRecordByBatch(String warehousing_batch);

    int createWarehousingRecord(WarehousingRecord warehousingRecord);

    List<WarehousingRecord> getWarehousingRecordList(Map<String,Object> paramsMap);
}
