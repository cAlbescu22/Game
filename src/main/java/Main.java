import com.vdurmont.emoji.Emoji;
import com.vdurmont.emoji.EmojiManager;

public class Main {
    public static void main(String[] args) {
       PlayBoard x=new PlayBoard();
       Player cristi=new Player();
       Referee r=new Referee(x,cristi);
       r.startGame();

    }
}
