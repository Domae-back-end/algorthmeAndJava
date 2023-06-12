package java_study.day06_12.calculator;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public void parseFirstNum(String firstInput) throws BadInputException {
        // 구현 1.
        if(!Pattern.matches(NUMBER_REG, firstInput)){
            throw new BadInputException("정수 아님");
        }
        calculator.setFirstNumber(Integer.parseInt(firstInput));


    }

    public void parseSecondNum(String secondInput) throws BadInputException {
        // 구현 1.
        if(!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException("정수 아님");
        }
        calculator.setSecondNumber(Integer.parseInt(secondInput));
    }

    public void parseOperator(String operationInput) throws BadInputException {
        // 구현 1.
            if(!Pattern.matches(OPERATION_REG, operationInput)){
            throw new BadInputException("잘못된 연산자.");
        }
        calculator.setOperation(operationInput);
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}