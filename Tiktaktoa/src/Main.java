public class Main {
    public static void main(String[] args) {

        TicTacToe object = new TicTacToe();
       Player obj = new HumanPlayer("sasi",'x');
//        HumanPlayer obj2 = new HumanPlayer("Krishna",'o');
        Player obj2 = new AiPlayer("lin" , 'o');

        Player cp;
        cp =obj;
       do{ System.out.println(cp.name + " turn");
        cp.makeMove();
        TicTacToe.dispBoard();

        if(TicTacToe.checkColwin() || TicTacToe.checkdiagnoal() || TicTacToe.checkrowwin() || TicTacToe.checkdraw())
        {
            System.out.println(cp.name + "has win the game");
            break;
        }else {
            if(cp == obj){
                cp = obj2;
            }else{
                cp = obj;
            }
        }
       } while(true);
    }//main method scope
}//class scope