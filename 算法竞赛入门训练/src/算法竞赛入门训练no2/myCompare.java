package �㷨��������ѵ��no2;

import java.util.Comparator;

public class myCompare implements Comparator<Subordinate>{

	@Override
	public int compare(Subordinate o1, Subordinate o2) {
		// TODO Auto-generated method stub

		return o2.J.compareTo(o1.J); // large to small
	}
	
}