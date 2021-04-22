package Vormen;

public class Cirkel extends Vorm implements Rondvormig{
    @Override
    public int berekenOppervlakte() {
        int straal = 6;
        return (int) (straal*straal*Math.PI);
    }

    @Override
    public int geefStraal() {
        return 6;
    }

}
