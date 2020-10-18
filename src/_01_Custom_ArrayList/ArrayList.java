package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	int size = 0;
	T[] arr;
	public ArrayList() {
		this.arr=(T[]) new Object[0];
		size = 0;
		
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		if (loc>=0 && loc<arr.length) {
			return arr[loc];
		}
		else {
			throw new IndexOutOfBoundsException(loc + "out of bounds");
		}
	}
	
	public void add(T val) {
		T[] arr2 = (T[]) new Object[arr.length+1];
		if (arr.length==0) {
			arr2[0]=val;
		}
		else {
			arr2[arr.length] = val;
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
		}
		arr = arr2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (loc>=0 && loc<arr.length) {		
		T[] arr2 = (T[]) new Object[arr.length+1];
		if (arr.length==0) {
			arr2[0]=val;
			
		}
		else {
			for (int i = 0; i < arr.length; i++) {
				if (i==loc) {
					arr2[i]=val;
					
				}
				else if (i<loc) {
					arr2[i] = arr[i];

				}
				if (i>loc) {
					arr2[i+1] = arr[i];
				}
			}
		}
		arr = arr2;
		}
		else {
			
			throw new IndexOutOfBoundsException(loc + "out of bounds");
		}
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}