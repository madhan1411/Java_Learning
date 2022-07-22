public class Q5 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i < 5) {
                for (int j = 5; j >= 1; j--) {
                    if (i < j) {
                        System.out.print("  ");
                    } else {
                        System.out.print("- - ");
                    }
                }
            }
            else {
                for (int j = 5; j <10; j++) {
                    if (i <= j) {
                        System.out.print("- - ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}