package Vormen;

public class Rechthoek extends Vorm {
    private int lengte;
    private int breedte;

    public Rechthoek(int lengte, int breedte){
        this.lengte = lengte;
        this.breedte = breedte;
    }

    @Override
    public int berekenOppervlakte() {
        return this.lengte*this.breedte;
    }
}
