import java.util.Arrays;
import java.util.Scanner;

public class A51AlgoKeyGeneration {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int X[] = {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
        int Y[] = {1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1};
        int Z[] = {1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0};

        int key = sc.nextInt();
        int keyCount = 0;
        int k[] = new int[key];
        for (; keyCount < key ; keyCount++) {

            System.out.println(" ");
            System.out.println(" ");

            System.out.println("Finding Key :");
            System.out.println(" ");

            System.out.println("Part 1");

            System.out.println("major =  X[8] XOR Y[10] XOR Z[10] ");

            int mCount = 0;
            if (X[8] == 0) {
                mCount++;
            }
            if (Z[10] == 0) {
                mCount++;
            }
            if (Y[10] == 0) {
                mCount++;
            }
            int major;
            if (mCount > 1) {
                major = 0;
            } else major = 1;

            System.out.println("major = " + major);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Part 2");
            if (X[8] == major) {
                int t = X[13] ^ X[16] ^ X[17] ^ X[18];
                for (int i = 0; i < 1; i++) {
                    int j;
                    for (j = X.length - 1; j > 0; j--) {
                        //Shift element of array by one
                        X[j] = X[j - 1];
                    }
                    //start of array.
                    X[0] = t;
                }
                System.out.println("X = " + Arrays.toString(X));
            } else {
                System.out.println("X = " + Arrays.toString(X));
            }
            if (Y[10] == major) {
                int t = Y[20] ^ Y[21];
                for (int i = 0; i < 1; i++) {
                    int j;
                    for (j = Y.length - 1; j > 0; j--) {
                        //Shift element of array by one
                        Y[j] = Y[j - 1];
                    }
                    //start of array.
                    Y[0] = t;
                }
                System.out.println("Y = " + Arrays.toString(Y));

            } else {
                System.out.println("Y = " + Arrays.toString(Y));
            }
            if (Z[10] == major) {
                int t = Z[7] ^ Z[20] ^ Z[21] ^ Z[22];
                for (int i = 0; i < 1; i++) {
                    int j;
                    for (j = Z.length - 1; j > 0; j--) {
                        //Shift element of array by one
                        Z[j] = Z[j - 1];
                    }
                    //start of array.
                    Z[0] = t;
                }
                System.out.println("Z = " + Arrays.toString(Z));

            } else {
                System.out.println("Z = " + Arrays.toString(Z));
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Part 3");
            System.out.println("Last 3 digits of X, Y, Z is " + X[18] + Y[21] + Z[22]);
            k[keyCount] = X[18] ^ Y[21] ^ Z[22];
            System.out.println("X[18] XOR Y[21] XOR Z[22] = " + k[keyCount]);
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Therefore, next " + key + " keystream bits are " + Arrays.toString(k));

    }
}
