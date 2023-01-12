import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		esegui();
	}

	public static void esegui() {
		int selezioneOpzione;
		do {
			System.out.println("Quale metodo vuoi usare? 1-Per if; 2-per switch");
			int selezioneMetodo = new Scanner(System.in).nextInt();
			int operando, operando2, ris;
			System.out.println("Scegli operazione: 1-Addizione; 2-Sottrazione; 3- Moltiplicazione; 4-Divisione");
			int selezione = new Scanner(System.in).nextInt();
			if (selezioneMetodo == 1) {

				if (selezione == 1) {
					System.out.println("ADDIZIONE");
					System.out.println("dammi primo operando");
					operando = new Scanner(System.in).nextInt();
					System.out.println("dammi secondo operando");
					operando2 = new Scanner(System.in).nextInt();
					ris = Calc.addizione(operando, operando2);
					System.out.println("risultato");
					System.out.println(ris);
				}
				if (selezione == 2) {
					System.out.println("SOTTRAZIONE");
					System.out.println("dammi il primo operando");
					operando = new Scanner(System.in).nextInt();

					System.out.println("dammi secondo operando");
					operando2 = new Scanner(System.in).nextInt();

					ris = Calc.sottrazione(operando, operando2);
					System.out.println("risultato");
					System.out.println(ris);
				}
				if (selezione == 3) {
					System.out.println("MOLTIPLICAZIONE");
					System.out.println("dammi il primo operando");
					operando = new Scanner(System.in).nextInt();

					System.out.println("dammi secondo operando");
					operando2 = new Scanner(System.in).nextInt();

					ris = Calc.moltiplicazione(operando, operando2);
					System.out.println("risultato");
					System.out.println(ris);
				}
				if (selezione == 4) {
					System.out.println("DIVISIONE");
					System.out.println("dammi il primo operando");
					operando = new Scanner(System.in).nextInt();

					System.out.println("dammi secondo operando");
					operando2 = new Scanner(System.in).nextInt();

					ris = Calc.divisione(operando, operando2);
					System.out.println("risultato");
					System.out.println(ris);
				}
			} else if (selezioneMetodo == 2) {

				switch (selezione) {
				case 1: {
					System.out.println("ADDIZIONE");
					System.out.println("dammi il primo operando");
					operando = new Scanner(System.in).nextInt();

					System.out.println("dammi secondo operando");
					operando2 = new Scanner(System.in).nextInt();

					ris = Calc.addizione(operando, operando2);
					System.out.println("risultato");
					System.out.println(ris);
					break;
				}

				case 2: {
					System.out.println("SOTTRAZIONE");
					System.out.println("dammi il primo operando");
					operando = new Scanner(System.in).nextInt();

					System.out.println("dammi secondo operando");
					operando2 = new Scanner(System.in).nextInt();

					ris = Calc.sottrazione(operando, operando2);
					System.out.println("risultato");
					System.out.println(ris);
					break;
				}

				case 3: {
					System.out.println("MOLTIPLICAZIONE");
					System.out.println("dammi il primo operando");
					operando = new Scanner(System.in).nextInt();

					System.out.println("dammi secondo operando");
					operando2 = new Scanner(System.in).nextInt();

					ris = Calc.moltiplicazione(operando, operando2);
					System.out.println("risultato");
					System.out.println(ris);
					break;
				}
				case 4: {
					System.out.println("DIVISIONE");
					System.out.println("dammi il primo operando");
					operando = new Scanner(System.in).nextInt();

					System.out.println("dammi secondo operando");
					operando2 = new Scanner(System.in).nextInt();

					ris = Calc.divisione(operando, operando2);
					System.out.println("risultato");
					System.out.println(ris);
					break;
				}
				default :{
					System.out.println("Scelta non disponibile");
				}
				}
			}
			System.out.println("Scegli operazione: 1-nuova operazione; 2-chiudi");
			selezioneOpzione = new Scanner(System.in).nextInt();
		} while (selezioneOpzione == 1);
	}
}