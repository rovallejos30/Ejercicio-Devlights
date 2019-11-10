package devlights;
import java.util.Scanner;

import javax.swing.JOptionPane;

public final class main {

	public static void main(String[] args) {
			
		Scanner entrada= new Scanner (System.in);
		Scanner entrada2= new Scanner (System.in);
		int intentos; 
//		System.out.print("Ingrese numero de intentos: "); 
		intentos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de intentos: "));
		//intentos = entrada.nextInt();
		
				
		if ((intentos<1)||(intentos>10)) {
		
			JOptionPane.showMessageDialog(null, "Debe ingresar un numero entre 1 y 10",
					"Error", JOptionPane.WARNING_MESSAGE);
			System.exit(0);
			
			
		}
		
				
		boolean flag=true;
		
		int total= 0;
				
		for (int i = 1; i <= intentos; i++) {
		
			
	//		System.out.print("Ingrese cadena a tratar: ");
			
			String car=JOptionPane.showInputDialog("Ingrese cadena a tratar: ");
			char[] caracteres;
		//	caracteres = (entrada2.nextLine()).toCharArray();
			caracteres= car.toCharArray();
			
			if ((caracteres.length<1)) {
				do {
					JOptionPane.showMessageDialog(null,"Debe ingresar una palabra mas larga");
					car=JOptionPane.showInputDialog("Ingrese cadena a tratar: ");
					
					caracteres= car.toCharArray();
				} while (caracteres.length<1);
				
				
			} else if (caracteres.length>100000) {
				do {
					JOptionPane.showMessageDialog(null,"Debe ingresar una palabra mas corta");
					car=JOptionPane.showInputDialog("Ingrese cadena a tratar: ");
						
					caracteres= car.toCharArray();
				} while (caracteres.length>100000);
			}
			
				
			
			for (int j=0; j<caracteres.length; j++) {
				
				
				int cont = 0;
				int punt= j;
				int punt1 = 0;
				
				
				for (int k=punt; k<caracteres.length;k++) {
					
					if ((flag=true) && (caracteres[k]==caracteres[punt1])) {
						cont = cont + 1;
						
						
					} else if (caracteres[k]!=caracteres[punt1]){
								flag= false;
								break;
					}
				
					punt1= punt1 + 1;
					
				}
				
				total= total + cont;
			
			}
			
			
	/*			System.out.print(total);
				System.out.println();	*/
			
				JOptionPane.showMessageDialog(null, total);
				total=0;		
			
			
			}
	
	}
	
}
	
