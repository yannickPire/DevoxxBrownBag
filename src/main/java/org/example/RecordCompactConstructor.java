package org.example;

import java.util.ArrayList;
import java.util.List;

public class RecordCompactConstructor {

    record Range(int begin, int end){
        Range {
            if (end < begin) {
                throw new IllegalStateException("Not valid");
            }
        }

        Range(int end){
            this(0, end);
        }
    }

    public static void main(String[] args) {
        Range range = new Range(-5, 5);

        System.out.println("range = " + range);
        System.out.println("begin = " + range.begin());
    }

}
