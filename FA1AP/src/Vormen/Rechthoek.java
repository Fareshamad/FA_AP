package Vormen;

public class Rechthoek extends Vorm {
    @Override
    public int berekenOppervlakte() {
        int lengte = 4;
        int breedte = 10;
        return lengte*breedte;
    }
}
