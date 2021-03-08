package hashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UseHashMap {

	public static void main(String[] args) {

		Map<String,String> map=new LinkedHashMap<String,String>();
		
		map.put("USA", "NY");
		map.put("CANADA", "TORANTO");
		map.put("AUSTRALIA", "SYDNEY");
		map.put("JAPAN", "TOKYO");
		map.put("UK", "LONDON");
		
		for(Entry<String,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"<--->"+entry.getValue());
		}
		
	}

}
