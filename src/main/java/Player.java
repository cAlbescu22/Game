import java.util.Scanner;

public class Player {
    Scanner input=new Scanner(System.in);

    public int[] inputMove(){
       int row=input.nextInt();
       int col=input.nextInt();
       return new int[] {row,col};

    }

}
