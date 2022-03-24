import java.awt.*;

public class Rectangle extends FormeGeometrique implements Dessinable {

    float longueur;
    float largeur;

    public Rectangle(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.positionX = 0;
        this.positionY = 0;
    }

    @Override
    double surface() {
        return longueur * largeur;
    }

    @Override
    double perimetre() {
        return 2 * longueur + 2 * largeur;
    }

    @Override
    public void dessiner(Graphics g) {
    }
}
