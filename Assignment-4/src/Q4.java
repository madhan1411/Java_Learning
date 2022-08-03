import java.util.Scanner;

public class Q4 {
    static void towerOfHanoi(int n, char from_tower,
                             char to_tower, char aux_tower)
    {
        if (n == 0)
        {
            return;
        }
        towerOfHanoi(n - 1, from_tower, aux_tower, to_tower);
        System.out.println("Move disk "+ n + " from tower " +
                from_tower +" to tower " + to_tower );
        towerOfHanoi(n - 1, aux_tower, to_tower, from_tower);
    }

    // Driver code
    public static void  main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of disks:");
        n = sc.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}

