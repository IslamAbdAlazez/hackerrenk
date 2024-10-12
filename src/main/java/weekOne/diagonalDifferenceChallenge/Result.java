package weekOne.diagonalDifferenceChallenge;

import java.util.List;

public class Result {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primaryDiagonalValuesCount = 0;
        int secondaryDiagonalValuesCount = 0;
        int absoluteDiffernce = 0;

        for (int i = 0; i <= arr.size() - 1; i++) {
            primaryDiagonalValuesCount += arr.get(i).get(i);
        }

        int r = arr.size() - 1;
        for (int j = 0; j <= arr.size() - 1; j++) {
            secondaryDiagonalValuesCount += arr.get(j).get(r);
            r--;
        }
        absoluteDiffernce = Math.abs(primaryDiagonalValuesCount - secondaryDiagonalValuesCount);
        return absoluteDiffernce;
    }
}