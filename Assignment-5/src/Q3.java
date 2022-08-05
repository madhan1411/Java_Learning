import java.util.List;

class InvalidEmployeeException extends Exception {
    InvalidEmployeeException(String msg) {
        System.out.println(msg);
    }
}

public class Q3 {
    public static void main(String[] args) {
        List<String> emplist = List.of(new String[]{"madhan", "mastan", "venkat", "Vishal"});
        try {
            Employee("madha", emplist);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void Employee(String name, List<String> list) throws InvalidEmployeeException {
        if (!list.contains(name)) {
            throw new InvalidEmployeeException("Employee is not present in list");
        } else {
            System.out.println("Employee is present in the given list");
        }

    }


}
