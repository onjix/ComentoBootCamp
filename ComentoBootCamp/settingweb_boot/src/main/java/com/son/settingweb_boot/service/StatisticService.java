package com.son.settingweb_boot.service;

import com.son.settingweb_boot.VO.deptVO;

import java.util.HashMap;
import java.util.List;

public interface StatisticService {
    public HashMap<String,Object> yearloginNum (String year);
    public HashMap<String,Object> yearMonthloginNum (String yearMonth);
    public HashMap<String,Object> yearMonthDayloginNum (String yearMonthDay);
    public HashMap<String, Object> dayAvgLoginNum();

    public List<HashMap<String, Object>> deptMonthLoginNum(String yearMonth);

    public HashMap<String, Object> exceptHoliday();

}
