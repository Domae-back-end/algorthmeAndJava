package java_study.test;

public class Calculator {

    private final AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int a, int b){
        return operation.opertate(a,b);
    }

}
