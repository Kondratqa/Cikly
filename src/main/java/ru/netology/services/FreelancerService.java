package ru.netology.services;

public class FreelancerService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        int spentOnVacation = 0;

        for (int month = 1; month <= 12; month++) {
            System.out.print("Месяц " + month + ". Денег " + money + ". ");
            if (money >= threshold) {
                count++;
                money = money - expenses;
                spentOnVacation = money - (money / 3);
                money = money - spentOnVacation;
                System.out.println("Придётся отдыхать. Потратил -" + expenses + ", затем ещё -" + spentOnVacation);
            } else {
                System.out.println("Придётся работать. Заработал +" + income + " потратил -" + expenses);
                money = money + income - expenses;
            }
        }
        return count;
    }

}
