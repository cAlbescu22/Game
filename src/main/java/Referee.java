public class Referee {
   PlayBoard playboard;
   Player player;
   public Referee(PlayBoard playboard, Player player){
      this.playboard=playboard;
      this.player=player;


   }
   public void startGame(){
      System.out.println(playboard);

      int counter=0;
      while (counter<=8) {
         int [] coords1= player.inputMove();
         playboard.reveal(coords1);
         System.out.println(playboard);
         int [] coords2= player.inputMove();
         playboard.reveal(coords2);
         System.out.println(playboard);

         if ((playboard.board[coords1[0]][coords1[1]]).toString().equals ((playboard.board[coords2[0]][coords2[1]]).toString())) {
            counter++;
         }
         else
         {

            playboard.board[coords1[0]][coords1[1]].hidden();
            playboard.board[coords2[0]][coords2[1]].hidden();
            System.out.println(playboard);
         }


      }
      System.out.println("CONGRATS");



   }

}
