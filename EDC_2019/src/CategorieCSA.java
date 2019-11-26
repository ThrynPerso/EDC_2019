package csa;

public class CategorieCSA {
	private String id, libelle;
	
	public CategorieCSA (String id, String libelle) {
		this.id= id;
		this.libelle = libelle;
	}
	
	public void saisir () {
		System.out.println("Saisir l'id : ");
		this.id = Console.saisirString();
		System.out.println("Saisir le libellé :");
		this.libelle = Console.saisirString;
	}
	
	public void afficher() {
		System.out.println("Voici l'id : "+this.id);
		System.out.println("Voici le libellé : "+this.libelle);
	}
	
	public String toString() {
		return this.id+","+this.libelle;
	}
	
	public String toXml() {
		String chaine = "";
		chaine = "<Categorie>\n";
		chaine += "\t<id>"+this.id+"</id>\n";
		chaine += "\t<libelle>"+this.libelle+"</libelle>\n";
		chaine += "</Categorie>\n";
		return chaine;
	}

		//getters and setters
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
