import java.io.*;
import java.util.*;

public class Workshop1 {
    public static void main(String[] args) {
        int row=8;
        for (int i = 1;i<=row;i++) {
            int j=0;
            while (j<(row-i)) {
                System.out.printf("\t");
                j++;
            }
            int k=0;
            while (k < row-j) {
                System.out.printf("%4d",(int)Math.pow(2, k++));
            }
            k = k - 1;
            while (k > 0) {
                System.out.printf("%4d",(int)Math.pow(2, --k));
            }
            System.out.println();
        }
    }
}