import java.util.*;
public class CambiaMayus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String cadena;
		String letra;
		System.out.println("Introduce una cadena:");
		cadena=teclado.nextLine();
		do{
		System.out.println("Introduce una letra:");
		letra=teclado.nextLine();
		}while(letra.length()>1);
		
		for(int i=0;i<cadena.length();i++){
			if(cadena.substring(i,i+1).equals(letra)){
				cadena=cadena.substring(0, i).concat(cadena.substring(i,i+1).toUpperCase()).concat(cadena.substring(i+1, cadena.length()));
			}
		}
		System.out.println(cadena);
	}
}
