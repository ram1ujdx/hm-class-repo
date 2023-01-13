package com.hm.emailparsing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailParsing {

	public static void main(String[] args) {
		
		List<String> emails = Arrays.asList( "albert.eisntein@gmail.com",
				"jagadish_chandra_bose@yahoo.com",
				"srinivasa.ramanujan@gmail.com", "bjarne_stroustrup@yahoo.com", "max.planck@gmail.com", "nikola.tesla@hotmail.com", "galileo_galilei@hotmail.com", "a.p.j.abdul.kalam@gmail.com", "richard.stallman@inbox.com", "john_von_neumann@mail.com", "c_v_raman@yahoo.com", "isaac.newton@yandex.com", "s_chandrashekar@hotmail.com", "james_gosling@shortmail.com", "ken.thompson@gmail.com", "stephen_hawking@rediffmail.com", "marie_curie@yahoo.com", "michael.faraday@hotmail.com", "charles.babbage@hotmail.com" );
		
		Map<String, List<String>> emailMap = new HashMap<>();
		
		for(String email:emails) {
			int start = email.indexOf('@');
			int end = email.lastIndexOf(".");
			String domain = email.substring(start+1, end);
			
			if(emailMap.containsKey(domain)) {
				emailMap.get(domain).add(email);
			}
			else {
				List<String> emList = new ArrayList<>();
				emList.add(email);
				emailMap.put(domain, emList);
			}
			
		}
		
		emailMap.forEach((d,e)->{
			System.out.println(d);
			System.out.println("--------------------");
			e.forEach(s->System.out.println(s));
			System.out.println();
		});
		
		
		
	}
	
}
