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
    public static String player1HP1 = "%1";
    public static String player1HP2 = "%2";
    public static String player1HP3 = "%3";
    public static String player2HP1 = "%4";
    public static String player2HP2 = "%5";
    public static String player2HP3 = "%6";
        // Best Time
    public static String player1BT = "@@@@@7";
    public static String player2BT = "@@@@@8";



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


    QOL.clearConsole();

    TUI.setTuiBuffer(updatedUI);
    System.out.print(QOL.centerText(updatedUI, 192));
}
       





    






















}


