public class Main {
    public static void main(String[] args) {

        IAdd<Integer> intAdder = (a, b) -> a + b;
        System.out.println(intAdder.add(2, 3));

        IAdd<Double> doubleAdder = (a, b) -> a / b;
        System.out.println(doubleAdder.add(7.21, 10.28));

        ITransformer<String, String> toUpperCase = input -> input.toUpperCase();
        System.out.println(toUpperCase.transform("Solvd practical lesson"));

        ITransformer<Integer, String> stringLength = input -> input.length();
        System.out.println(stringLength.transform("Solvd practical lesson"));


        IStringPredicate<String> isEmpty = input -> input.isEmpty();
        System.out.println(isEmpty.check("Solvd practical lesson"));

        IStringPredicate<String> containsSolvd = input -> input.contains("Solvd");
        System.out.println(containsSolvd.check("Solvd practical lesson"));

        Day.printWeekdays();

        Color red = Color.getByName("red");
        System.out.println("Color: " + red + ", Hex: " + red.getHexCode());

        Color green = Color.getByName("green");
        System.out.println("Color: " + green + ", Hex: " + green.getHexCode());

        Color blue = Color.getByName("blue");
        System.out.println("Color: " + blue + ", Hex: " + blue.getHexCode());

        System.out.println(MathOperations.ADD.apply(1, 2));
        System.out.println(MathOperations.SUBTRACT.apply(2, 1));
        System.out.println(MathOperations.MULTIPLY.apply(3.5, 2.29));
        System.out.println(MathOperations.DIVIDE.apply(5, 2));

        System.out.println(MathOperations2.ADD.performOperation(10, 2));
        System.out.println(MathOperations2.SUBTRACT.performOperation(20, 9));
        System.out.println(MathOperations2.MULTIPLY.performOperation(2.29, 3.5));
        System.out.println(MathOperations2.DIVIDE.performOperation(7,3.1));
    }
}