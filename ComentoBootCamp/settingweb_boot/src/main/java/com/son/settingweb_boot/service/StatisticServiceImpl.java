package com.son.settingweb_boot.service;

import java.util.*;

import com.son.settingweb_boot.VO.deptVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.son.settingweb_boot.dao.StatisticMapper;

@Service
public class StatisticServiceImpl implements StatisticService {


    @Autowired
    private StatisticMapper uMapper;

    @Override
    public HashMap<String, Object> yearloginNum (String year) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            retVal = uMapper.selectYearLogin(year);
            retVal.put("year", year);
            retVal.put("is_success", true);

        } catch(Exception e) {
            e.getMessage();
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
        }

        return retVal;
    }

    @Override
    public HashMap<String, Object> yearMonthloginNum (String yearMonth) {
        HashMap<String, Object> monthCnt = new HashMap<String,Object>();
        try {
            monthCnt = uMapper.selectMonthLogin(yearMonth);
            monthCnt.put("yearMonth", yearMonth);
            monthCnt.put("is_success", true);

        } catch(Exception e) {
            e.getMessage();
            monthCnt.put("totCnt", -999);
            monthCnt.put("yearMonth", yearMonth);
            monthCnt.put("is_success", false);
        }

        return monthCnt;
    }
    @Override
    public HashMap<String, Object> yearMonthDayloginNum (String yearMonthDay) {
        HashMap<String, Object> dayCnt = new HashMap<String,Object>();
        try {
            dayCnt = uMapper.selectDayLogin(yearMonthDay);
            dayCnt.put("yearMonthDay", yearMonthDay);
            dayCnt.put("is_success", true);

        } catch(Exception e) {
            e.getMessage();
            dayCnt.put("totCnt", -999);
            dayCnt.put("yearMonthDay", yearMonthDay);
            dayCnt.put("is_success", false);
        }

        return dayCnt;
    }

    public HashMap<String, Object> dayAvgLoginNum() {
        HashMap<String, Object> valueAvg = new HashMap<String,Object>();
        try {
            valueAvg = uMapper.selectAvgDayLogin();
            valueAvg.put("is_success", true);
        } catch (Exception e) {
            e.getMessage();
            valueAvg.put("totCnt", -999.0);
            valueAvg.put("is_success", false);
        }
        return valueAvg;
    }

    public List<HashMap<String, Object>> deptMonthLoginNum(String yearMonth) {
        List<HashMap<String, Object>> resultList = new ArrayList<>();
        try {
            List<deptVO> rawDataList = uMapper.selectDeptMonthLogin(yearMonth);
            for (int i=0; i<rawDataList.size();i++) {
                HashMap<String, Object> valueDept = new HashMap<String, Object>();
//                System.out.println(rawDataList.get(i).getHr());
//                System.out.println(rawDataList.get(i).getMlc());
                valueDept.put("totCnt", rawDataList.get(i).getMlc());
                valueDept.put("Dept", rawDataList.get(i).getHr());
                valueDept.put("is_success", true);
                resultList.add(valueDept);
                System.out.println(resultList);
            }

        } catch (Exception e) {
            e.getMessage();
            HashMap<String, Object> valueDept = new HashMap<String, Object>();
            valueDept.put("totCnt", -999.0);
            valueDept.put("Dept", "none");
            valueDept.put("is_success", false);
            resultList.add(valueDept);
        }

        return resultList;
    }

    public HashMap<String, Object> exceptHoliday() {
        HashMap<String, Object> valueHoliy = new HashMap<String,Object>();
        try {
            valueHoliy = uMapper.selectExceptHoliyDay();
            valueHoliy.put("is_success", true);
        } catch (Exception e) {
            e.getMessage();
            valueHoliy.put("totCnt", -999.0);
            valueHoliy.put("is_success", false);
        }
        return valueHoliy;
    }

}