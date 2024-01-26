package com.son.settingweb_boot.VO;

public class deptVO {
    private String hr_organ;
    private String monthlyLoginCount;

    public String getHr() {
        return hr_organ;
    }

    public void setHr(String hr_organ) {
        this.hr_organ = hr_organ;
    }

    public String getMlc() {
        return monthlyLoginCount;
    }

    public void setMlc(String monthlyLoginCount) {
        this.monthlyLoginCount = monthlyLoginCount;
    }
}
