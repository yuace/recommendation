/**
 * 
 */
package top.zhangyuace.contentbasedrecommend;

import java.util.Comparator;
import java.util.Map;

/**
 * @author zhangyuace

 */
public class CustomizedComparator implements Comparator<String>
{
	Map<String, Double> base;  
    public CustomizedComparator(Map<String, Double> base) {  
        this.base = base;  
    }

    
	@Override
	public int compare(String a, String b)
	{
		 if (base.get(a) >= base.get(b)) {  
	            return 1;  
	     } 
	     else {  
	            return -1;  
	     } 
	}  
      	
}

