package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        if (sourceList.size() != 0) {
            for (Integer current : sourceList) {
                if (current % 2 != 0) {
                    linkedList.addFirst(current);
                }
                if (current % 2 == 0) {
                    linkedList.addLast(current);
                }
            }
        }
        return linkedList;
    }
}
