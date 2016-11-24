import java.util.Scanner;

public class Palindromos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String cadena, cadenareves="";
		String letra;
		int cont=0, i,j;
		System.out.println("Introduce una cadena:");
		cadena=teclado.nextLine();
		i=0;
		j=cadena.length();
		while(i<cadena.length()&&j>0){
			if(cadena.substring(i, i+1).equals(cadena.substring(j-1, j))){
				cont++;
			}
			i++;
			j--;
		}
		
		if (cont==cadena.length()){
			System.out.println(cadena+" Es un palíndromo");
		}else{
			System.out.println(cadena+" No es un palíndromo");
		}
	}

}
