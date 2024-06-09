package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FreelancerServiceTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/param.csv")
    public void testExample1(int income, int expenses, int threshold, int expected) {
        FreelancerService service = new FreelancerService();
//         int income = 10000;
//         int expenses = 3000;
//         int threshold = 20_000;
//         int expected = 3;

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/param.csv")
    public void testExample2(int income, int expenses, int threshold, int expected) {
        FreelancerService service = new FreelancerService();
//                int income = 100_000;
//                int expenses = 60_000;
//                int threshold = 150_000;
//                int expected = 2;

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
