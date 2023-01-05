package in.co.Collection;

import java.util.Comparator;

public class OrderByMarks implements Comparator<MarkSheet> {

	@Override
	public int compare(MarkSheet m1, MarkSheet m2) {
		// TODO Auto-generated method stub

		if (m1.marks > m2.marks) {
			return -1;
		} else if (m1.marks == m2.marks) {
			return 0;
		} else {
			return 1;
		}

	}
}