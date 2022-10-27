package org.example;

import java.util.ArrayList;
import java.util.List;

public class RecordMutableList {

    record Range(int begin, int end, List<Integer> numbers){
        Range(int begin, int end, List<Integer> numbers) {
            if(end < begin){
                throw new IllegalStateException("Not valid");
            }
            this.begin = begin;
            this.end = end;
            this.numbers = List.copyOf(numbers);
        }
    }

    public static void main(String[] args) {
        Range range = new Range(-5, 5, new ArrayList<>());

        System.out.println("range = " + range);
        System.out.println("begin = " + range.begin());
    }

}
