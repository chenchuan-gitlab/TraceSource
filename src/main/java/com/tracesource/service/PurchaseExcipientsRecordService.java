package com.tracesource.service;

import com.tracesource.pojo.PurchaseExcipientsRecord;

import java.util.List;
import java.util.Map;

public interface PurchaseExcipientsRecordService {
    PurchaseExcipientsRecord getRecordByBatch(String purchase_batch);

    int createRecord(PurchaseExcipientsRecord purchaseExcipientsRecord);

    List<PurchaseExcipientsRecord> getRecordList(Map<String,Object> paramsMap);
}
