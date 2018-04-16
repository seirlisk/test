package services;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;


/**
 * @author seirlisk
 *
 */
public class ArithmeticOperationsServiceImpl implements ArithmeticOperationsService {

	
	/* (non-Javadoc)
	 * @see services.ArithmeticOperationsService#sum(java.util.List)
	 */
	public int sum(List<Integer> list) {
		if(CollectionUtils.isEmpty(list)) {
			return 0;
		}
		
		return list.stream().mapToInt(Integer::intValue).sum();
		//return -1;
	}
	
	
	
	
}
