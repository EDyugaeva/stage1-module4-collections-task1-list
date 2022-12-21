package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {

        Collections.sort(sourceList, new ListComparator());

    }

}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);

        int aResult = 5 * aInt * aInt + 3;
        int bResult = 5 * bInt * bInt + 3;

        if (aResult > bResult) {    // a > b

            return 1;
        }

        if (aResult < bResult) {    // a < b
            return -1;
        }
        return Integer.compare(aInt, bInt);

    }
}
