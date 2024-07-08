import java.util.*;

public class PrimeGeneration
{
    public static void main(String[] args) {
        long lim, num, fact, flag, range;
        Scanner sc = new Scanner(System.in);
        lim = sc.nextLong();
        for(num =2; num <= lim; num++)
        {
            if(num % 2 == 0 && num!=2)
            {
                continue;
            }
                else if(num%6 == 1 || num%6 == 5 || num == 2 || num == 3)
            {
                range = (int)Math.sqrt(num);
                flag = 0;
                for(fact = 3; fact <= range; fact+=2)
                {
                    if(num%fact == 0)
                    {
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0)
                    System.out.print(num+ " ");
            }

        }
    }
}
