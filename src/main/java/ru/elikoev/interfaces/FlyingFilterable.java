package ru.elikoev.interfaces;

import ru.elikoev.classes.animals.Animal;

import java.util.List;

public interface FlyingFilterable {
    void flyFiltered(List<Animal> animals);
}
