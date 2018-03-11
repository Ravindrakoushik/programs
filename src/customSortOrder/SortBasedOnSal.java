package customSortOrder;

import java.util.Comparator;

import com.model.Emp;

public class SortBasedOnSal implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getSal()-o2.getSal();
	}

}
