package org.example.algorithm.day05_16;

import java.util.Scanner;

/**
 * ## 상하좌우
 *
 * 여행가 A는 N * N 크기의 정사각형 공간 위에 서 있다. 이 공간은 1 * 1 크기의 정사각형으로 나누어져 있다.
 * 가장 왼쪽 위 좌표는 (1, 1) 이며, 가장 오른쪽 아래 좌표는 (N, N)에 해당한다.
 * 여행가 A는 상, 하, 좌, 우 방향으로 이동할 수 있으며, 시작 좌표는 항상 (1, 1) 이다.
 *
 * 계획서에는 하나의 줄에 띄어쓰기를 기준으로 하여 L, R, U, D 중 하나의 문자가 반복적으로 적혀있다.
 * 각 문자의 의미는 다음과 같다.
 * - L : 왼쪽으로 한 칸 이동
 * - R : 오른쪽으로 한 칸 이동
 * - U : 위로 한 칸 이동
 * - D : 아래로 한 칸 이동
 *
 * 이때 여행가 A 가 N * N 크기의 정사각형 공간을 벗어나는 움직임은 무시한다.
 * 예를 들어 (1, 1) 의 위치에서 L 혹은 U 를 만나면 무시된다.
 * 다음은 N=5 인 지도와 계획서이다. 게임으로 구현해라.
 *
 * 계획서와 지도
 * R -> R -> R -> U -> D -> D
 * _____________________
 * | | | | |
 * | | | | |
 * | | | V |
 * | | | | |
 * | | | | |
 * ---------------------
 *
 * 이 경우 6개의 명령에 따라 여행가가 움직이게 되는 위치는 순서대로 (1, 2), (1, 3), (1, 4),
 * (1, 4), (2, 4), (3, 4) 이므로 최종적으로 여행가 A 가 도착하게 되는 곳의 좌표는 (3, 4) 이다.
 * 다시 말해 3행 4열의 위치에 해당하므로 (3, 4) 라고 적는다. 계획서가 주어졌을 때 여행가 A 가
 * 최종적으로 도착할 지점의 좌표를 출력하는 프로그램을 작성하시오.
 *
 * ## 입력 조건
 * - 첫째 줄에 공간의 크기를 나타내는 N 이 주어진다. ( 1 <= N <= 100)
 * - 둘째 줄에 여행가 A가 이동할 계획서 내용이 주어진다. ( 1 <= 이동횟수 <= 100)
 *
 * ## 출력 조건
 * - 첫째 줄에 여행가 A 가 최종적으로 도착할 지점의 좌표 (X, Y) 를 공백으로 구분하여 출력한다.
 *
 * ## 입력예시
 * 5
 * R R R U D D
 *
 * ## 출력예시
 * 3 4
 */
public class AriplaneGame {

    int tot_x = 0; //기본값
    int tot_y = 0; //기본값

    public static void main(String[] args) {
        AriplaneGame ariplaneGame = new AriplaneGame();

        int num = 5;
        ariplaneGame.tot_x = 2;
        ariplaneGame.tot_y = 3;

        Scanner s = new Scanner(System.in);
        ariplaneGame.println_Board(ariplaneGame.board_map(num,0,0));

        int x = 0;
        int y = 0;

        while (true){
            System.out.println("입력 하세요.");
            String input = s.nextLine();

            if(input.equals("a")){
                if(ariplaneGame.check_mapOut(num, x, y-1)){
                    ariplaneGame.println_Board(ariplaneGame.board_map(num,x,y-1));
                    y--;
                }else{
                    ariplaneGame.println_Board(ariplaneGame.board_map(num,x,y));
                }
            }else if(input.equals("w")){
                if(ariplaneGame.check_mapOut(num, x-1, y)){
                    ariplaneGame.println_Board(ariplaneGame.board_map(num,x-1,y));
                    x--;
                }else{
                    ariplaneGame.println_Board(ariplaneGame.board_map(num,x,y));
                }
            }else if(input.equals("s")){
                if(ariplaneGame.check_mapOut(num, x+1, y)){
                    ariplaneGame.println_Board(ariplaneGame.board_map(num,x+1,y));
                    x++;
                }else{
                    ariplaneGame.println_Board(ariplaneGame.board_map(num,x,y));
                }
            }else if(input.equals("d")){
                if(ariplaneGame.check_mapOut(num, x, y+1)){
                    ariplaneGame.println_Board(ariplaneGame.board_map(num,x,y+1));
                    y++;
                }else{
                    ariplaneGame.println_Board(ariplaneGame.board_map(num,x,y));
                }
            }

        }
    }

    private void println_Board(String[][] board){
        for (int i = 0; i < board.length; i++){
            for (String a : board[i]){
                System.out.print(a);
            }
            System.out.println();
        }
    }

    private boolean check_mapOut(int num,int x, int y){
        System.out.println(x+","+y);
        if(x > (num-1)){
            System.out.println("걸렸다");
            return false;
        }
        if(x < 0){
            System.out.println("걸렸다");
            return false;
        }
        if(y > (num-1)){
            System.out.println("걸렸다");
            return false;
        }
        if(y < 0){
            System.out.println("걸렸다");
            return false;
        }


        return true;
    }

    private String[][] board_map(int num,int x, int y){
        if(x == tot_x && y == tot_y){
            System.out.println("골인!");
            System.out.println("골인 지점 : ("+tot_x+", "+tot_y+")");
            System.exit(1);
        }
        String[][] board = new String[num][num];

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if(i == tot_x && j == tot_y){
                    board[i][j] = "V ";
                }else if(i == x && j == y){
                    board[i][j] = "P ";
                }
                else{
                    board[i][j] = "| ";
                }
            }
        }
        return board;
    }


}
