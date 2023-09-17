package collections;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
	int size;
	private T[] items;
	
	
	public GenericList() {
		size = 0;
		items = (T[])new Object[100];
	}
	
	public void add(T item) {
		items[size ++] = item;
	}
	
	public T getItemAtIndex(int index) {
		return items[index];
	}

	@Override
	public Iterator<T> iterator() {
		
		return new UpdateGenericList(this) ;
	}
	
	private class UpdateGenericList<T> implements Iterator<T>{
		
		public GenericList<T> genericlist;
		private int index = 0;
		
		public UpdateGenericList(GenericList<T> genericlist) {
			this.genericlist = genericlist;
		}

		@Override
		public boolean hasNext() {
			
			return index < genericlist.size;
		}

		@Override
		public T next() {
			
			return genericlist.items[index ++];
		}
		
		
	}
	
	

}
