package Day_14;


import com.sun.javafx.font.directwrite.DWFactory;

import javax.swing.*;

public class DiceWorker extends SwingWorker {
    int timesToRoll;
    public DiceWorker(int timesToRoll){
        super();
        this.timesToRoll = timesToRoll;
    }

    protected int[] doInBackground() {
        int[] result = new int[16];
        for(int i = 0; i < this.timesToRoll ; i++){
            int sum = 0;
            for (int j=0;j<3;j++){
                sum+= Math.floor(Math.random()*6);
            }
            result[sum] = result[sum] + 1;
        }
        return result;
    }
}
