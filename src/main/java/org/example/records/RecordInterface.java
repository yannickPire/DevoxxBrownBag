package org.example.records;

import java.util.Iterator;

public class RecordInterface {

    record Range(int begin, int end) implements Iterable<Integer> {
        Range {
            if (end < begin) {
                throw new IllegalStateException("Not valid");
            }
        }

        Range(int end){
            this(0, end);
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<>() {
                int index = begin;
                @Override
                public boolean hasNext() {
                    return index < end;
                }

                @Override
                public Integer next() {
                    return index++;
                }
            };
        }
    }

    public static void main(String[] args) {
        Range range = new Range(0, 5);

        System.out.println("range = " + range);
//        System.out.println("begin = " + range.begin());

        for(int value : range){
            System.out.println("value = " + value);
        }
    }

}
