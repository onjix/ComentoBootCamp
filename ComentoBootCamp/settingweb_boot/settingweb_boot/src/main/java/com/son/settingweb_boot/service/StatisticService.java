package com.son.settingweb_boot.service;

import java.util.HashMap;

public interface StatisticService {
    public HashMap<String,Object> yearloginNum (String year);
    public HashMap<String,Object> yearMonthloginNum (String yearMonth);
    public HashMap<String,Object> yearMonthDayloginNum (String yearMonthDay);
    public HashMap<String, Object> dayAvgLoginNum();

}
