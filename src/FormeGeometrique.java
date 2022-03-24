public abstract class FormeGeometrique {

    float positionX;
    float positionY;

    void afficherPosition() {
        System.out.println("position : (" + positionX + "," + positionY + ")");
    }

    abstract double surface() ;

    abstract double perimetre() ;
}
