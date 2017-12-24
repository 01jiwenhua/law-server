package com.shx.law.vo.request;

/**
 * Created by xuan on 2017/12/23.
 */
public class LawRequest extends Request{
    private String name;
    private String issoNo;
    private String typeName;
    private String description;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssoNo() {
        return issoNo;
    }

    public void setIssoNo(String issoNo) {
        this.issoNo = issoNo;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
