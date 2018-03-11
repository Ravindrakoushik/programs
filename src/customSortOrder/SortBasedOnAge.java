package customSortOrder;

import java.util.Comparator;

import com.model.Emp;

public class SortBasedOnAge implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getAge().compareTo(o2.getAge());
	//	return 0;
	}

}
