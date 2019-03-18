package cn.wengsj.gpmsserver.model;

import java.util.Date;

/**
 * 用户实体类
 * @author wengs
 */


public class User {
    private Integer id;
    private String name;
    private String major;
    private String institute;
    private String grade;
    private String type;
    private Date registerTime;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
