package com.shx.law.vo.request;

/**
 * 建筑物请求实体
 *
 * @author zmh
 * @create 2018-02-06 21:08
 **/
public class ArchitectureRequest {
    private String name;
    private String parentCode;
    private String standard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
