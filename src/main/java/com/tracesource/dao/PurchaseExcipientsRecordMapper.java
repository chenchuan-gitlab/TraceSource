package com.tracesource.dao;

import com.tracesource.pojo.PurchaseExcipientsRecord;

import java.util.List;
import java.util.Map;

public interface PurchaseExcipientsRecordMapper {
    PurchaseExcipientsRecord getRecordByBatch(String purchase_batch);

    int createRecord(PurchaseExcipientsRecord purchaseExcipientsRecord);

    List<PurchaseExcipientsRecord> getRecordList(Map<String,Object> paramsMap);

}
