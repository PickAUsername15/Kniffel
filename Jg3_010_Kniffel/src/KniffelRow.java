
import javax.swing.JCheckBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author no
 */
public class KniffelRow {

    private String spiel;
    private JCheckBox wahl;
    private int points;

    public KniffelRow(String spiel, JCheckBox wahl, int points) {
        this.spiel = spiel;
        this.wahl = wahl;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getSpiel() {
        return spiel;
    }

    public JCheckBox getWahl() {
        return wahl;
    }
    
    
    
}
