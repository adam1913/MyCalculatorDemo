package hbcu.stay.ready.ttime;

public class Display {

    String[] displayModeList = {"binary", "octal", "decimal", "hexadecimal"};

    String displayMode = "binary";

    String unitsMode = "Degrees";




    public void switchDisplayMode() {
        int i = 0;
        i++;
        if (i == 4) {
            i = 0;
        }
        displayMode = displayModeList[i];
    }


    public void switchUnitsMode() {
        if (unitsMode == "Degrees") {
            unitsMode = "Radians";
        } else {
            unitsMode = "Degrees";
        }
    }
}






