package com.chatelaincedric.adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AdventOfCode01 {
    public int fixExpenseReport(int[] expenseReport) {
        int fixedExpanseReport = -1;

        for (int num:expenseReport) {
            for (int num2:expenseReport) {
                if(num + num2 == 2020) fixedExpanseReport = num * num2;
            }
        }

        return fixedExpanseReport;
    }

    public ArrayList<Integer> readExpanseReportFromFile(String file) {
        ArrayList<Integer> expanseReport = new ArrayList<Integer>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while(line != null) {
                expanseReport.add(Integer.parseInt(line));
                line = reader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return expanseReport;
    }
}
