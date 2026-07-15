
public class test {

    public static void main(String[] args) {

        if (calculator.add(2, 2) != 5) {
            throw new RuntimeException("Test Failed");
        }

        System.out.println("All tests passed!");
    }
}
