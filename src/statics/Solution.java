package statics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int A;
    public static int B;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println("I/O Error");
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {

        System.out.println(A + B);
        System.out.println(MIN);

    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
