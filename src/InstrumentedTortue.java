import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jnesis
 */
public class InstrumentedTortue extends Tortue {

    private JavaPaintUI ui;

    public InstrumentedTortue() {
        ui = new JavaPaintUI();
        ui.addPoint(new Point(500, 500));
        ui.go();
        ui.setVisible(true);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    void avancer(int combien) {

        InstrumentedTortue.super.avancer(combien);
        ui.addPoint(new Point(InstrumentedTortue.this.x + 500, InstrumentedTortue.this.y + 500));

        ui.jPanel2.repaint();

    }

    @Override
    void tournerDroite(int angle) {

        InstrumentedTortue.super.tournerDroite(angle);

    }

    @Override
    void tournerGauche(int angle) {

        InstrumentedTortue.super.tournerGauche(angle);

    }

}
