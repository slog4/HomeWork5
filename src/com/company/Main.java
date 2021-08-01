package com.company;

import java.util.Scanner;

public class Main {
    public static int coordinate_x;
    public static int coordinate_y;
    public static char secondPlayer;
    public static char symbol;
    public static char enterSimbol;

    int countEndGame = 1;
    Scanner scanner = new Scanner(System.in);
    public static char EnterCharUser(){

        Scanner scanner = new Scanner(System.in);
        enterSimbol = scanner.next().charAt(0);
        return enterSimbol;
    }
    public static boolean CountEndGame(char[][]game){
        int count = 0;
        for (int row = 0; row < game.length;row++){
            for (int column = 0; column < game[row].length; column++){
                if (game[row][column]== '\u0000'){
                    count++;
                }
            }
        }
        if(count > 0){
            return true;
        }else {
            return false;
        }
    }
    public static int EnterIntUser(char simbol){
        int enterInt;
        System.out.printf("Введите координаты %s ",simbol );
        Scanner scanner = new Scanner(System.in);
        enterInt = scanner.nextInt();
        return enterInt;
    }
    public static boolean Examen(int coordinate_x,int coordinate_y,char[][]game){
        if(game[coordinate_x][coordinate_y] == '\u0000'){
            return true;
        } else {
              return false ;
        }
    }
    public static void comp(boolean examen,char[][]game){
int cordinate_y = 0;
int cordinate_x = 0;
        do {

            cordinate_x = (int) (Math.random()*3);
            cordinate_y = (int) (Math.random()*3);
            examen = Examen(cordinate_x,cordinate_y,game);

        }while (examen != true);
        game[cordinate_x][cordinate_y]=secondPlayer;
    }
    public static void Player(boolean examen, char[][]game){
        do {

            coordinate_x=EnterIntUser('x');
            coordinate_y=EnterIntUser('y');
            examen = Examen(coordinate_x,coordinate_y,game);

        }while (examen != true);
        game[coordinate_x][coordinate_y]=enterSimbol;
    }
    public static void Player(boolean examen, char[][]game, char symbolPlayer){
        do {

            coordinate_x=EnterIntUser('x');
            coordinate_y=EnterIntUser('y');
            examen = Examen(coordinate_x,coordinate_y,game);

        }while (examen != true);
        game[coordinate_x][coordinate_y]=symbolPlayer;
    }

    public static boolean ExamenLine(char[][] game){
        char symbol='X';
        char secondSymbol = 'O';

        if(game[0][0]== symbol && game[0][1]==symbol && game[0][2]==symbol ){
            System.out.printf("Выиграл игрок %S ",symbol);
            return true;
        }else if(game[1][0]== symbol && game[1][1]==symbol && game[1][2]==symbol ){
            System.out.printf("Выиграл игрок %S ",symbol);
            return true;
        }else if(game[2][0]== symbol && game[2][1]==symbol && game[2][2]==symbol ){
            System.out.printf("Выиграл игрок %S ",symbol);
            return true;
        }else if(game[0][0]== symbol && game[0][1]==symbol && game[0][2]==symbol ){
            System.out.printf("Выиграл игрок %S ",symbol);
            return true;
        }else if(game[1][0]== symbol && game[1][1]==symbol && game[1][2]==symbol ){
            System.out.printf("Выиграл игрок %S ",symbol);
            return true;
        }else if(game[2][0]== symbol && game[2][1]==symbol && game[2][2]==symbol ){
            System.out.printf("Выиграл игрок %S ",symbol);
            return true;
        }else if(game[0][0]== symbol && game[1][1]==symbol && game[2][2]==symbol ){
            System.out.printf("Выиграл игрок %S ",symbol);
            return true;
        }else if(game[0][2]== symbol && game[1][1]==symbol && game[2][0]==symbol ){
            System.out.printf("Выиграл игрок %S ",symbol);
            return true;
        }else if(game[0][0]== secondSymbol && game[0][1]==secondSymbol && game[0][2]==secondSymbol ){
            System.out.printf("Выиграл игрок %S ",secondSymbol);
            return true;
        }else if(game[1][0]== secondSymbol && game[1][1]==secondSymbol && game[1][2]==secondSymbol ){
            System.out.printf("Выиграл игрок %S ",secondSymbol);
            return true;
        }else if(game[2][0]== secondSymbol && game[2][1]==secondSymbol && game[2][2]==secondSymbol ){
            System.out.printf("Выиграл игрок %S ",secondSymbol);
            return true;
        }else if(game[0][0]== secondSymbol && game[0][1]==secondSymbol && game[0][2]==secondSymbol ){
            System.out.printf("Выиграл игрок %S ",secondSymbol);
            return true;
        }else if(game[1][0]== secondSymbol && game[1][1]==secondSymbol && game[1][2]==secondSymbol ){
            System.out.printf("Выиграл игрок %S ",secondSymbol);
            return true;
        }else if(game[2][0]== secondSymbol && game[2][1]==secondSymbol && game[2][2]==secondSymbol ){
            System.out.printf("Выиграл игрок %S ",secondSymbol);
            return true;
        }else if(game[0][0]== secondSymbol && game[1][1]==secondSymbol && game[2][2]==secondSymbol ){
            System.out.printf("Выиграл игрок %S ",secondSymbol);
            return true;
        }else if(game[0][2]== secondSymbol && game[1][1]==secondSymbol && game[2][0]==secondSymbol ){
            System.out.printf("Выиграл игрок %S ",secondSymbol);
            return true;
        }else {return false;}

    }

    public static void main(String[] args) {

        int size_x =3;
        int size_y =3;
        boolean line = false;
        int players = 1;

        boolean endGame = false;
	char [][] game =new char[size_x][size_y];
        players = NumberOfPlayers();

        System.out.println("Чем будете играть X или O, введите: ");
        enterSimbol = EnterCharUser();
        if(enterSimbol == 'x'||enterSimbol=='X'){
            enterSimbol='X';
            secondPlayer = 'O';
        }else {
            secondPlayer = 'X';
            enterSimbol = 'O';
        }
        do {
            boolean examen = false;

            if(players != 2) {
                Player(examen, game);
                endGame = CountEndGame(game);
                if (endGame != true) {
                    System.out.println("Ничья");
                    break;
                }
                comp(examen, game);
                PrintGame(game);
            }else {
                Player(examen, game,enterSimbol);
                PrintGame(game);
                endGame = CountEndGame(game);
                if (endGame != true) {
                    System.out.println("Ничья");
                    break;
                }
                Player(examen, game,secondPlayer);
                PrintGame(game);

            }

    line = ExamenLine(game);
    if (line == true){break;}
}while (endGame == true);

    }

    private static void PrintGame(char[][] game) {
        for (int row = 0; row < game.length; row++) {
            for (int column = 0; column < game[row].length; column++) {
                System.out.print(game[row][column] + "\t");
            }
            System.out.println(" ");
        }
    }

    private static int NumberOfPlayers() {
        int players = 1;
        System.out.println("Введите лщличество игроков 1 или 2 : ");
        Scanner scanner = new Scanner(System.in);
        players = scanner.nextInt();
        return players;
    }

}
