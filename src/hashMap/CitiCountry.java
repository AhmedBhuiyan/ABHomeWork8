package hashMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CitiCountry {

	public static void main(String[] args) {
     
		List<String> cityOfUSA= new ArrayList<String>();
		
		cityOfUSA.add("NY");
		cityOfUSA.add("NJ");
		cityOfUSA.add("PA");
		cityOfUSA.add("CT");

		List<String> cityOfCANADA= new ArrayList<String>();
		
		cityOfCANADA.add("TORANTO");
		cityOfCANADA.add("");
		cityOfCANADA.add("TORANTO");
		cityOfCANADA.add("TORANTO");

		
		
		
		List<String> cityOfAustralia= new ArrayList<String>();
		
		cityOfAustralia.add("SYDNEY");
		cityOfAustralia.add("CANBERA");
		cityOfAustralia.add("BRISTOL");
		cityOfAustralia.add("WESTLAND");

		
		
		
		List<String> cityOfUK= new ArrayList<String>();
		
		cityOfUK.add("LONDON");
		cityOfUK.add("SCOTLAND");
		cityOfUK.add("MANCHESTER");
		cityOfUK.add("WALES");
		
		List<String> cityOfJAPAN= new ArrayList<String>();
		
		cityOfJAPAN.add("NAGASAKI");
		cityOfJAPAN.add("TOKIO");
		cityOfJAPAN.add("OSAKA");
		cityOfJAPAN.add("DHAKA");
		
		
		Map<String,List<String>> map=new LinkedHashMap<String,List<String>>();
		
		map.put("USA", cityOfUSA);
		map.put("CANADA", cityOfCANADA);
		map.put("JAPAN", cityOfJAPAN);
		map.put("AUSTRALIA", cityOfAustralia);
		map.put("UK", cityOfUK);
		
		
		for(Map.Entry<String, List<String>>entry:map.entrySet()) {
		
		System.out.println(entry.getKey()+"-->"+entry.getValue());

		


		
	}

	}
}
