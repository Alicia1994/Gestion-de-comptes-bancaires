package banque.model;

public class Compte {

	private int numeroCompte;
	private char codeTypeCompte;
	private int codeTitulaire;
	private float soldeCompte;

	public Compte(int numeroCompte, char codeTypeCompte, int codeTitulaire, float soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.codeTypeCompte = codeTypeCompte;
		this.codeTitulaire = codeTitulaire;
		this.soldeCompte = soldeCompte;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public char getCodeTypeCompte() {
		return codeTypeCompte;
	}

	public void setCodeTypeCompte(char codeTypeCompte) {
		this.codeTypeCompte = codeTypeCompte;
	}

	public int getCodeTitulaire() {
		return codeTitulaire;
	}

	public void setCodeTitulaire(int codeTitulaire) {
		this.codeTitulaire = codeTitulaire;
	}

	public float getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(float soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", codeTypeCompte=" + codeTypeCompte + ", codeTitulaire="
				+ codeTitulaire + ", soldeCompte=" + soldeCompte + "]";
	}

}
