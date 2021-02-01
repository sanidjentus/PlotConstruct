import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxHandler implements ItemListener {
    private Choice ch;
    CheckboxHandler(ButtonPanel P){
        this.ch = P.Chc;
    }

    public void itemStateChanged(ItemEvent ie){
        ch.setEnabled(ie.getStateChange()==ItemEvent.SELECTED);
    }
}
