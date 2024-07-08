import java.util.*;

public class PrimeNumber
{
    public static void main(String[] args) {
        long a,range,fact,flag = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        range = (int)Math.sqrt(a);
        for(fact = 2; fact <= range; fact++) {
            if(a%fact == 0)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.print("Prime Number");
        else
            System.out.print("Not Prime Number");
    }
}
