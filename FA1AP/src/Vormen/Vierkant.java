package Vormen;

public class Vierkant extends Vorm {
    @Override
    public int berekenOppervlakte() {
        int zijdeLengte = 4;
        return zijdeLengte*zijdeLengte;
    }
}