package ru.elikoev.interfaces;

import ru.elikoev.classes.animals.Animal;
import ru.elikoev.classes.clinic.personal.Nurse;

public interface Injectionable {
void injection (Nurse nurse,Animal animal);
}
