public class Demo {
    public static void main(String[] args) {
            Addition addition = new Addition();
            Subtraction subtraction = new Subtraction();
            Calculator calculator = new Calculator(addition);
            System.out.println(calculator.executes(30,50));
    }
}
