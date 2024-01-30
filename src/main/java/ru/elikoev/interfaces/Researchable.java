package ru.elikoev.interfaces;

import ru.elikoev.classes.animals.Animal;
import ru.elikoev.classes.clinic.personal.Doctor;

public interface Researchable {
    void researchAnimal(Doctor doctor, Animal animal);
}
