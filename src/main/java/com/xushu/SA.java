package com.xushu;

public class SA {
    private Integer age;
    private String name;

    public SA(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public SA() {

    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String soutAge() {
        return "年龄：" + age;
    }

    public String soutName() {
        return "姓名：" + name;
    }
}
