import java.util.Set;

public class Tables<E> {
	Factory factory = new Factory();
	
	/* Conjuntos que se utilizaran */
	private Set<E> main_conjunto;
	private Set<E> temp_conjunto;
	private Set<E> may;
	
	/* Constructor */
	public Tables(int value){
		main_conjunto = factory.setTable(value);
		temp_conjunto = factory.setTable(value);
		
	}
	
	/* Agregar un elemento */
	public void addElement (E value){
		main_conjunto.add(value);
	}
	
	/* Interseccion de tres conjuntos */
	public Set<E> getInterseccion(Set<E> conjuntoA, Set<E> conjuntoB, Set<E> conjuntoC){
		return null;
	}
	
	/* Interseccion de dos conjuntos */
	public Set<E> getInterseccion(Set<E> conjuntoA, Set<E> conjuntoB){
		return null;
	}
	
	/* Union de dos conjuntos */
	public Set<E> getUnion(Set<E> conjuntoA, Set<E> conjuntoB){
		return null;
	}
	
	/* Resta de conjuntos */
	public Set<E> getResta(Set<E> conjuntoA, Set<E> conjuntoB){
		return null;
	}
	
	/* Conjunto mas grande */
	public Set<E> getConjuntoMayor(Set<E> conjuntoA, Set<E> conjuntoB, Set<E> conjutoC){
		return null;
	}
	
	/* A es subconjunto de B ? */
	public boolean estaAenB(Set<E> conjuntoA, Set<E> conjuntoB){
		return false;
	}
	
	/* ToString */
	public String conjuntoToString(Set<E> conjuntoA){
		return " ";
	}
	
	
}
