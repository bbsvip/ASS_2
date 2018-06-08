package com.bbs.mr.qlsv;

public class Class {
    private String ID;
    private String NAME;
    public Class(){
    }
    public Class(String NAME){
        this.NAME = NAME;
    }
    public Class(String ID, String NAME){
        this.ID = ID;
        this.NAME = NAME;
    }
    public String getId() {
        return ID;
    }
    public void setId(String id) {
        this.ID = id;
    }
    public String getName() {
        return NAME;
    }
    public void setName(String name) {
        this.NAME = name;
    }
    public String toString(){
        return "Id: "+getId()+"/n"+"Name: "+getName();
    }
}
