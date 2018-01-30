package com.wj.entity;

/**
 * @author 
 */
public class User {
    private Integer id;
    private String username;
    private String schoolName;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void  setUsername(String username){
        this.username = username;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void  setSchoolNamer(String schoolName){
        this.schoolName = schoolName;
    }
}