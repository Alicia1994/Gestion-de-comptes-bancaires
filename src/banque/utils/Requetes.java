package banque.utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import banque.connexion.AccesBD;
import banque.model.Compte;
import banque.model.Operation;
import banque.model.Titulaire;
import banque.model.TypeCompte;

public class Requetes {

	// *********** Méthode pour add un Type_Compte

	public static void addTypeCompte(TypeCompte typeCompte) throws SQLException {
		PreparedStatement prepareStatement = AccesBD.getConnection()
				.prepareStatement("INSERT INTO `TYPE_COMPTE` VALUES( ? , ?)");
		prepareStatement.setInt(1, typeCompte.getCodeTypeCompte());
		prepareStatement.setString(2, typeCompte.getIntituleCompte());
		prepareStatement.execute();
	}

	// *********** Méthode pour add une Operation

	public static void addOperation(Operation operation) throws SQLException {
		PreparedStatement prepareStatement = AccesBD.getConnection()
				.prepareStatement("INSERT INTO `OPERATIONS` VALUES( ? , ?, ?, ?, ?, ?)");

		prepareStatement.setInt(1, operation.getNumeroOperation());
		prepareStatement.setInt(2, operation.getNumeroCompte());
		prepareStatement.setString(3, operation.getDateOperation());
		prepareStatement.setString(4, operation.getLibelleOperation());
		prepareStatement.setFloat(5, operation.getMontantOperation());
		prepareStatement.setString(6, operation.getTypeOperation());
		prepareStatement.execute();
	}
	
	// *********** Méthode pour add un Compte

		public static void addCompte(Compte compte) throws SQLException {
			PreparedStatement prepareStatement = AccesBD.getConnection()
					.prepareStatement("INSERT INTO `COMPTE` VALUES( ?, ?, ?, ?)");

			prepareStatement.setInt(1, compte.getNumeroCompte());
			prepareStatement.setInt(2, compte.getCodeTypeCompte());
			prepareStatement.setInt(3, compte.getCodeTitulaire());
			prepareStatement.setFloat(4, compte.getSoldeCompte());
			prepareStatement.execute();
		}
		
		// *********** Méthode pour add un Titulaire

				public static void addTitulaire(Titulaire titulaire) throws SQLException {
					PreparedStatement prepareStatement = AccesBD.getConnection()
							.prepareStatement("INSERT INTO `Titulaire` VALUES( ?, ?, ?, ?)");

					prepareStatement.setString(1, titulaire.getPrenomTitulaire());
					prepareStatement.setString(2, titulaire.getNomTitulaire());
					prepareStatement.setString(3, titulaire.getAdresseTitulaire());
					prepareStatement.setString(4, titulaire.getCodePostalTitulaire());
					prepareStatement.execute();
				}

	// ******** methode pour update un Type_Compte

	public static void updateTypeCompte(TypeCompte typeCompte) throws SQLException {
		try {
			PreparedStatement prepareStatement = AccesBD.getConnection()
					.prepareStatement("UPDATE TYPE_COMPTE SET intitule_compte = ? WHERE code_type_compte = ? ");
			prepareStatement.setString(1, typeCompte.getIntituleCompte());
			prepareStatement.setInt(2, typeCompte.getCodeTypeCompte());
			prepareStatement.executeUpdate();
			System.out.println("Modification effectuee pour le typeCompte : " + typeCompte);

		} catch (SQLException e) {
			System.out.println("Erreur lors de la modification !");
		}
	}
	
	// ******** methode pour update un Titulaire

		public static void updateTitulaire(Titulaire titulaire) throws SQLException {
			try {
				PreparedStatement prepareStatement = AccesBD.getConnection()
						.prepareStatement("UPDATE TITULAIRE SET prenom_titulaire = ? WHERE code_titulaire = ? ");
				prepareStatement.setString(1, titulaire.getPrenomTitulaire());
				prepareStatement.setInt(2, titulaire.getCodeTitulaire());
				prepareStatement.executeUpdate();
				System.out.println("Modification effectuee pour le Titulaire : " + titulaire);

			} catch (SQLException e) {
				System.out.println("Erreur lors de la modification !");
			}
		}
		
		// ******** methode pour update un Compte

				public static void updateCompte(Compte compte) throws SQLException {
					try {
						PreparedStatement prepareStatement = AccesBD.getConnection()
								.prepareStatement("UPDATE Compte SET solde_compte = ? WHERE numero_compte = ? ");
						prepareStatement.setFloat(1, compte.getSoldeCompte());
						prepareStatement.setInt(2, compte.getNumeroCompte());
						prepareStatement.executeUpdate();
						System.out.println("Modification effectuee pour le Compte : " + compte);

					} catch (SQLException e) {
						System.out.println("Erreur lors de la modification !");
					}
				}
				
				// ******** methode pour update une Operation

				public static void updateOperation(Operation operation) throws SQLException {
					try {
						PreparedStatement prepareStatement = AccesBD.getConnection()
								.prepareStatement("UPDATE Operations SET numero_operation = ? WHERE numero_compte = ? ");
						prepareStatement.setFloat(1, operation.getNumeroOperation());
						prepareStatement.setInt(2, operation.getNumeroCompte());
						prepareStatement.executeUpdate();
						System.out.println("Modification effectuee pour le Operation : " + operation);

					} catch (SQLException e) {
						System.out.println("Erreur lors de la modification !");
					}
				}

	// ******* methode pour delete un Type_Compte

	public static void deleteTypeCompte(TypeCompte typeCompte) throws SQLException {
		Statement statement = null;

		try {
			statement = AccesBD.getConnection().createStatement();
			String sql = "DELETE FROM TYPE_COMPTE WHERE code_type_compte =" + typeCompte.getCodeTypeCompte();
			statement.executeUpdate(sql);
			System.out.println("Suppression du typeCompte " + typeCompte + " effectuee");
		} catch (SQLException e) {
			System.out.println("Erreur lors de la suppression du typeCompte !");
		}
	}
	
	// ******* methode pour delete un Operation

		public static void deleteOperation(Operation operation) throws SQLException {
			Statement statement = null;

			try {
				statement = AccesBD.getConnection().createStatement();
				String sql = "DELETE FROM Operations WHERE numero_operation =" + operation.getNumeroOperation();
				statement.executeUpdate(sql);
				System.out.println("Suppression de l'operarion numero : " + operation + " effectuee");
			} catch (SQLException e) {
				System.out.println("Erreur lors de la suppression de l'operation !");
			}
		}
		
		// ******* methode pour delete un Compte

				public static void deleteCompte(Compte compte) throws SQLException {
					Statement statement = null;

					try {
						statement = AccesBD.getConnection().createStatement();
						String sql = "DELETE FROM COMPTE WHERE numero_compte =" + compte.getNumeroCompte();
						statement.executeUpdate(sql);
						System.out.println("Suppression du compte : " + compte + " effectuee");
					} catch (SQLException e) {
						System.out.println("Erreur lors de la suppression du compte !");
					}
				}
				
				// ******* methode pour delete un Titulaire

				public static void deletetitulaire(Titulaire titulaire) throws SQLException {
					Statement statement = null;

					try {
						statement = AccesBD.getConnection().createStatement();
						String sql = "DELETE FROM TITULAIRES WHERE numero_compte =" + titulaire.getCodeTitulaire();
						statement.executeUpdate(sql);
						System.out.println("Suppression du titulaire : " + titulaire + " effectuee");
					} catch (SQLException e) {
						System.out.println("Erreur lors de la suppression du titulaire !");
					}
				}

	// ******* methode pour select un Type_Compte

	public static ArrayList<TypeCompte> getAllTypeCompte() throws ClassNotFoundException, SQLException

	{
		ArrayList<TypeCompte> typeComptes = new ArrayList<TypeCompte>();
		String requete = "SELECT * FROM TYPE_COMPTE ORDER BY code_type_compte";
		ResultSet resultat = AccesBD.executerQuery(requete);
		while (resultat.next()) {
			TypeCompte typeCompte = new TypeCompte();
			typeCompte.setCodeTypeCompte(resultat.getInt("code_type_compte"));
			typeCompte.setIntituleCompte(resultat.getString("intitule_compte"));

			typeComptes.add(typeCompte);

		}
		return typeComptes;
	}

	// ******* Requêtes SELECT pour lister des opérations pour un compte
	// sélectionné(INNER JOIN)

	public static ArrayList<Operation> getAllOperation() throws ClassNotFoundException, SQLException

	{
		ArrayList<Operation> operations = new ArrayList<Operation>();
		String requete = "SELECT * FROM Operations o\n" + "INNER JOIN compte c ON c.numero_compte = o.numero_compte\n"
				+ "WHERE numero_operation = 1";
		ResultSet resultat = AccesBD.executerQuery(requete);
		while (resultat.next()) {
			Operation operation = new Operation();
			operation.setNumeroOperation(resultat.getInt("numero_operation"));
			operation.setNumeroCompte(resultat.getInt("numero_compte"));
			operation.setDateOperation(resultat.getString("date_operation"));
			operation.setLibelleOperation(resultat.getString("libelle_operation"));
			operation.setMontantOperation(resultat.getFloat("montant"));
			operation.setTypeOperation(resultat.getString("type_operation"));

			operations.add(operation);

		}
		return operations;
	}

	// ****** Methode qui compte le nombre de TypeCompte

	public static int getNombreDeTypeCompte() throws SQLException {
		ResultSet resultat = AccesBD.getConnection().createStatement().executeQuery("SELECT count(*) FROM TYPE_COMPTE");
		resultat.next();
		return resultat.getInt(1);
	}

	// ****** Methode qui compte le nombre d'Operation

	public static int getNombreOperation() throws SQLException {
		ResultSet resultat = AccesBD.getConnection().createStatement().executeQuery("SELECT count(*) FROM OPERATIONS");
		resultat.next();
		return resultat.getInt(1);
	}

	// ******* Methode qui retourne les TypeCompte en fonction de leur code

	public static TypeCompte getTypeCompteByCode(int codeTypeCompte) throws ClassNotFoundException, SQLException

	{

		TypeCompte typeCompte = new TypeCompte();

		PreparedStatement aPreparedStatement = AccesBD.getConnection()
				.prepareStatement("SELECT * FROM TYPE_COMPTE WHERE code_type_compte = ?");
		aPreparedStatement.setInt(1, codeTypeCompte);
		ResultSet resultat = aPreparedStatement.executeQuery();
		resultat.next();
		typeCompte.setCodeTypeCompte(resultat.getInt("code_type_compte"));
		typeCompte.setIntituleCompte(resultat.getString("intitule_compte"));

		return typeCompte;

	}

}
