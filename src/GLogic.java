import java.util.Scanner; 
import slatebeard.util.*;


public class GLogic {
    private Scanner sc = new Scanner(System.in);

    public String p1Name = "";
    public String p2Name = "";

    public GLogic() {
        run();
    }
    

    private void run() {
        boolean running = true;
        
        while(running) {
            QOL.clearConsole();
            
            QOL.setLine(25);
            Art.p1NameMessage();
            p1Name = sc.nextLine();
            
            Art.p2NameMessage();
            p2Name = sc.nextLine();

            TUI.uiDrawInit(p1Name, p2Name);

            int choice = sc.nextInt();



        }
    }
}
