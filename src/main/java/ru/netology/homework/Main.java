package ru.netology.homework;

import ru.netology.homework.vacation.services.VacationService;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();

        int count = (int) service.calculate(10000, 3000, 20000);
        System.out.println("В этом году получится отдохнуть " + count + " раз/раза.");
    }
}