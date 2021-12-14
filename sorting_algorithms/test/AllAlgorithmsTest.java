package sorting_algorithms.test;

import sorting_algorithms.insert.InsertSort;
import sorting_algorithms.selection.SelectionSort;

public class AllAlgorithmsTest {
    public static void main(String[] args) {
        int[] testArr;

        if (args.length > 0) {
            long seed = Integer.parseInt(args[0]);
            testArr = SortTest.createRandomTestArr(1000, 0, 1337, seed);
        } else {
            testArr = SortTest.createRandomTestArr(1000, 0, 1337);
        }

        SortTest insert = new SortTest(InsertSort.class, testArr);
        SortTest selection = new SortTest(SelectionSort.class, testArr);

        System.out.println("\n### INSERT SORT ###");
        insert.defaultTest();

        System.out.println("\n### SELECTION SORT ###");
        selection.defaultTest();
    }
}
