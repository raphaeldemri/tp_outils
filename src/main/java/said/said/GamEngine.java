package said.said;

import java.util.Random;
import java.util.Scanner;

public class GamEngine {

		
		int min=0;
		int max=100;
		int nombreAleatoire = min + (int)(Math.random() * ((max - min) + 1));

		
	
		
		
		public String resultat(int numberUtil) {
			if(this.nombreAleatoire == numberUtil) {
				return "C'est le bon resultat";
			}else if(this.nombreAleatoire > numberUtil) {
				return "le chiffre que tu recherches est plus grand";
			}else {
				return "le chiffre que tu recherches est plus petit";
			}
		}
		
		public void partie() {
			
			Scanner sc = new Scanner(System.in);
			Utilisateur u= new Utilisateur();
			int nbtest =sc.nextInt();
			sc.nextLine();
			System.out.println(this.resultat(nbtest));
			while (!this.resultat(nbtest).equalsIgnoreCase("C'est bon")) {
				nbtest =sc.nextInt();

				System.out.println(this.resultat(nbtest));
			}	
			
			
		}
		
	
		
	}

	