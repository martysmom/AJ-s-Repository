package basics1;

import java.util.ArrayList;

public class DataStructuresQOne {

	/* create an array list with few words,
	 * print the list of words and then
	 * remove words and print an empty list
	 */
		
	public static void main(String[] args) {
		
		ArrayList <String> wordarraylist = new ArrayList<String>();
		
		wordarraylist.add("cat");
		wordarraylist.add("dog");
		wordarraylist.add("bird");
		wordarraylist.add("fish");
		wordarraylist.add("horse");
		
		//{K=set.1removeall}
		//K= cat,dog,bird,fish,horse;
		//P= cat,dog,bird,bear,cow		
		
		System.out.println(wordarraylist);
		wordarraylist.clear();
		System.out.println(wordarraylist);
	
	}

}
