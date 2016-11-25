import java.util.*;
public class CuentaVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecaldo=new Scanner(System.in);
		String frase;
		int contA=0, contE=0, contI=0, contO=0, contU=0;
		frase=tecaldo.nextLine();
		for (int i=0; i<frase.length();i++){
			if(frase.charAt(i)=='a' || frase.charAt(i)=='A'){
				contA++;
			}else if(frase.charAt(i)=='e' || frase.charAt(i)=='E'){
				contE++;
			}else if(frase.charAt(i)=='i' || frase.charAt(i)=='I'){
				contI++;
			}else if(frase.charAt(i)=='o' || frase.charAt(i)=='O'){
				contO++;
			}else if(frase.charAt(i)=='u' || frase.charAt(i)=='U'){
				contU++;
			}
		}
		if(contA>contE&&contA>contI&&contA>contO&&contA>contU){
			System.out.println("La vocal que mas se repite es la a: "+contA);
		
		}else if(contE>contA && contE>contI && contE>contO && contE>contU){
			System.out.println("La vocal que mas se repite es la e: "+contE);
		
		}else if(contI>contE && contI>contA && contI>contO && contI>contU){
			System.out.println("La vocal que mas se repite es la i: "+contI);
		
		}else if(contO>contE && contO>contI && contO>contA && contO>contU){
			System.out.println("La vocal que mas se repite es la o: "+contO);
		
		}else if(contU>contE && contU>contI && contU>contO && contU>contA){
			System.out.println("La vocal que mas se repite es la u: "+contU);
		}else{
			System.out.println("Ninguna vocal tiene más repeticiones que las demás");
			System.out.println("La vocal a aparece "+contA+" veces");
			System.out.println("La vocal e aparece "+contE+" veces");
			System.out.println("La vocal i aparece "+contI+" veces");
			System.out.println("La vocal o aparece "+contO+" veces");
			System.out.println("La vocal u aparece "+contU+" veces");
		}
	}

}
