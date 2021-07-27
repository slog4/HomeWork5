package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int x =3;
	int y =3;
	char [][] game =new char[x][y];
        System.out.println("Чем будете играть X или O, введите: ");
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        char secondPlayer;
        if(symbol == 'x'||symbol=='X'){
            secondPlayer = 'o';
        }else {secondPlayer = 'x';}
        System.out.println("symbol = "+ symbol);
        System.out.println("Введите координату по Х:");
        x = scanner.nextInt();
        System.out.println("Введите координаты по Y: ");
        y = scanner.nextInt();
        game[x][y]=symbol;
        x = (int) (Math.random()*3);
        y = (int) (Math.random()*3);
        game[x][y]=secondPlayer;


        for (int row = 0; row < game.length ; row++) {
            for (int column = 0; column < game[row].length; column++) {
                System.out.print(game[row][column]+"\t");
            }
            System.out.println(" ");
        }

    }
}
