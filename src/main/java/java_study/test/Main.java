package java_study.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculatorSum = new Calculator(new AddOperation());
        Calculator calculatorMin = new Calculator(new AddOperation());
        Calculator calculatorGob = new Calculator(new AddOperation());
        Calculator calculatorAvg = new Calculator(new AddOperation());

        Scanner sc = new Scanner(System.in);

        System.out.println("1번째 수 : ");
        int num1 = sc.nextInt();
        System.out.println("기호 : ");
        String experic = sc.nextLine();
        System.out.println("2번째 수 : ");
        int num2 = sc.nextInt();

        if(experic.contains("+")){
            System.out.println(num1+" + "+num2+" = "+ calculatorSum.calculate(num1,num2));
        }else if(experic.contains("+")){
            System.out.println(num1+" - "+num2+" = "+ calculatorMin.calculate(num1,num2));
        }else if(experic.contains("+")){
            System.out.println(num1+" * "+num2+" = "+ calculatorGob.calculate(num1,num2));
        }else if(experic.contains("+")){
            System.out.println(num1+" / "+num2+" = "+ calculatorAvg.calculate(num1,num2));
        }else{
            System.out.println("기호를 잘못 입력하셨습니다.");
        }

    }

}
