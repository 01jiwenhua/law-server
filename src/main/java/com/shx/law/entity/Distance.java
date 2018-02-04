package com.shx.law.entity;

public class Distance {
    private Integer id;

    private Integer deviceInId;

    private Integer structureOutId;

    private String distance;

    private String instruction;

    private String standard;

    private String tableNo;

    private Integer noteId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceInId() {
        return deviceInId;
    }

    public void setDeviceInId(Integer deviceInId) {
        this.deviceInId = deviceInId;
    }

    public Integer getStructureOutId() {
        return structureOutId;
    }

    public void setStructureOutId(Integer structureOutId) {
        this.structureOutId = structureOutId;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance == null ? null : distance.trim();
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getTableNo() {
        return tableNo;
    }

    public void setTableNo(String tableNo) {
        this.tableNo = tableNo == null ? null : tableNo.trim();
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }
}