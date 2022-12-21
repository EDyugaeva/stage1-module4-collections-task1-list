package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> resultLinkedList = new LinkedList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) % 2 != 0) {
                resultLinkedList.addFirst(sourceList.get(i));
            }
            if (sourceList.get(i) % 2 == 0) {
                resultLinkedList.addLast(sourceList.get(i));
            }
        }

        return resultLinkedList;
    }
}
