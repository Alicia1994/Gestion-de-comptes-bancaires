package banque;

import java.util.ArrayList;

import banque.model.Operation;
import banque.model.TypeCompte;
import banque.utils.Requetes;

public class Application {

	public static void main(String[] args) {

		try {

			// ******* Requêtes SELECT pour lister des opérations pour un compte
			// sélectionné.

			System.out.println("\n\nListe des Operations avec getAllOperations() :\n");
			ArrayList<Operation> operations = new ArrayList<Operation>();
			operations = Requetes.getAllOperation();
			for (Operation operation : operations) {
				System.out.println(operation);
			}

			// ******* Requêtes SELECT pour TypeCompte

			System.out.println("\n\nListe des TypeCompte avec getAllTypeComptes() :\n");
			ArrayList<TypeCompte> typeComptes = new ArrayList<TypeCompte>();
			typeComptes = Requetes.getAllTypeCompte();
			for (TypeCompte typeCompte : typeComptes) {
				System.out.println(typeCompte);
			}

//			// ******* Requêtes INSERT EN A_I
//
//			// creation et add de mon objet "nouveauTypeCompte" de type TypeCompte (en A_I)
//			TypeCompte nouveauTypeCompte = new TypeCompte();
//			nouveauTypeCompte.setCodeTypeCompte(Requetes.getNombreDeTypeCompte() + 1);
//			nouveauTypeCompte.setIntituleCompte("CEL");
//			Requetes.addTypeCompte(nouveauTypeCompte);

			// creation et add de mon objet de type Operation (en A_I)
			Operation nouvelOperation = new Operation();
			nouvelOperation.setNumeroOperation(Requetes.getNombreOperation() + 1);
			nouvelOperation.setNumeroCompte(2);
			nouvelOperation.setDateOperation("2021-03-02");
			nouvelOperation.setLibelleOperation("paiement");
			nouvelOperation.setMontantOperation(500);
			nouvelOperation.setTypeOperation("-");

			// nouvelOperation.setIntituleCompte("CEL");
			Requetes.addOperation(nouvelOperation);

////			// ****** Requêtes UPDATE
//			TypeCompte compteEpargne = Requetes.getTypeCompteByCode(4);
//			compteEpargne.setIntituleCompte("compte_epargne");
//			Requetes.updateTypeCompte(compteEpargne);
//			
//			// ****** Requete DELETE
//			TypeCompte compteEpargne = Requetes.getTypeCompteByCode(4);
//			if (compteEpargne != null) {
//				System.out.println(compteEpargne);
//
//				// je le supprime (pan !! pan !! il est mort... dans la base de donn�es
//				// uniquement ;) nous ne sommes pas une organisation criminelle !!
//
//				Requetes.deleteTypeCompte(compteEpargne);
//
//			}

		} catch (

		Exception e) {
			System.out.println("Zut, la connexion a échoué");
			e.printStackTrace();
		}

//		} catch (
//
//		ClassNotFoundException e) {
//
//			e.printStackTrace();
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}

	}

}