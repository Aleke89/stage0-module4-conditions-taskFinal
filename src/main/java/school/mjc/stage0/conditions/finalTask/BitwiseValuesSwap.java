package school.mjc.stage0.conditions.finalTask;

import java.sql.SQLOutput;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first = first^second;
       second = first^second;
       first = second^first;
        System.out.println(first);
        System.out.println(second);
    }
}
