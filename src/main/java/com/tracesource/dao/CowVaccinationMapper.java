package com.tracesource.dao;

import com.tracesource.pojo.CowVaccination;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CowVaccinationMapper {
    CowVaccination getRecordByID(@Param("id") int id);

    int createRecord(CowVaccination cowVaccination);

    List<CowVaccination> getRecordList(Map<String,Object> paramsMap);

    int updateRecord(CowVaccination cowVaccination);
}
