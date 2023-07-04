import java.util.Scanner;

public class HumanPlayer extends Player{

    HumanPlayer(String name , char mark){
        this.name = name;
        this.mark = mark;
    }

    boolean isValidmove(int row , int col){
        if(row>=0 && row<=2 && col >=0 && col<=2){
            if(TicTacToe.board[row][col]==' '){
                return true;
            }

        }
        return false;
    }
    public void makeMove(){
        Scanner sc = new Scanner(System.in);
        int row , col;
        boolean choice = true;
        do{
            if(!choice)
                System.out.println("invalid move");
        System.out.println("enter row and column");
        row = sc.nextInt();
        col = sc.nextInt();
        choice = isValidmove(row , col);
        }while (!isValidmove(row , col));
          TicTacToe.placemark(row , col ,mark);
    }


}//class scope
