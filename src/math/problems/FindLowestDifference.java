package math.problems;
import java.util.*;
public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int ar1 = array1.length;
        int ar2 = array2.length;

        System.out.println("The lowest difference between the two array cells = "+difference(array1, array2, ar1, ar2));
    }


    static int difference(int [] array1, int [] array2, int ar1, int ar2)
    {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int x = 0, y = 0;

        int result = Integer.MAX_VALUE;

        while (x < ar1 && y < ar2)
        {
            if (Math.abs(array1[x] - array2[y]) < result)
                result = Math.abs(array1[x] - array2[y]);

            if (array1[x] < array2[y])
                x++;

            else
                y++;
        }
        return result;
    }
}