package uib.efrem.ai.memoisationDemoFib;

import java.util.Hashtable;

public class FibMemoisation {
	public static Hashtable<Long, Long> intHashTable = new Hashtable<Long, Long>();
	
	public static void main(String[] args){
		BinaryTreeNode ex;
		intHashTable.put((long)0,(long) 0);
		intHashTable.put((long)1,(long)1);
		System.out.println(fib(103));
	}

	public static long  fib(long i) {
		
		if(!intHashTable.containsKey(i))
			intHashTable.put(i, fib(i-1)+fib(i-2));
	
		return intHashTable.get(i);
	}

}
