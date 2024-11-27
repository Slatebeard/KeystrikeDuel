package slatebeard.util;

public class Art {

    private static String welcomeMessage = "Welcome to the Keystrike Duel!";
    
    private static String subMessage = "Two keyboard warriors enter the digital arena. When the text FIRE flashes, your skills will be tested.\n" +
                            "The fastest hacker wins - but missclick or drop the table, and you're kicked!\n" +
                            "Its all about speed, reaction, focus and execution.\n" +
                            "Are you the ultimate keymaster...\n" + 
                            "Prove it!";
                            
    
    private static String p1NameMessage = "Enter Player 1's name";
    private static String p2NameMessage = "Enter Player 2's name";

    private static String menuBox = 
    "+-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~+\n"+
    "|           1. Start a new game        |\n"+
    "|           2. Settings                |\n"+
    "|           0. Exit                    |\n"+
    "+-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~+";
    public static String bigBox =
    "+-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~+\n"+
    "|                   |                            Round                ##                            |                  |\n"+
    "!                                       ____________________|_____________________                                     !\n"+
    "|                                       |                                        |                                     |\n"+
    "!            @@@@@@@1                   |               @@@@@@@@9                |                  @@@@@@@2           !\n"+
    "|                                       |                                        |                                     |\n"+
    "!                                       |                                        |                                     !\n"+
    "|                                       |                                        |                                     |\n"+
    " !                                       |      _0                        0_      |                                     !\n"+
    "|                                       |     '/ \\                      / \\'     |                                     |\n"+
    "!                                       |     |\\                         /|      |                                     !\n"+
    "|                                       |     / |                        | \\     |                                     |\n"+
    "!                                       |========================================|                                     !\n"+
    "|                                       |                                        |                                     |\n"+
    "!                                       +________________________________________+                                     !\n"+
    "|                                                                                                                      |\n"+
    "!                                   Press your choosen key when you see the word fire!                                 !\n"+
    "|______________________________________________________________________________________________________________________|\n"+
    "!                                                           |                                                          !\n"+
    "|                                                           |                                                          |\n"+
    "!    Lives: [%%1]  [%%2]  [%%3]                             |    Lives: [%%4]  [%%5]  [%%6]                            !\n"+
    "|                                                           |                                                          |\n"+
    "!                                                           |                                                          !\n"+
    "|    Best Time: @@@@@7                                      |    Best Time: @@@@@8                                     |\n"+
    "!                                                           |                                                          !\n"+
    "|                                                           |                                                          |\n"+
    "!                                                           |                                                          !\n"+
    "|                                                           |                                                          |\n"+
    "!                                                           |                                                          !\n"+
    "|                                                           |                                                          !\n"+
    "!                                                           |                                                          !\n"+
    "|                                                           |                                                          !\n"+
    "!                                                           |                                                          !\n"+
    "|                   |                                       |                                       |                  !\n"+
    "+-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~++-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~++-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~+\n";
    



    private static String placer = ">";

    private static String goodbyeMessage = "Exiting game...";

    public static void welcomeMessage() {
        System.out.print(QOL.centerText(welcomeMessage, 192));
    }

    public static void subMessage() {
        System.out.print(QOL.centerText(subMessage, 192));
    }
    
    public static void menuBox() {
        System.out.print(QOL.centerText(menuBox, 192));
    }

    public static void p1NameMessage() {
        System.out.println(QOL.centerText(p1NameMessage, 192));
    }

    public static void p2NameMessage() {
        System.out.print(QOL.centerText(p2NameMessage, 192));
    }

    public static void placer() {
        System.out.print(QOL.centerText(placer, 192));
    }

    public static void goodbyeMessage() {
        System.out.print(QOL.centerText(goodbyeMessage,192 ));
    }

    public static void bigBox() {
        System.out.print(QOL.centerText(bigBox, 192));
    }















}
