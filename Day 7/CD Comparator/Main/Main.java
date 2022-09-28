package Assignment2Work.Task;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Assignment2Work.CD;
import Assignment2Work.SingerComparator;

public class Main {
	
	public static void main(String args[]) {
		
		Set<CD> CDList = new TreeSet<CD>(new SingerComparator());
		
		System.out.println("Number of CD's: "+CDList.size());
		
		CDList.add(new CD("Brothers", "The Black Keys", 2020));
		CDList.add(new CD("Absolution", "Muse", 2004));
		CDList.add(new CD("The Seldom Seen Kid", "Elbow", 2008));
		CDList.add(new CD("Adventures", "Whakawhakamama's", 2021));
		
		//Doesn't add the CD below as it has the same artist name as a CD above.
		CDList.add(new CD("Round 2", "Whakawhakamama's", 2022));
		
		System.out.println("Number of CD's: "+CDList.size());
		System.out.println();
		//System.out.println(CDList);
		
		/*
		 * System.out.println("Traversal using for each loop");
		 * for(CD element:CDList) {
		 *	System.out.println(element);
		 * }
		 */
		
		/*
		 * Factory Design Pattern : Give the responsibility of creation of object to someone else
		 * benefit of doing so is to get the object even without knowing the name of the implementation class
		 */
		Iterator<CD> iterator=CDList.iterator();
		System.out.println("Traversal using iterator:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
