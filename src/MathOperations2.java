public enum MathOperations2 {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public double performOperation(double a, double b) {
        switch (this) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;
        }
        throw new UnsupportedOperationException("Unknown operation");
    }
}