import java.util.Arrays;

public class MyArrayList {
	private Object[] myStore;
	private int actSize = 0;
	
	public MyArrayList(){
		myStore = new Object[10];
	}
	
	public Object get(int index) {
		if(index<actSize)
			return myStore[index];
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public void add(Object obj) {
		if(myStore.length-actSize<=5)
			increaseListSize();
		myStore[actSize++] = obj;
	}
	
	public Object remove(int index) {
		if(index < actSize) {
			Object obj = myStore[index];
			myStore[index] = null;
			int temp = index;
			while(temp<actSize) {
				myStore[temp]= myStore[temp+1];
				myStore[temp+1]= null;
				temp++;
			}
			actSize--;
			return obj;
		}else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public int size() {
		return actSize;
	}
	
	private void increaseListSize() {
		myStore = Arrays.copyOf(myStore, myStore.length*2);
		System.out.println("\n NewLength: "+ myStore.length);
	}
	
	public static void main(String[] args) {
		MyArrayList mal = new MyArrayList();
		for(int i=0;i<20;i++) {
			mal.add(i);
		}
		System.out.println(mal.get(3));
		mal.remove(3);
		System.out.println(mal.get(3));
		
	}
	
}

