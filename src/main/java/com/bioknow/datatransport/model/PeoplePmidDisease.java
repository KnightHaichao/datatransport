package com.bioknow.datatransport.model;

public class PeoplePmidDisease {

    private int id;

    private String pmid;

    private String ptEn;

    private String ptCn;

    private int yearNum;

    private int modifydate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }

    public String getPtEn() {
        return ptEn;
    }

    public void setPtEn(String ptEn) {
        this.ptEn = ptEn;
    }

    public String getPtCn() {
        return ptCn;
    }

    public void setPtCn(String ptCn) {
        this.ptCn = ptCn;
    }

    public int getYearNum() {
        return yearNum;
    }

    public void setYearNum(int yearNum) {
        this.yearNum = yearNum;
    }

    public int getModifydate() {
        return modifydate;
    }

    public void setModifydate(int modifydate) {
        this.modifydate = modifydate;
    }
}
