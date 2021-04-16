package banque.model;

public class Operation {

	private int numeroOperation;
	private int numeroCompte;
	private String DateOperation;
	private String libelleOperation;
	private float montantOperation;
	private String typeOperation;

	public Operation(int numeroOperation, int numeroCompte, String DateOperation, String libelleOperation,
			float montantOperation, String typeOperation) {
		this.numeroOperation = numeroOperation;
		this.numeroCompte = numeroCompte;
		this.DateOperation = DateOperation;
		this.libelleOperation = libelleOperation;
		this.montantOperation = montantOperation;
		this.typeOperation = typeOperation;
	}

	public Operation() {

	}

	public int getNumeroOperation() {
		return numeroOperation;
	}

	public void setNumeroOperation(int numeroOperation) {
		this.numeroOperation = numeroOperation;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getDateOperation() {
		return DateOperation;
	}

	public void setDateOperation(String DateOperation) {
		this.DateOperation = DateOperation;
	}

	public String getLibelleOperation() {
		return libelleOperation;
	}

	public void setLibelleOperation(String libelleOperation) {
		this.libelleOperation = libelleOperation;
	}

	public float getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(float montantOperation) {
		this.montantOperation = montantOperation;
	}

	public String getTypeOperation() {
		return typeOperation;
	}

	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}

	@Override
	public String toString() {
		return "Operation [numeroOperation=" + numeroOperation + ", numeroCompte=" + numeroCompte + ", StringOperation="
				+ DateOperation + ", libelleOperation=" + libelleOperation + ", montantOperation=" + montantOperation
				+ ", typeOperation=" + typeOperation + "]";
	}

}
