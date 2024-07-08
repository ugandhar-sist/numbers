import java.util.Scanner;

public class PrimeNumberGeneration {
    public static void main(String[] args) {
        long lim, num, fact, flag, range;
        Scanner sc = new Scanner(System.in);
        lim = sc.nextLong();
        for(num =2; num <= lim; num++)
        {
            range = (int)Math.sqrt(num);
            flag = 0;
            for(fact =2; fact <= range; fact++) {
                if(num % fact == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.print(num+ " ");
            }
        }
    }
}
