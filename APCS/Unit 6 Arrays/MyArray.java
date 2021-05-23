
public class MyArray {
	// constants
	private	final int INITIAL_LENGTH = 5; // initial length	of array

	// instance	variables
	private	int[] array;
	private	int	numElements; //	logical	size of	array

	// constructor
	public MyArray() {
		array =	new	int[INITIAL_LENGTH]; //	instaniate array
		numElements	= 0;
	}

	/**	postcondition: value has been appended to the end of
	 *	  array. numElements has been incremented by one.
	 *	@param value the value to be added to array
	 */
	public void	add(int	value) {
		array[numElements] = value;
		numElements++;
		if (numElements	== array.length)
			resize();
	}

	/**	postcondition: value has been inserted into	array at position
	 *	  index. numElements has been incremented by one.
	 *	  by one.
	 *	@param index position to insert	value
	 *	@param value the value to be inserted
	 */
	public void	add(int	index, int value) {
		if (index >= 0 && index	< numElements) {
			for (int i = numElements - 1; i >= index; i--)
				array[i	+ 1] = array[i];
			array[index] = value;
			numElements++;
		}
		if (numElements	< array.length)
			resize();
		else if (index < array.length)
			add(value);
		else
			throw new java.lang.ArrayIndexOutOfBoundsException(index);
	}

	/**	postcondition: the value at	index has been removed from
	 *	  array. numElements has been decremented
	 *	  by one.
	 *	@param index position of element to	be removed
	 */
	public int remove(int index) {
		int item = 0;
		if (index >= 0 && index < numElements) {
		   item = array[index];
		   for (int i = index; i <= numElements - 1; i++)
				array[i] = array[i+1];
		   numElements--;
		   return item;
		}
		else
		   throw new java.lang.ArrayIndexOutOfBoundsException(index);
	}

	/**	@return	the	value at index
	 *	@param index position of element to	be returned
	 */
	public int get(int index) {
		if (index >= 0 && index < array.length)
		   return array[index];
		else
		   throw new java.lang.ArrayIndexOutOfBoundsException(index);
	}

	/**	postcondition: array's size	has	been increased by one
	 */
	public void	resize() {
		int[] newArray = new int[array.length + 1];
		for (int i = 0; i <= array.length - 1; i++)
			newArray[i] = array[i];
		array = newArray;
	}

	/**	@return	logical	size of	array(numElements)
	 */
	public int size() {
		return numElements;
	}

	/**	@return	a string representation	of array
	 */
	public String toString() {
		String str = "";

		for	(int i = 0;	i <	numElements; i++) {
			str	+= "[" + i + "," + array[i]	+ "]\n";
		}
		return str;
	}
}
/*
	public void add(int val) {
		if(size >= data.length) {
			resize();
		}
		data[size] = val;
		size++;
	}

	public int remove(int index) {
		checkIndexException(index);
		int x = data[index];
		for(int i = index; i < size - 1; i ++) {
			data[i] = data[i + 1];
		}
		size--;
		if(size < 0) {
			size = 0;
		}
		return x;
	}

	public void insert(int index, int value) {
		if(index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index Out Of Bounds: " + index);
		}
		if(size >= data.length) {
			resize();
		}
		for(int i = size; i > index; i --) {
			data[i] = data[i - 1];
		}
		data[index] = value;
		size++;
	}

	public int[] toArray() {
		int[] result = new int[size];
		for(int i = 0; i < size; i++) {
			result[i] = data[i];
		}
		return result;
	}

	public int indexOf(int val) {
		for(int i = 0; i < size; i++) {
			if(data[i] == val) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		size = 0;
		data = new int[INITIAL_LENGTH];
	}

	public MyArray subArray(int ind1, int ind2) {
		checkIndexException(ind1);
		checkIndexException(ind2);
		if(ind1 > ind2) {
			int y = ind2;
			ind2 = ind1;
			ind1 = y;
			MyArray result = new MyArray();
			for(int i = ind1; i <= ind2; i++) {
				result.add(data[i]);
			}
			result.reverse();
			return result;
		}
		MyArray result = new MyArray();
		for(int i = ind1; i <= ind2; i++) {
			result.add(data[i]);
		}
		return result;
	}

	public void replaceAll(int a, int b) {
		for(int i = 0; i < size; i++) {
			if(data[i] == a) {
				data[i] = b;
			}
		}
	}

	public void removeAll(int value) {
		for(int i = 0; i < size; i++) {
			if(data[i] == value) {
				for(int j = i; j < size; j++) {
					data[j] = data[j+1];
				}
				size--;
				i--;
			}
		}
	}

	public void swap(int index1, int index2) {
		int x = data[index1];
		data[index1] = data[index2];
		data[index2] = x;
	}

	public void reverse() {
		for(int i = 0; i < size/2; i++) {
			swap(i, size-1-i);
		}
	}

	public int frequencyOf(int value) {
		int count = 0;
		for(int i = 0; i < size; i++) {
			if(data[i] == value)
				count++;
		}
		return count;
	}

	public void sort() {
		int[]x = toArray();
		Arrays.sort(x);
		for(int i = 0; i < x.length; i++) {
			data[i] = x[i];
		}
//		for(int i = 0; i < size; i++){
//			for(int j = i + 1; j < size; j++) {
//				if(data[i] > data[j]) {
//					swap(i, j);
//				}
//			}
//		}
	}

	public void minimize() {
		resize(size + (int)(size * 1.1) - data.length);
	}
	
	public boolean equals(Object other) {
		if(size != ((MyArray) other).size()) {
			return false;
		}
		else {
			for(int i = 0; i < size; i++) {
				if(data[i] != ((MyArray)other).get(i)) {
					return false;
				}
			}
		}
		return true;
	}

	//PRIVATE METHODS
	private void checkIndexException(int index) {
		if(index > size - 1 || index < 0) {
			throw new IndexOutOfBoundsException("Index Out of Bounds: " + index);
		}
	}

	private void resize() {
		int[]x = new int[(int)(data.length * 2)];
		for(int i = 0; i < data.length; i++) {
			x[i] = get(i);
		}
		data = x;
	}

	private void resize(int amount) {
		int[]x = new int[data.length + amount];
		for(int i = 0; i < data.length; i++) {
			x[i] = get(i);
		}
		data = x;
	}
}
*/