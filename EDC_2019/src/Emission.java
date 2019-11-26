package csa;

public class Emission {
	
	private int id;
	private String titre;
	private String titreOriginal;
	private String anneeProduction;
	private int numSaison;
	private String sonGenre;
	
	public Emission(int unId, String unTitre, String unTitreOriginal, String uneAnneeProduction, int unNumSaison, String unGenre) {
		this.id = unId;
		this.titre = unTitre;
		this.titreOriginal = unTitreOriginal;
		this.anneeProduction = uneAnneeProduction;
		this.numSaison = unNumSaison;
		this.sonGenre = unGenre;
	}
	public Emission(int unId, String unTitre) {
		this.id = unId;
		this.titre = unTitre;
		this.titreOriginal = "";
		this.anneeProduction = "";
		this.numSaison = 0;
		this.sonGenre = "";
		}
	
	public void saisir () {
		System.out.println("Saisir l'id : ");
		this.id = Console.saisirInt();
		System.out.println("Saisir le titre :");
		this.titre = Console.saisirString();
		System.out.println("Saisir le titre original :");
		this.titreOriginal = Console.saisirString();
		System.out.println("Saisir l'année de production :");
		this.anneeProduction = Console.saisirString();
		System.out.println("Saisir un numero de saison : ");
		this.numSaison = Console.saisirInt();
		System.out.println("Saisir son genre");
		this.sonGenre = Console.saisirString();
	}
	public void afficher () {
		System.out.println("L'id :"+this.id);
		System.out.println("Le titre :"+this.titre);
		System.out.println("Le titre original :"+this.titreOrigianl);
		System.out.println("L'année de production :"+this.id);
		System.out.println("Le numéro de saison :"+this.id);
		System.out.println("Le genre :"+this.id);
	}
	public String toString () {
		
	}
	public String toXml () {
		
	}
	
	
	//Getters and setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getTitreOriginal() {
		return titreOriginal;
	}
	public void setTitreOriginal(String titreOriginal) {
		this.titreOriginal = titreOriginal;
	}
	public String getAnneeProduction() {
		return anneeProduction;
	}
	public void setAnneeProduction(String anneeProduction) {
		this.anneeProduction = anneeProduction;
	}
	public int getNumSaison() {
		return numSaison;
	}
	public void setNumSaison(int numSaison) {
		this.numSaison = numSaison;
	}
	public String getSonGenre() {
		return sonGenre;
	}
	public void setSonGenre(String sonGenre) {
		this.sonGenre = sonGenre;
	}

	
	
}
