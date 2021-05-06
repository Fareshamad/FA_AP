package Vormen;

public class Vierkant extends Vorm {
    private int zijdeLengte;

    public Vierkant(int zijdeLengte){
        this.zijdeLengte = zijdeLengte;
    }

    @Override
    public int berekenOppervlakte() {
        return this.zijdeLengte*this.zijdeLengte;
    }
}