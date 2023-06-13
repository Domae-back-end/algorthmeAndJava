package game;


import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    private String tot = "";
    private int cnt = 1;
    private int randomLength = 3;

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.gameStart();
    }

    public void gameStart() {
        Scanner sc = new Scanner(System.in);
        NumberFormatExceptionError exceptionError = new NumberFormatExceptionError();
        getRandom();
        System.out.println(tot);
        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");

        while (true) {
            System.out.print(cnt + "번째 시도 : ");
            String input = sc.nextLine();
            if (input.equals(tot)) {
                break;
            }
            cnt++;

            if (!(Pattern.matches("\\d+", input))) {
                exceptionError.setMsg("답 입력시에 잘못된 타입으로 입력하심.");
                throw exceptionError;
            }
            if(input.length() != randomLength){
                exceptionError.setMsg("답 입력시에 잘못된 길이로 입력하심.");
                throw exceptionError;
            }

            System.out.println(calc(input));

        }

        System.out.println(cnt + "번만에 맞히셨습니다.");
        System.out.println("게임을 종료합니다.");

    }

    public String calc(String input) {
        String msg = "";
        int cnt = 0;

        for (int i = 0; i < randomLength; i++) {
            if (tot.contains(input.charAt(i) + "")) {
                cnt++;
            }
        }
        msg += cnt + "B";

        cnt = 0;
        for (int i = 0; i < randomLength; i++) {
            if (input.charAt(i) == tot.charAt(i)) {
                cnt++;
            }
        }
        msg += cnt + "S";

        return msg;
    }

    public void getRandom() {
        Random random = new Random();
        while (!(tot.length() == randomLength)) {
            int randomInt = random.nextInt(9);
            if (!(tot.contains("" + randomInt))) {
                tot += randomInt + "";
            }
        }
    }

}
