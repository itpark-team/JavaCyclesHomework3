package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int currentSalary;
        int sumSalaryForAllWorkers = 0;

        int sumSalaryForCurrentWorker = 0;
        String outputSumSalaryForCurrentWorker = "";

        int sum1Month = 0;
        int sum2Month = 0;
        int sum3Month = 0;

        Random random = new Random();

        for (int i = 1; i <= 12; i++) {

            sumSalaryForCurrentWorker = 0;

            for (int j = 1; j <= 3; j++) {
                currentSalary = random.nextInt(100);

                System.out.print("Зарплата " + i + "-го сотрудника за " + j + "-й месяц: " + currentSalary+"\n");

                sumSalaryForAllWorkers += currentSalary;

                sumSalaryForCurrentWorker += currentSalary;

                switch (j) {
                    case 1:
                        sum1Month += currentSalary;
                        break;
                    case 2:
                        sum2Month += currentSalary;
                        break;
                    case 3:
                        sum3Month += currentSalary;
                        break;
                }
            }

            outputSumSalaryForCurrentWorker += "Зарплата, полученная работником № " + i + ": " + sumSalaryForCurrentWorker + "\n";

        }
        System.out.println(outputSumSalaryForCurrentWorker);

        System.out.println("Общая сумма, выплаченная всем работникам за 1-й месяц: "+sum1Month);

        System.out.println("Общая сумма, выплаченная всем работникам за 2-й месяц: "+sum2Month);

        System.out.println("Общая сумма, выплаченная всем работникам за 3-й месяц: "+sum3Month);


        System.out.println("Общая сумма, выплаченная всем работникам: " + sumSalaryForAllWorkers);

    }
}
