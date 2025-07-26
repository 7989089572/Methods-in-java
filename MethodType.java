public class MethodTypes {

    // 1. With arguments and with return type
    int add(int a, int b) {
        return a + b;
    }

    // 2. Without arguments and with return type
    int getFixedNumber() {
        return 10;
    }

    // 3. With arguments and without return type
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 4. Without arguments and without return type
    void showMessage() {
        System.out.println("This is Java method example.");
    }

    public static void main(String[] args) {
        MethodTypes obj = new MethodTypes();

        // 1
        System.out.println("Sum: " + obj.add(5, 7));

        // 2
        System.out.println("Fixed Number: " + obj.getFixedNumber());

        // 3
        obj.greet("Harikrishna");

        // 4
        obj.showMessage();
    }
}
