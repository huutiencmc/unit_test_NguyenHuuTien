package com.example.studentanalyzer;
import java.util.List;
public class StudentAnalyzer {
//    public int countExcellentStudents(List<Double> scores) {
//        if (scores == null || scores.isEmpty()) {
//            return 0;
//        }
//
//        int count = 0;
//        for (Double score : scores) {
//            if (score != null && score >= 8.0 && score <= 10.0) {
//                count++;
//            }
//        }
//        return count;
//    }

    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        int validCount = 0;

        for (Double score : scores) {
            if (score != null && score >= 0.0 && score <= 10.0) {
                sum += score;
                validCount++;
            }
        }

        return validCount > 0 ? sum / validCount : 0.0;
    }
}