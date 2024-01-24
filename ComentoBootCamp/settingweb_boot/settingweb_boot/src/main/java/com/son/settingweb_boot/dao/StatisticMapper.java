package com.son.settingweb_boot.dao;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);

    public HashMap<String, Object> selectMonthLogin(String yearMonth);

    public HashMap<String, Object> selectDayLogin(String yearMonth);

    public HashMap<String, Object> selectAvgDayLogin();


}