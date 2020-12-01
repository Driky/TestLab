package com.chatelaincedric.adventofcode;

import com.chatelaincedric.adventofcode.AdventOfCode01;

public class Start {
    public static void main(String[] args){
        AdventOfCode01 adv = new AdventOfCode01();
        int[] expanseReport = adv.readExpanseReportFromFile(".\\input").stream().mapToInt(i->i).toArray();
        int answer = adv.fixExpenseReport(expanseReport);
        System.out.format("The answer is: %d", answer);
    }
}
