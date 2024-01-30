package ru.elikoev.classes.clinic.personal;

public abstract class Personal {
    private String name;
    private char sex;
    private int age;
    public Personal() {
    }

    public Personal(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
