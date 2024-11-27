package slatebeard.util;

import java.util.regex.*;

public class TUI {

    private static String tuiBuffer = Art.bigBox;

    public static String getTuiBuffer() {
        return tuiBuffer;
    }

    public static void setTuiBuffer(String tui) {
        tuiBuffer = tui;
    }



    // KEYS
        //Name
    public static String player1Key = "@@@@@@@1";
    public static String player2Key = "@@@@@@@2";
        // HP
    public static String player1HP1 = "%%1";
    public static String player1HP2 = "%%2";
    public static String player1HP3 = "%%3";
    public static String player2HP1 = "%%4";
    public static String player2HP2 = "%%5";
    public static String player2HP3 = "%%6";
        // Best Time
    public static String player1BT = "@@@@@7";
    public static String player2BT = "@@@@@8";
        // Round #
    public static String roundNumber = "##";
        // WordPlay
    public static String playWord = "@@@@@@@@9";





public static void uiDraw(String currentUI, String marker, String newText, boolean leftSide) {
    QOL.clearConsole();
    
    Pattern pat = Pattern.compile(marker);
    Matcher mat = pat.matcher(TUI.getTuiBuffer());

    int whiteSpace = Math.abs(marker.length() - newText.length());
    
    String paddingL = leftSide ? " ".repeat(whiteSpace) : "";
    String paddingR = !leftSide ? " ".repeat(whiteSpace) : "";

    StringBuffer resultBuffer = new StringBuffer();
    
    while (mat.find()) {
        mat.appendReplacement(resultBuffer, paddingL + newText + paddingR);
    }

    mat.appendTail(resultBuffer); 

    String updatedUI = resultBuffer.toString();

    TUI.setTuiBuffer(updatedUI);
    System.out.print(QOL.centerText(updatedUI, 192));
}
       



public static void uiDrawInit(String p1Name, String p2Name) {
    TUI.uiDraw(Art.bigBox, TUI.player1Key, p1Name, true);
    TUI.uiDraw(TUI.getTuiBuffer(), TUI.player2Key, p2Name, false);
    
    TUI.uiDraw(TUI.getTuiBuffer(), TUI.player1HP1, "xXx", true);
    TUI.uiDraw(TUI.getTuiBuffer(), TUI.player1HP2, "xXx", true);
    TUI.uiDraw(TUI.getTuiBuffer(), TUI.player1HP3, "xXx", true);
    
    TUI.uiDraw(TUI.getTuiBuffer(), TUI.player2HP1, "xXx", false);
    TUI.uiDraw(TUI.getTuiBuffer(), TUI.player2HP2, "xXx", false);
    TUI.uiDraw(TUI.getTuiBuffer(), TUI.player2HP3, "xXx", false);

    TUI.uiDraw(TUI.getTuiBuffer(), TUI.player1BT, "0.0000", true);
    TUI.uiDraw(TUI.getTuiBuffer(), TUI.player2BT, "0.0000", false);

    TUI.uiDraw(TUI.getTuiBuffer(), TUI.roundNumber, " ", false);
    
    TUI.uiDraw(TUI.getTuiBuffer(), TUI.playWord, "a", true);



}

    






















}


