public class Logo {
    public static Tortue tortue=new InstrumentedTortue();
    public static void TD(int combien){
        tortue.tournerDroite(combien);
    }

    public static void TG(int combien){
        tortue.tournerGauche(combien);
    }

    public static void AV(int combien){
        tortue.avancer(combien);
    }
    public static void main(String[] args) {

        TD(90);
        AV(200);
        TG(90);
        AV(400);
        TG(90);
        AV(100);
        TG(90);
        AV(300);
        TD(90);
        AV(200);
        TD(90);
        AV(300);
        TG(90);
        AV(100);
        TG(90);
        AV(400);
        TG(90);
        AV(200);

        System.out.println("Les coordonnées finales sont (x,y,°) ("+tortue.x+","+tortue.y+","+tortue.angleActuel+"°)");

    }
}