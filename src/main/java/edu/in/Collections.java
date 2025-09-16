package edu.in;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        Map<String, String> nameMap = new HashMap<>();

        nameMap.put("vinoth", "1st");
        nameMap.put("vinoth", "2nd");
        nameMap.get("vnoth");
        // hashcode and equals method


        for (Map.Entry<String, String> namMap : nameMap.entrySet()) {
            System.out.println(namMap.getKey()+":"+namMap.getValue());
        }
    }
    /**
     * 1. Arrays:
     * Nature: Fixed-size, contiguous block of memory.
     * Internal Structure: Directly stores elements in a sequence.
     * Access: Fast random access (O(1)) using an index.
     * Insertion/Deletion: Inefficient (O(n)) as it requires shifting elements.
     * Size: Fixed at creation, cannot be dynamically resized.
     * 2. ArrayList:
     * Nature: Dynamic array, part of the Java Collections Framework.
     * Internal Structure: Uses a resizable array internally.
     * Access: Fast random access (O(1)) using an index.
     * Insertion/Deletion: Can be inefficient (O(n)) for elements in the middle or beginning,
     * as it may involve array resizing and shifting. Efficient (O(1)) for adding at the end.
     * Size: Dynamically resizable; it automatically manages its capacity.
     * 3. LinkedList:
     * Nature: Doubly linked list, part of the Java Collections Framework.
     * Internal Structure: Stores elements as nodes, each containing data and
     * references to the previous and next nodes.
     * Access: Slow random access (O(n)) as it requires traversing the list from the beginning or end.
     * Insertion/Deletion: Efficient (O(1)) for adding or removing elements at the beginning, end, or
     * middle (once the position is found) by simply manipulating pointers.
     * Size: Dynamically resizable.
     * 4. HashMap:
     * Nature: Implements the Map interface, stores key-value pairs.
     * Internal Structure: Uses a hash table for efficient storage and retrieval.
     * Access: Fast retrieval (average O(1)) using a key, assuming a good hash function and minimal
     * collisions.
     * Insertion/Deletion: Fast (average O(1)) for adding or removing key-value pairs.
     * Order: Does not guarantee any specific order of elements.
     * Uniqueness: Keys must be unique.
     * Summary of Key Differences:
     * Data Storage: Arrays and ArrayLists store elements in contiguous memory
     * (conceptually for ArrayList), while LinkedList uses a node-based structure with pointers,
     * and HashMap uses a hash table.
     * Size Flexibility: Arrays are fixed-size; ArrayList, LinkedList, and HashMap are dynamic.
     * Access Performance: Arrays and ArrayList offer fast random access; LinkedList is slow for
     * random access; HashMap offers fast key-based retrieval.
     * Insertion/Deletion Performance: LinkedList excels at insertions/deletions;
     * Arrays and ArrayList can be slow for middle insertions/deletions. HashMap is fast for
     * adding/removing key-value pairs.
     * Purpose: Arrays and ArrayList are suitable for ordered collections where indexing is important.
     * LinkedList is ideal for frequent insertions/deletions. HashMap is designed for mapping keys to
     * values and fast lookups.
     */
}
