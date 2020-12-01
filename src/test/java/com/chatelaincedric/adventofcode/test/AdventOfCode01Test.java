package com.chatelaincedric.adventofcode.test;

import com.chatelaincedric.adventofcode.AdventOfCode01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdventOfCode01Test {

    @Test
    public void expenseReportPass() {
        int[] expenseReport = {1721, 979, 366, 299, 675, 1456};
        AdventOfCode01 adv = new AdventOfCode01();
        int answer = adv.fixExpenseReport(expenseReport);
        Assertions.assertEquals(answer, 514579);
    }
}