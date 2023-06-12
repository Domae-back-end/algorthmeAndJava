package java_study.day06_12.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public Calculator() {
    }

    public void setOperation(String operation) {
        switch (operation){
            case "+":{
                this.operation = new AddOperation();
                break;
            }
            case "-":{
                this.operation = new SubstractOperation();
                break;
            }
            case "*":{
                this.operation = new MultiplyOperation();
                break;
            }
            case "/":{
                this.operation = new DivideOperation();
                break;
            }
        }
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;
    }

}