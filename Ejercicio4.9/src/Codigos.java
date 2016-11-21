import java.util.*;
public class Codigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		String años="1990 1991 1992 1993 1994 1995";
		String sexo="HM";
		String curso="12";
		String codigo="";
		String codigos_totales="";
		int n = 0;
		String subaños="", subsexo="", subcurso="";
		do{
			do{
				System.out.println("Inserte un código de 8 caracteres:");
			codigo=teclado.nextLine();
			if (codigo.length()!=8){
				System.out.println("Tiene que ser de 8 caracteres");
			}
			}while(codigo.length()!=8);
			
			int año=Integer.parseInt(codigo.substring(0,4));
				if(año>=1995 || año<=1990){
					System.out.println("Año Correcto");			
				}else{
					System.out.println("Año Incorrecto");
				}
			
		}while(n!=1);
		System.out.println(codigo.substring(0, 4));
		System.out.println(codigo.substring(4, 5));
		System.out.println(codigo.substring(5, 6));
	}

}
