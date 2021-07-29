package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int coordinate_x;
    public static int coordinate_y;
    public static char secondPlayer;
    Scanner scanner = new Scanner(System.in);
    public static char EnterCharUser(){
        char enterSimbol;
        Scanner scanner = new Scanner(System.in);
        enterSimbol = scanner.next().charAt(0);
        return enterSimbol;
    }
    public static int EnterIntUser(char simbol){
        int enterInt;
        System.out.printf("Введите координаты %s ",simbol );
        Scanner scanner = new Scanner(System.in);
        enterInt = scanner.nextInt();
        return enterInt;
    }
    public static boolean Examen(int coordinate_x,int coordinate_y,char[][]game){
        if(game[coordinate_x][coordinate_y]!= '\u0000'){
            return true;
        } else {
              return false ;
        }
    }
    public static void comp(boolean examen,char[][]game){

        do {

             coordinate_x = (int) (Math.random()*3);
             coordinate_y = (int) (Math.random()*3);
            examen = Examen(coordinate_x,coordinate_y,game);

        }while (examen == true);
        game[coordinate_x][coordinate_y]=secondPlayer;
    }
    public static boolean ExamenLine(char[][] game){
        char symbol='X';
        secondPlayer = 'O';

        if(game[0][0]== symbol && game[0][1]==symbol && game[0][2]==symbol ){
            return true;
        }else if(game[1][0]== symbol && game[1][1]==symbol && game[1][2]==symbol ){
            return true;
        }else if(game[2][0]== symbol && game[2][1]==symbol && game[2][2]==symbol ){
            return true;
        }else if(game[0][0]== symbol && game[0][1]==symbol && game[0][2]==symbol ){
            return true;
        }else if(game[1][0]== symbol && game[1][1]==symbol && game[1][2]==symbol ){
            return true;
        }else if(game[2][0]== symbol && game[2][1]==symbol && game[2][2]==symbol ){
            return true;
        }else if(game[0][0]== symbol && game[1][1]==symbol && game[2][2]==symbol ){
            return true;
        }else if(game[0][2]== symbol && game[1][1]==symbol && game[2][0]==symbol ){
            return true;
        }else if(game[0][0]== secondPlayer && game[0][1]==secondPlayer && game[0][2]==secondPlayer ){
            return true;
        }else if(game[1][0]== secondPlayer && game[1][1]==secondPlayer && game[1][2]==secondPlayer ){
            return true;
        }else if(game[2][0]== secondPlayer && game[2][1]==secondPlayer && game[2][2]==secondPlayer ){
            return true;
        }else if(game[0][0]== secondPlayer && game[0][1]==secondPlayer && game[0][2]==secondPlayer ){
            return true;
        }else if(game[1][0]== secondPlayer && game[1][1]==secondPlayer && game[1][2]==secondPlayer ){
            return true;
        }else if(game[2][0]== secondPlayer && game[2][1]==secondPlayer && game[2][2]==secondPlayer ){
            return true;
        }else if(game[0][0]== secondPlayer && game[1][1]==secondPlayer && game[2][2]==secondPlayer ){
            return true;
        }else if(game[0][2]== secondPlayer && game[1][1]==secondPlayer && game[2][0]==secondPlayer ){
            return true;
        }else {return false;}

    }
    public static boolean ExamenEnterUser(int coordinate_x, int coordinate_y,char[][]game){
        if(game[coordinate_x][coordinate_y]!='O' && game[coordinate_x][coordinate_y]!='X' ){
            return true;
        }else {
            return false;
        }
    }






    public static void main(String[] args) {

        int size_x =3;
        int size_y =3;
        boolean line = false;
        boolean examen = false;
        boolean endGame = false;
	char [][] game =new char[size_x][size_y];
        System.out.println("Чем будете играть X или O, введите: ");
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        if(symbol == 'x'||symbol=='X'){
            symbol='X';
            secondPlayer = 'O';
        }else {
            secondPlayer = 'X';
            symbol = 'O';
        }
do {

    coordinate_x = EnterIntUser('x');
    coordinate_y = EnterIntUser('y');
    examen = Examen(coordinate_x, coordinate_y, game);
    examen = ExamenEnterUser(coordinate_x,coordinate_y,game);
    if (examen = true) {
        game[coordinate_x][coordinate_y] = symbol;
    } else {
        EnterIntUser('x');
        EnterIntUser('y');
    }

    System.out.println("x = " + coordinate_x + " y= " + coordinate_y);
    comp(examen, game);

    for (int row = 0; row < game.length; row++) {
        for (int column = 0; column < game[row].length; column++) {
            System.out.print(game[row][column] + "\t");
        }
        System.out.println(" ");
    }
    line = ExamenLine(game);
    if (line == true){break;}
}while (endGame == false);

    }

}
