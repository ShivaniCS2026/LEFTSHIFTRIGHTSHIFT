import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num1 = a << 1;
        System.out.println("Left shift result: "+ num1);
        int num2 = a >> 1;
        System.out.println("Right shift result: "+ num2);
        
    }
}
