import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer n:");
        n = Integer.parseInt(sc.nextLine());
        List<Integer> arr = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        System.out.println(Ludics(arr));
    }

    private static List<Integer> Ludics(List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            int first_ludic = arr.get(i);
            int remove_index = i + first_ludic;
            while (remove_index < arr.size()) {
                arr.remove(remove_index);
                remove_index = remove_index + first_ludic - 1;
            }

        }
        return arr;
    }
}
