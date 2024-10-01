package com.reshmaboutique;

import com.reshmaboutique.Boutique;
import java.util.Comparator;

public class csort implements Comparator<Boutique> {
    @Override
    public int compare(Boutique b1, Boutique b2) {
        return Integer.compare(b1.getDress_cost(), b2.getDress_cost());
    }
}
