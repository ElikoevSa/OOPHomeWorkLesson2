package ru.elikoev.classes.drugstore.interfaces;

import ru.elikoev.classes.drugstore.pharmacys.Pharmacy;

import java.util.Comparator;
import java.util.List;

public interface SortByTotalWeight {
    void  getSortByTotalWeight (List<Pharmacy> pharmacies, Comparator<Pharmacy> comparator);

    }
