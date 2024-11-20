import java.util.Scanner;
import slatebeard.util.Art;
import slatebeard.util.QOL;

public class MainMenu {
    private boolean running = true;
    private Scanner sc = new Scanner(System.in);
    
    public MainMenu() {
        run();
    }

    private void run() {
        int userChoice = 0;
        while (running) {
            QOL.clearConsole();

            Art.welcomeMessage();
            QOL.setLine(1);
            Art.subMessage();
            Art.menuBox();
            QOL.setDraw(95);
            System.out.print(">");
            
            userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    new GLogic();                                      
                    break;
                case 2:
                    new Settings();
                    break;
                case 3:
                    running = false;
                    break;

                default:
                    break;
            }
        }
    }
}
