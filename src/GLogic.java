import java.util.Scanner; 
import slatebeard.util.*;


public class GLogic {
    private Scanner sc = new Scanner(System.in);
    public GLogic() {
        run();
    }
    

    private void run() {

        boolean running = true;

             
        while(running) {
            QOL.clearConsole();

            

            
            TUI.uiDraw(Art.bigBox, TUI.player1Key, "Max", true);
            TUI.uiDraw(TUI.getTuiBuffer(), TUI.player2Key, "Diana", false);

            int choice = sc.nextInt();



        }
    }
}
