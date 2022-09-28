package Assignment2Work;

import java.util.Comparator;

public class SingerComparator  implements Comparator<CD>{
	
	@Override
	public int compare(CD cd1, CD cd2) {
		
		return cd1.getSinger().compareTo(cd2.getSinger());
	}
}
