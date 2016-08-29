
import java.util.Set;

/** 
* Clase: Tables.java
* @author Diego Soler, Fredy Espana
* @version 28/08/16
*/

public class Tables<E> {
	Factory factory = new Factory();
	
	/* Conjuntos que se utilizaran */
	private Set<E> main_conjunto;
	private Set<E> temp_conjunto;
	private String may;
	
	/* Constructor */
	public Tables(int value){
		main_conjunto = factory.setTable(value);
		temp_conjunto = factory.setTable(value);
		may="";
	}
	
	/* Agregar un elemento */
	public void addElement (E value){
		main_conjunto.add(value);
	}
	
	/* Interseccion de tres conjuntos */
	public Set<E> getInterseccion(Set<E> conjuntoA, Set<E> conjuntoB, Set<E> conjuntoC){
		temp_conjunto.clear();
		temp_conjunto.addAll(conjuntoA);
		temp_conjunto.retainAll(conjuntoB);
		temp_conjunto.retainAll(conjuntoC);
		
		return temp_conjunto;
	}
	
	/* Interseccion de dos conjuntos */
	public Set<E> getInterseccion(Set<E> conjuntoA, Set<E> conjuntoB){
		temp_conjunto.clear();
        temp_conjunto.addAll(conjuntoA);
        temp_conjunto.retainAll(conjuntoB);
        return temp_conjunto;
	}
	
	/* Union de dos conjuntos */
	public Set<E> getUnion(Set<E> conjuntoA, Set<E> conjuntoB){
		temp_conjunto.clear();
		temp_conjunto.addAll(conjuntoA);
		return temp_conjunto;
	}
	
	/* Resta de conjuntos */
	public Set<E> getResta(Set<E> conjuntoA, Set<E> conjuntoB){
		temp_conjunto.clear();
		temp_conjunto.addAll(conjuntoA);
		temp_conjunto.removeAll(conjuntoB);
		return temp_conjunto;
	}
	
	/* Conjunto mas grande */
	public Set<E> getConjuntoMayor(Set<E> conjuntoA, Set<E> conjuntoB, Set<E> conjuntoC){
		temp_conjunto.clear();
	        if (conjuntoA.size()>=conjuntoB.size()){
	        	temp_conjunto.addAll(conjuntoA);
	            may="Desarrolladores Java";
	        }
	        else{
	        	temp_conjunto.addAll(conjuntoB);
	            may="Desarrolladores Web";
	        }
	        if (temp_conjunto.size()>=conjuntoC.size()){
	            return temp_conjunto;
	        }
	        else{
	           may="Desarrolladores Celulares";
	           return conjuntoC; 
	        }
	}
	
	/* ¿A es subconjunto de B ? */
	public boolean estaAenB(Set<E> conjuntoA, Set<E> conjuntoB){
		temp_conjunto.clear();
		temp_conjunto.addAll(conjuntoA);
		temp_conjunto.retainAll(conjuntoB);
		if (temp_conjunto.size()==conjuntoA.size()){
			return true;
		}
		else{
			return false;
		}
	}
	
	/* ToString que imprime el conjunto con sus elementos de manera ascendente */
	public String conjuntoToString(Set<E> conjuntoA){
		String cadena= conjuntoA.toString();
        cadena=cadena.replace("]", "");
        cadena=cadena.replace("[", " ");
        cadena=cadena.replace(",", "\n");
        return cadena;
        
    }
	
	
}
