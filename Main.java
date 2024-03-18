import java.io.*;
import java.util.*;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class Main {
    static int func(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + func(n / 10));
    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = func(n);
        System.out.println("Sum of digit in " + n + " is " + ans);
    }
}