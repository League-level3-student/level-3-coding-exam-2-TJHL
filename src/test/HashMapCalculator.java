package test;

import java.util.ArrayList;
import java.util.HashMap;
/** 
 * Write a method that takes in an ArrayList of Integers and a HashMap that
 * matches and Integer key to a String Value. The method should return an
 * ArrayList of all the Values from the HashMap that have matching keys to the
 * passed in ArrayList.
 */
public class HashMapCalculator {
	
	ArrayList<String> commonKeyValues(ArrayList<Integer> lst, HashMap<Integer, String> hm) {
		ArrayList<String> st = new ArrayList();
		for(Integer i: lst) {
		if(hm.get(i)!=null)
		st.add(hm.get(i));
		}
		return st;
	}

}