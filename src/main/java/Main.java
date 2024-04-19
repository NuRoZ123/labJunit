public class Main {
    public static void main(String[] args) {
        Calculatrice c = new Calculatrice();

        double s = c.somme(10, 20);
        System.out.println("la somme de 10 et 20 est " + s);

        double p = c.produit(10, 20);
        System.out.println("le produit de 10 et 20 est " + p);

        System.out.println("webhook 3");
    }
}
