package list;

public class ListMethod {
	int initialcapacity = 2;
	int[] arr;
	int size;
	int capacity = initialcapacity;

	public ListMethod() {
		arr = new int[initialcapacity];
		size = 0;
	}

	public void add(int val) {
		if (size == capacity) {
			expandArray();
		}
		arr[size++] = val;
	}

	public void display() {
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}
	public void insertPosition(int position,int val) {
		if(size==capacity) {
			expandArray();
		}
		for(int i=size-1;i>position;i--) {
			arr[i+1]=arr[i];
		}
		arr[position]=val;
		size++;
	}
	public void deletePos(int position) {
		for(int i=position+1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
	}

	private void expandArray() {
		capacity = capacity * 2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}

}
