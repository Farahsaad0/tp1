import java.util.Date;

public class Produit {
     int id;
     String libelle;
     String marque;
     double prix;
    Date dateExpiration;



     public Produit(int id, String libelle, String marque, double prix) {

         this.id = id;
         this.libelle=libelle;
         this.marque=marque;
         this.prix=prix;
     }

    public Produit() {
    }

    public Produit(int id, String libelle, String marque) {

        this.id = id;
        this.libelle=libelle;
        this.marque=marque;

    }
    public void afficher(){
         System.out.println("ID: "+id+"\nLibelle: "+libelle+"\nMarque: "+marque+"\nPrix: "+prix);
    }


    public String toString() {
        return "Produit{" + "id=" + id + ", libelle='" + libelle + '\'' + ", marque='" + marque + '\'' + ", prix=" + prix + '}';
    }
}
