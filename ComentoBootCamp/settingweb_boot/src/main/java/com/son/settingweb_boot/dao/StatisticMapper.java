package com.son.settingweb_boot.dao;
import com.son.settingweb_boot.VO.deptVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);

    public HashMap<String, Object> selectMonthLogin(String yearMonth);

    public HashMap<String, Object> selectDayLogin(String yearMonth);

    public HashMap<String, Object> selectAvgDayLogin();

    public List<deptVO> selectDeptMonthLogin(String yearMonth);

    public HashMap<String, Object> selectExceptHoliyDay();


}