package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	int size = 0;
	T[] arr;

	public ArrayList() {
		this.arr = (T[]) new Object[0];
		size = 0;

	}

	public T get(int loc) throws IndexOutOfBoundsException {
		if (loc >= 0 && loc < arr.length) {
			return arr[loc];
		} else {
			throw new IndexOutOfBoundsException(loc + "out of bounds");
		}
	}

	public void add(T val) {
		T[] arr2 = (T[]) new Object[arr.length + 1];
		if (arr.length == 0) {
			arr2[0] = val;
		} else {
			arr2[arr.length] = val;
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
		}
		arr = arr2;
	}
	public void printArray() {
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if ((loc >= 0 && loc < arr.length) || (loc==0 && arr.length==0)) {
			
			T[] arr2 = (T[]) new Object[arr.length + 1];
			if (arr.length == 0) {
				arr2[0] = val;

			} else {
				for (int i = 0; i < arr.length+1; i++) {
					if (i == loc) {
						arr2[i] = val;

					} else if (i < loc) {
						arr2[i] = arr[i];

					} else if (i > loc) {
						arr2[i] = arr[i-1];
					}
				}
			}
			arr = arr2;
		} else {

			throw new IndexOutOfBoundsException(loc + "out of bounds");
		}
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if (loc >= 0 && loc < arr.length) {
			arr[loc] = val;

		} else {
			throw new IndexOutOfBoundsException(loc + "out of bounds");
		}
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		printArray();
		if(loc >= 0 && loc < arr.length) {
		T[] arr2 = (T[]) new Object[arr.length - 1];
			
			for (int i = 0; i < arr.length-1; i++) {
					if (i < loc) {
						arr2[i] = arr[i];

					} else if (i >= loc) {
						arr2[i] = arr[i+1];
					}
			}
			arr = arr2;
			printArray();
		} else {

			throw new IndexOutOfBoundsException(loc + "out of bounds");
		}
	}

	public boolean contains(T val) {
		for (int i = 0; i < arr.length; i++) {
			if (val == arr[i]) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return arr.length;
	}

}