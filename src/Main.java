import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Produit p1 = new Produit();

        Produit p2 = new Produit( 1021,"Lait","Delice");
        Produit p3 = new Produit( 2510,"Yaourt","Vitalait");
        Produit p4 = new Produit( 3250,"Tomate","Sicam", 1.200);

        p2.afficher();
        p3.afficher();
        p4.afficher();

        p2.prix=0.700;
        p3.prix=0.800;

        p1.id =5587;
        p1.libelle="eau";
        p1.marque="safia";
        p1.prix=0.900;

        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();


       System.out.println( p1.toString());
        System.out.println( p2.toString());
        System.out.println( p3.toString());
        System.out.println( p4.toString());



        p1.dateExpiration= new Date("08/02/2025");
        p2.dateExpiration= new Date("12/06/2025");
        p3.dateExpiration= new Date("06/11/2025");
        p4.dateExpiration= new Date("08/07/2025");



    }
}