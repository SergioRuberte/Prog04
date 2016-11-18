import java.util.*;
public class Codigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		String años="1990 1991 1992 1993 1994 1995";
		String sexo="HM";
		String curso="12";
		String codigo="";
		boolean verif=true;
		do{
			System.out.println("Inserte un código:");
			codigo=teclado.nextLine();
			if (codigo.substring(0, 3).equals("1995")){
				//!cadena1.equals(cadena2);
			}
		}while(verif=false);
	}

}
