import java.util.Arrays;
import java.util.Random;

public class PlayBoard {
    Symbols[][] board=new Symbols[4][4];

    public   PlayBoard(){
        Symbols[] s=Symbols.values();

        int col=0;
        int row=0;
        boolean ok=false;
        Random x=new Random();

            for (int j = 0; j <=15 ; j++) {
               do {
                    row = x.nextInt(4);
                    col = x.nextInt(4);
                    if (board[row][col]==null) {
                        board[row][col] = s[j];
                        ok=true;
                    }
                    else
                    {
                        ok=false;
                    }
                }while (!ok);


        }
    }

    @Override
    public String toString() {
        String output="";
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                output += board[i][j]+ " ";

            }
            output+="\n";

        }

        return output;
    }
    public void reveal(int[] coords) {
        board[coords[0]][coords[1]].discover();
    }


}
