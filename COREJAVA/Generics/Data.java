package in.co.Generics;

public class Data<T> {
	
	// T is a type variable that will be replaced by a type class when object of
	// this class is created

	public T value; // declares an Object of type T

	public Data(T value) { // passes parameter of type T
		this.value = value;
	}

	T getValue() { // returns value of type T
		return value;
	}

	void showType() { // Shows data type of stored object
		System.out.println("Type of T is" + value.getClass().getName());
	}

}
