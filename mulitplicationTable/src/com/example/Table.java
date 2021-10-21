package com.example;

public class Table {

    public static void main(String[] args) {
	// table variable setup
        int tableSize = 10;
        int tableColumn;
        int tableRow;

        // print first line
        System.out.printf("%10s", "");
        for (tableColumn = 1; tableColumn <= tableSize; tableColumn++) {
            System.out.printf("%10d",tableColumn);
        }
        System.out.println();

        // print each line
        for (tableRow = 1; tableRow <= tableSize; tableRow++) {
            System.out.printf("%10d",tableRow);
            for (int i = 1; i <= tableSize; i++) {
                System.out.printf("%10d",((i * tableRow)+1));
            }
            System.out.println();
        }
    }
}
