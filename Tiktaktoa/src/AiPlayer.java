
import java.util.Random;
import java.util.Scanner;

public class AiPlayer extends Player{

    AiPlayer(String name , char mark){
        this.name = name;
        this.mark = mark;
    }
//    @Override
    boolean isValidmove(int row , int col){
        if(row>=0 && row<=2 && col >=0 && col<=2){
            if(TicTacToe.board[row][col]==' '){
                return true;
            }

        }
        return false;
    }

     void makeMove(){
        Scanner sc = new Scanner(System.in);
        int row , col;
        boolean choice = true;
        do{
            Random r = new Random();
           row = r.nextInt(3);
            col = r.nextInt(3);
        }while (!isValidmove(row , col));
        TicTacToe.placemark(row , col ,mark);
    }


}//class scope
