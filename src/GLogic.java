import java.util.Scanner; 
import slatebeard.util.*;
import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;
import java.io.*;


public class GLogic {
    private Scanner sc = new Scanner(System.in);

    public String p1Name = "";
    public String p2Name = "";

    public GLogic() {
        run();
    }
    

    private void run() {
        boolean running = true;
        try {
            while(running) {
                QOL.clearConsole();
                
                QOL.setLine(25);
                Art.p1NameMessage();
                p1Name = sc.nextLine();

                QOL.clearConsole();
                
                QOL.setLine(25);
                Art.p2NameMessage();
                p2Name = sc.nextLine();

                TUI.uiDrawInit(p1Name, p2Name);

                QOL.setDraw(96);

                QOL.switchToRawMode();
                System.out.print("");
                int readyCheck =  System.in.read();
                QOL.restoreTerminalMode();

                if (readyCheck == 49) {
                    QOL.clearConsole();
                    running = false;
                }
            }

        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
