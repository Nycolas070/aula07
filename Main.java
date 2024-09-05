package principal;

import java.util.Scanner;
import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main {
	
	public static void main(String[] args) {


		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Qual tipo de animal você quer? cachorro, gato ou Vaca ?");
		        String tipoAnimal = scanner.nextLine().toLowerCase();
		        
		        
		        switch (tipoAnimal) {
		            case "cachorro":
		                Cachorro cachorro = new Cachorro();
		                System.out.println("O barulho do animal é: " + cachorro.emitirBarulho());
		                break;
		            case "gato":
		                Gato gato = new Gato();
		                System.out.println("O barulho do animal é: " + gato.emitirBarulho());
		                break;
		            case "vaca":
		            	Vaca vaca = new Vaca();
		            	System.out.println("O barulho do animal é: " + vaca.emitirBarulho());
		            	break;
		            default:
		                System.out.println("Tipo de animal não reconhecido.");
		        }
		        
		        
		        scanner.close();
		    }
		

	}

