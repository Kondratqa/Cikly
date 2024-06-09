package ru.netology.services;

public class FreelancerService {

    public static void main(String[] args) {
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        calculate(income, expenses, threshold);
    }

    public static int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 1; month <= 12; month++) {
            System.out.print("Месяц " + month + ". Денег " + money + ". ");
            if (money >= threshold) {
                count++;
                money = money - expenses;
                money = money / 3;

                System.out.print("Буду отдыхать. ");

            } else {

                System.out.print("Придётся работать. " + "Заработал +" + income);
                money = money + income - expenses;
            }

            System.out.println(", потратил " + expenses);

        }
        return count;
    }
}
