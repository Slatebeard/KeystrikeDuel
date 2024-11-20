package slatebeard.util;



public class TUI {
    


    public static void uiDraw (String currentUI, String marker, String newText, boolean leftAlign) {

        int whiteSpace = marker.length() - newText.length();
        

        int iPaddingL = whiteSpace;
        
        int iPaddingR = whiteSpace; 


        String paddingL = " ".repeat(iPaddingL);

        String paddingR = " ".repeat(iPaddingR);

        String newTextFixed;

        if (leftAlign) {
            newTextFixed = newText + paddingR;
        } else {
            newTextFixed = paddingL + newText;
        }

        String tui = currentUI.replaceAll(marker, newTextFixed);
        
        tui = QOL.centerText(tui, 192);

        System.out.print(tui);
    }       

    






















}


