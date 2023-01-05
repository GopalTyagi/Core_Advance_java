package in.co.Generics;

import java.util.ArrayList;
import java.util.Collection;

public class GenericsMethods {
	
	public static <T> void copyArrayToCollections(T[] a,Collection<T>c) {
		
		for(T o : a) {
			c.add(o);  //add an array element
		}
	}
	
	public static void main(String[] args) {
		Integer[] iArray = new Integer[100];
		Collection<Integer> icol =  new ArrayList<Integer>();
		copyArrayToCollections(iArray,icol);
		
		Float[] fArray = new Float[101];
		Collection<Float> fcol = new ArrayList<Float>();
		copyArrayToCollections(fArray,fcol);
		
	}

}
