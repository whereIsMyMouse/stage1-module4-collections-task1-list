package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        if (!(sourceList.isEmpty())) {
            ListComparator currentComparator = new ListComparator();
            Collections.sort(sourceList, currentComparator);
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        if (Math.abs(intA) == Math.abs(intB)){
            return Integer.compare(intA, intB);
        } else {
        return Integer.compare(5 * (intA * intA) + 3, 5 * (intB * intB) + 3);
    }
    }
}

