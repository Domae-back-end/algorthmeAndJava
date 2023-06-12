package java_study.day06_12.calculator;

public class MultiplyOperation implements AbstractOperation {

    @Override
    public double operate(int a, int b) {
        return a*b;
    }
}
