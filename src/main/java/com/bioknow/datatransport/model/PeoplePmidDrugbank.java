package com.bioknow.datatransport.model;

public class PeoplePmidDrugbank {

    private int id;

    private String pmid;

    private String ptEn;

    private String ptCn;

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

    public int getModifydate() {
        return modifydate;
    }

    public void setModifydate(int modifydate) {
        this.modifydate = modifydate;
    }
}
