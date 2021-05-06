package Vormen;

public class VormTestMain {
    public static void main(String[] args) {
        Vierkant vierkant = new Vierkant(5);
        System.out.println(vierkant);

        Rechthoek rechthoek = new Rechthoek(6,9);
        System.out.println(rechthoek);

        Cirkel cirkel = new Cirkel(3);
        System.out.println(cirkel);
        System.out.println("De straal is: \t\t\t\t\t\t\t" + cirkel.geefStraal());

        Ellips ellips = new Ellips(4,3,5);
        System.out.println(ellips);
        System.out.println("De straal is: \t\t\t\t\t\t\t" + ellips.geefStraal());
    }
}