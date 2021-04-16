package banque.model;

public class TypeCompte {

	private int codeTypeCompte;
	private String intituleCompte;

	public TypeCompte(int codeTypeCompte, String intituleCompte) {
		super();
		this.codeTypeCompte = codeTypeCompte;
		this.intituleCompte = intituleCompte;
	}

	public TypeCompte() {

	}

	public TypeCompte(int codeTypeCompte) {

	}

	public int getCodeTypeCompte() {
		return codeTypeCompte;
	}

	public void setCodeTypeCompte(int codeTypeCompte) {
		this.codeTypeCompte = codeTypeCompte;
	}

	public String getIntituleCompte() {
		return intituleCompte;
	}

	public void setIntituleCompte(String intituleCompte) {
		this.intituleCompte = intituleCompte;
	}

	@Override
	public String toString() {
		return "TypeCompte [codeTypeCompte=" + codeTypeCompte + ", intituleCompte=" + intituleCompte + "]";
	}

}
