import java.util.Scanner;

public class side_work
{

    public static void main(String[] args)
    {
        int x[] = {2, 10, 7, 5, 15, 3, 21, 6, 1}; 

        for (int i=0; i < x.length; i++) {
            int num = x[i]; 

            if (num > 15 || num < 5) {
                System.out.println(num); 
            }
        }

    }

}

