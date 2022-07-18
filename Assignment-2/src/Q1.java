public class Q1 {
    public int solution(int a, int b) {
        return a + b;
    }

    int solution(int a, int b, int c) {
        return a + b + c;
    }


}

class Multi extends Q1 {


    public int solution(int a, int b) {

        return a * b;
    }

    int solution(int a, int b, int c) {
        return a * b * c;
    }
}

class Demo {
    public static void main(String[] args) {
        Q1 obj = new Q1();
        System.out.println(obj.solution(3, 5));
        Q1 obj1 = new Multi();
        System.out.println(obj1.solution(4, 6, 7));
    }
}


