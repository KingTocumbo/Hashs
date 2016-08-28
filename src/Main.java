import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 /* Atributos */
		Scanner scan = new Scanner(System.in);
		boolean menu_active = true;
		int implementacion = 0;
		String line = "************************************";
		
		 
		/* Mensaje de bienvenida y solicitud de implementacion */
		while(menu_active){
			System.out.println(line);
			System.out.println("Bienvenido a la base de datos DEVELOPEOPLE ");
			System.out.println("Por favor seleccione una implementacion para sus listas: ");
			System.out.println("1. HashTable \n2. LinkedHashTable \n3. TreeTable\n");
			System.out.println(line);
			implementacion = Integer.valueOf(scan.nextLine());
			
			switch(implementacion){
				case 1:
					System.out.println("Ha seleccionado la implementacion HASHTABLE");
					menu_active = false;
					break;
				case 2:
					System.out.println("Ha seleccionado la implementacion LINKEDHASHTABLE");
					menu_active = false;
					break;
				case 3:
					System.out.println("Ha seleccionado la implementacion TREETABLE");
					menu_active = false;
					break;
			}
		}
		
		/* Conjuntos de desarrolladores */
		Tables conjunto_Java = new Tables(implementacion);
		Tables conjunto_Web = new Tables(implementacion);
		Tables conjunto_Movil = new Tables(implementacion);
		menu_active = true; /* Reset menu_active */
	
		/* Ingreso de datos */
		while(menu_active){
			String nombre = " "; /* Nombre, al inicio de while para auto reset */
			Integer trabajo = 0; /* Trabajo, al inicio de while para auto reset */
			
			System.out.println("Ingrese el nombre del desarrollador: ");
			nombre = scan.nextLine();
			
			System.out.println("Seleccione sus habilidades:");
			System.out.println("1. Java \n2. Web \n3. Moviles");
			System.out.println("Puede seleccionar varias ej: 123 = Java, Web y Moviles; 23 = Web y Moviles");
			trabajo = Integer.valueOf(scan.nextLine());
			
			switch(trabajo){
				case 1:
					conjunto_Java.addElement(nombre);
					break;
				case 2:
					conjunto_Web.addElement(nombre);
					break;
				case 3:
					conjunto_Movil.addElement(nombre);
					break;
				case 12:
					conjunto_Java.addElement(nombre);
					conjunto_Web.addElement(nombre);
					break;
				case 13:
					conjunto_Java.addElement(nombre);
					conjunto_Movil.addElement(nombre);
					break;
				case 123:
					conjunto_Java.addElement(nombre);
					conjunto_Web.addElement(nombre);
					conjunto_Movil.addElement(nombre);
					break;
				case 23:
					conjunto_Web.addElement(nombre);
					conjunto_Movil.addElement(nombre);
					break;
			}
			
			System.out.println("Desea agregar otra persona? \n1. SI \n2. NO");
			int temp = Integer.valueOf(scan.nextLine());
			if(temp == 2)
				menu_active = false;
				
			
		}
	}

}