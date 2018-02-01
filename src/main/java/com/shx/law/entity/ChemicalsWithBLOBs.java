package com.shx.law.entity;

public class ChemicalsWithBLOBs extends Chemicals {
    private String nameEn;

    private String aliasEn;

    private String solubility;

    private String operational;

    private String dangerousType;

    private String skinContact;

    private String outfire;

    private String handProtection;

    private String other;

    private String stability;

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getAliasEn() {
        return aliasEn;
    }

    public void setAliasEn(String aliasEn) {
        this.aliasEn = aliasEn == null ? null : aliasEn.trim();
    }

    public String getSolubility() {
        return solubility;
    }

    public void setSolubility(String solubility) {
        this.solubility = solubility == null ? null : solubility.trim();
    }

    public String getOperational() {
        return operational;
    }

    public void setOperational(String operational) {
        this.operational = operational == null ? null : operational.trim();
    }

    public String getDangerousType() {
        return dangerousType;
    }

    public void setDangerousType(String dangerousType) {
        this.dangerousType = dangerousType == null ? null : dangerousType.trim();
    }

    public String getSkinContact() {
        return skinContact;
    }

    public void setSkinContact(String skinContact) {
        this.skinContact = skinContact == null ? null : skinContact.trim();
    }

    public String getOutfire() {
        return outfire;
    }

    public void setOutfire(String outfire) {
        this.outfire = outfire == null ? null : outfire.trim();
    }

    public String getHandProtection() {
        return handProtection;
    }

    public void setHandProtection(String handProtection) {
        this.handProtection = handProtection == null ? null : handProtection.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getStability() {
        return stability;
    }

    public void setStability(String stability) {
        this.stability = stability == null ? null : stability.trim();
    }
}