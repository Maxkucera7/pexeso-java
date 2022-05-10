/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4ita_pexeso;

import javax.swing.JButton;

/**
 *
 * @author Martin
 */
public class Card extends JButton{
    private int id;
    private boolean matched=false;

    public void setId(int id) {
        this.id = id;
    }
    public void setMatched(boolean matched) {
        this.matched = matched;
    }
    public int getId() {
        return id;
    }
    public boolean getMatched() {
        return matched;
    }
    
    
}
