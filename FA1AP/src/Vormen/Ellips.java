package Vormen;

public class Ellips extends Vorm implements Rondvormig{
    @Override
    public int berekenOppervlakte() {
        int halveLangeAs = 8;
        int halveKorteAs = 2;
        return (int) (Math.PI*halveKorteAs*halveLangeAs);
    }

    @Override
    public int geefStraal() {
        return 8;
    }
}
