import java.util.Scanner; 
import slatebeard.util.*;


public class GLogic {
    private Scanner sc = new Scanner(System.in);
    public GLogic() {
        run();
    }
    

    private void run() {
        boolean running = true;
        


        // String player1Name = player1.getName();



        String playerUiMarker = "@@@@@@@@";
        
        
             
        while(running) {
            QOL.clearConsole();
            
            TUI.uiDraw(Art.bigBox, playerUiMarker, "MadMax", false);
            
            int choice = sc.nextInt();



        }
    }
}
