package com.example.studentanalyzer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {
    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    public void testCountExcellentStudents_EmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_AllInvalidScores() {
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-1.0, 11.0, -5.0, 10.1)));
    }

    @Test
    public void testCountExcellentStudents_MixedValidAndInvalid() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0, 8.0, 10.0);
        assertEquals(4, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_AllExcellent() {
        List<Double> scores = Arrays.asList(8.0, 9.5, 10.0, 8.1);
        assertEquals(4, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_NoneExcellent() {
        List<Double> scores = Arrays.asList(7.9, 5.0, 6.5, 0.0);
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_BoundaryValues() {
        List<Double> scores = Arrays.asList(8.0, 7.999, 10.0, 0.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.001);
    }

    @Test
    public void testCalculateValidAverage_AllInvalidScores() {
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-1.0, 11.0, -5.0, 10.1)), 0.001);
    }

    @Test
    public void testCalculateValidAverage_MixedValidAndInvalid() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.17, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_AllValid() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 6.5);
        assertEquals(7.75, analyzer.calculateValidAverage(scores), 0.001);
    }

    @Test
    public void testCalculateValidAverage_BoundaryValues() {
        List<Double> scores = Arrays.asList(0.0, 10.0, 0.0, 10.0);
        assertEquals(5.0, analyzer.calculateValidAverage(scores), 0.001);
    }

    @Test
    public void testCalculateValidAverage_NullInList() {
        List<Double> scores = Arrays.asList(9.0, null, 7.0, null);
        assertEquals(8.0, analyzer.calculateValidAverage(scores), 0.001);
    }
}