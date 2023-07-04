public class TicTacToe {

    static char[][] board;
    TicTacToe(){
       board = new char[3][3];
       initBoard();
    }
    void initBoard(){
        for (int i=0; i< board.length; i++){
            for(int j=0; j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
    }

   public static void dispBoard(){
        System.out.println("-------------");
        for(int i=0; i< board.length; i++) {
            System.out.print("| ");

            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void placemark(int row , int col , char mark){
        if(row >=0 && row<=2 && col>=0 && col<=2){
            if (board[row][col]=='x' || board[row][col]=='o') {
                System.out.println("already occupied");
            }
            board[row][col] = mark;
        }else {
            System.out.println("invalid position");
        }

    }

       static boolean checkColwin(){
        for(int j=0;j<=2;j++){
            if(board[0][j] != ' ' && board[0][j]==board[1][j] && board[1][j]==board[2][j]) {
                return true;
            }
        }
        return false;
    }

        static boolean checkrowwin(){
        for(int j=0;j<=2;j++){
            if(board[j][0] != ' ' && board[j][0]==board[j][1] && board[j][1]==board[j][2]) {
                return true;
            }
        }
        return false;
    }

        static boolean checkdiagnoal(){
        if(board[0][0]!=' '&& board[0][0]==board[1][1] && board[1][1]==board[2][2] ||board[0][2]!=' ' &&  board[0][2]==board[1][1] && board[1][1]==board[2][0] )
        {
            return true;
        }
        return false;
    }

        static boolean checkdraw(){
            for(int i=0 ; i<=2; i++){
                for(int j=0;j<=2;j++){
                    if(board[i][j] == ' '){
                        return false;
                    }
                }
            }
            return true;
        }



}
