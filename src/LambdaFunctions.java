import java.util.function.*;

public class LambdaFunctions {
    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is even? " + isEven.test(4));

        Function<String, String> toUpperCase = text -> text.toUpperCase();
        System.out.println(toUpperCase.apply("hello solvd"));

        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello Solvd!");

        Supplier<Double> randomNumber = () -> Math.random() * 100;
        System.out.println("My random number is: " + randomNumber.get());

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("The sum is: " + add.apply(3, 5));

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("The square is: " + square.apply(5));

        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;
        System.out.println("The max number is: " + max.apply(10, 15));
    }
}