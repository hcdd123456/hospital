package com.hyit.hospital.model;

public class User {

    private Integer id;

    private String username;

    private String password;

    private String realname;

    private Integer usetype;

    private Integer doctitleid;

    private String isscheduling;

    private Integer deptid;

    private Integer registleid;

    private Integer delmark;

    //一对一关联
    private Constantitem constantitem;

    private Department department;

    private Registlevel registlevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getUsetype() {
        return usetype;
    }

    public void setUsetype(Integer usetype) {
        this.usetype = usetype;
    }

    public Integer getDoctitleid() {
        return doctitleid;
    }

    public void setDoctitleid(Integer doctitleid) {
        this.doctitleid = doctitleid;
    }

    public String getIsscheduling() {
        return isscheduling;
    }

    public void setIsscheduling(String isscheduling) {
        this.isscheduling = isscheduling;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getRegistleid() {
        return registleid;
    }

    public void setRegistleid(Integer registleid) {
        this.registleid = registleid;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }

    public Constantitem getConstantitem() {
        return constantitem;
    }

    public void setConstantitem(Constantitem constantitem) {
        this.constantitem = constantitem;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Registlevel getRegistlevel() {
        return registlevel;
    }

    public void setRegistlevel(Registlevel registlevel) {
        this.registlevel = registlevel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", usetype=" + usetype +
                ", doctitleid=" + doctitleid +
                ", isscheduling='" + isscheduling + '\'' +
                ", deptid=" + deptid +
                ", registleid=" + registleid +
                ", delmark=" + delmark +
                ", constantitem=" + constantitem +
                ", department=" + department +
                ", registlevel=" + registlevel +
                '}';
    }
}