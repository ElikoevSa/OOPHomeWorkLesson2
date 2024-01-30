package ru.elikoev.classes.clinic.personal;

public class Doctor extends Personal{
    Nurse nurse;

    public Doctor() {
    }

    public Doctor(String name, char sex, int age, Nurse nurse) {
        super(name, sex, age);
        this.nurse = nurse;
    }
}
