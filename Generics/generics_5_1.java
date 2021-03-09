package testProject;

import java.util.Scanner;

public class generics_5_1 {
	
	public class GenericStack<E>{
		
		private E[] arr;
		private int size = 0;
		
		public GenericStack() {
			this.arr = (E[])new Object[3];
		}
		
		public int getSize() {
			return this.size;
		}
		
		public boolean isEmpty() {
			return this.size == 0;
		}
		
		public void push(E element) {
			if(this.size >= arr.length) {
				doubleArr();
			}
			this.arr[this.size++] = element;
		}
		
		public E peek() {
			return this.arr[this.size - 1];
		}
		
		public E pop() {
			size--;
			E o = arr[size];
			return o;
		}
		
		private void doubleArr() {
			E[] tempArr = (E[])new Object[this.arr.length*2];
			System.arraycopy(arr, 0, tempArr, 0, arr.length);
			this.arr = tempArr;
		}
	}

}
