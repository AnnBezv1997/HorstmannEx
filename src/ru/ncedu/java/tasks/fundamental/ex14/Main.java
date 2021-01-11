package ru.ncedu.java.tasks.fundamental.ex14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Exercises14 exercises14 = new Exercises14();
        Scanner scan = new Scanner(System.in);
        String inputArray = scan.nextLine();

        // Calculate rows and columns
        String[] columns;
        String[] rows;
        columns = inputArray.split("\t");
        rows = inputArray.split("\n");
        int lengthCol = columns.length;

        // Save input values (Create matrix)
        String[][] squareArray = new String[lengthCol][lengthCol];
        for(int i=0; i<lengthCol;i++){
            for(int j=0; j<lengthCol;j++){
                squareArray[i][j] = columns[j];
            }
            if (i!=lengthCol-1){
                inputArray = scan.nextLine();
                columns = inputArray.split("\t");
                //System.out.println(inputArray);
            }
        }

        // Sum of main diagonal
        int sumMainDiagonal = 0;
        for(int i1=0; i1<lengthCol;i1++){
            for(int j=0; j<lengthCol;j++){
                if(i1==j)
                    sumMainDiagonal += Integer.parseInt(squareArray[j][i1]);
            }
        }
        System.out.println(sumMainDiagonal);

        // Sum of antidiagonal
        int sumAntiDiagonal = 0;
        for(int i1=0; i1<lengthCol;i1++){
            for(int j=0; j<lengthCol;j++){
                if((j==((lengthCol-1)-i1)))
                    sumAntiDiagonal += Integer.parseInt(squareArray[i1][j]);
            }
        }
        System.out.println(sumAntiDiagonal);

        // Check if diagonals are equal
        if(sumMainDiagonal != sumAntiDiagonal){
            System.out.println("The matrix is not a magic square");
            System.exit(0);
        }

        // Sum of columns
        int[] sumCols = new int[lengthCol];
        for(int i1=0; i1<lengthCol;i1++){
            for(int j=0; j<lengthCol;j++){
                sumCols[i1] += Integer.parseInt(squareArray[i1][j]);
            }
        }
        System.out.println(Arrays.toString(sumCols));

        // Sum of rows
        int[] sumRows = new int[lengthCol];
        for(int i1=0; i1<lengthCol;i1++){
            for(int j=0; j<lengthCol;j++){
                sumRows[i1] += Integer.parseInt(squareArray[j][i1]);
            }
        }
        System.out.println(Arrays.toString(sumRows));

        // Check it the totals of rows and columns are equal
        for(int i1=0; i1<lengthCol;i1++){
            if((sumRows[i1] != sumCols[i1]) || (sumCols[i1] != sumMainDiagonal)){
                System.out.println("The matrix is not a magic square");
                System.exit(0);
            }
        }
        System.out.println("This is a Magic Square");
    }

}
