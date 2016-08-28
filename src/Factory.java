import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Factory <E> {
	
	/* El metodo recibe un numero entero para crear la lista y la retorna */
	public Set<E> setTable(int type){
		
		Set<E> lista = null;
		
		switch(type){
			case 1:
				lista = new TreeSet<E>();
				break;
			case 2:
				lista = new HashSet<E>();
				break;
			case 3:
				lista = new LinkedHashSet<E>();
				break;
		}
		return lista;
	}

}
