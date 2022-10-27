package org.example.records;

public class Record {

    record Range(int begin, int end){

    }

    public static void main(String[] args) {
        Range range = new Range(0, 5);

        System.out.println("range = " + range);
        System.out.println("begin = " + range.begin());
    }

}
