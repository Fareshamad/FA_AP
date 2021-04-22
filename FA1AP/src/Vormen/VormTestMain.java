package Vormen;

public class VormTestMain {
    public static void main(String[] args) {
        Vierkant vierkant = new Vierkant();
        System.out.println(vierkant);


        Rechthoek rechthoek = new Rechthoek();
        System.out.println(rechthoek);

        Cirkel cirkel = new Cirkel();
        System.out.println(cirkel);
        System.out.println("De straal is: \t\t\t\t\t\t\t" + cirkel.geefStraal());

        Ellips ellips = new Ellips();
        System.out.println(ellips);
        System.out.println("De straal is: \t\t\t\t\t\t\t" + ellips.geefStraal());
    }
}