import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonOneHandler implements ActionListener {
    private ButtonPanel P1;
    private PlotPanel P2;
    ButtonOneHandler(ButtonPanel P1, PlotPanel P2){
        this.P1 = P1;
        this.P2 = P2;
    }

    public void actionPerformed(ActionEvent ae){
        P2.G=P2.G.remember(P1);
        P2.G.plot(P2.getGraphics());
    }
}
