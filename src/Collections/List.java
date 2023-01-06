package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void computeAvgWithoutLowest( Double scores[]){
        ArrayList<Double> quizScores  = new ArrayList<Double>();
        Collections.addAll(quizScores, scores);
        Double  minimumScore = quizScores.get(0);
        //size of the array List
        int  n = quizScores.size();
        for (int i = 1; i < n; i++) {
            if (quizScores.get(i) < minimumScore) {
                minimumScore = quizScores.get(i);
            }
        }
        //prints the min score
        //System.out.println(minimumScore);

        //remove the min score form arrayList
        quizScores.remove(quizScores.indexOf(minimumScore));
        int lengthOfArray = scores.length;
        //sum  of arrayList itema
        Double sum = 0.0;

        for (Double totalScore : quizScores){
            sum += totalScore;
        }
        //average of all scores
        Double averageScore = sum/ lengthOfArray;
        //print avareage score
        System.out.println("average score is " + averageScore);
    }

    public static void main(String args[]) {
        Double scores[] = {56.0, 90.56, 78.0, 23.45, 56.78, 87.78, 67.45, 78.90};
        computeAvgWithoutLowest(scores);
        computeAvgWithoutLowest(scores);

    }
}
