//print num from 1 to n

import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println(num+ " ");
        }
    }
    
}
