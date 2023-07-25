public class Tortue {
    protected int y=0;
    protected int x=0;

    protected int angleActuel=90;

    public void avancer(int combien) {
        switch (this.angleActuel){
            case 0 :  this.x+=combien;
                System.out.println("La tortue avance de "+combien);break;
            case 90 : this.y+=combien; System.out.println("La tortue monte de "+combien);break;
            case 180 : this.x-=combien; System.out.println("La tortue recule de "+combien);break;
            case 270 : this.y-=combien; System.out.println("La tortue descend de "+combien);break;
        }
        System.out.println();
        System.out.println("Les nouvelles coordonnées sont (x,y,°) ("+this.x+","+this.y+","+this.angleActuel+"°)");
    }

    public void tournerDroite(int angle) {
        if (angle==0||angle==90||angle==180||angle==270) {
            this.angleActuel = this.angleActuel-angle;
            if (this.angleActuel < 0) this.angleActuel += 360;
            if (this.angleActuel==360) this.angleActuel=0;
        }
        System.out.println("La tortue tourne à droite de "+angle);
        System.out.println("Les nouvel angle est "+this.angleActuel+"°");
    }

    public void tournerGauche(int angle) {
        if (angle == 0 || angle == 90 || angle == 180 || angle == 270) {
            this.angleActuel = this.angleActuel + angle;
            if (this.angleActuel > 360) this.angleActuel -= 360;
            if (this.angleActuel==360) this.angleActuel=0;

        }
        System.out.println("La tortue tourne à gauche de "+angle);
        System.out.println("Les nouvel angle est "+this.angleActuel+"°");
    }
}
