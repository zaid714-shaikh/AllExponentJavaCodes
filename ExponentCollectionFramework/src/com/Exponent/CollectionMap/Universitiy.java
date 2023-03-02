package com.Exponent.CollectionMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Universitiy {

	
	public  static final Logger LOGGER = LogManager.getLogger(Universitiy.class);
	
	
	public static Map<String, Map<String, List<String>>> adduniversites() {
		List<String> pune = new ArrayList<String>();
		pune.add("BSC");
		pune.add("Btech");

		List<String> mumbai = new ArrayList<String>();
		mumbai.add("Bcom");
		mumbai.add("BE");

		List<String> LosAngles = new ArrayList<String>();
		LosAngles.add("CEH");
		LosAngles.add("CyberSecurity");

		Map<String, List<String>> MaharashtraUniversities = new HashMap<String, List<String>>();

		MaharashtraUniversities.put("PuneCourse", pune);
		MaharashtraUniversities.put("MumbaiCourse", mumbai);

		Map<String, List<String>> USAUniversiteies = new HashMap<String, List<String>>();
		USAUniversiteies.put("LosAngelesCourse", LosAngles);

		Map<String, Map<String, List<String>>> country = new HashMap<String, Map<String, List<String>>>();
		country.put("indianUniversities", MaharashtraUniversities);
		country.put("USAUniversities ", USAUniversiteies);

		return country;
	}

	public static void main(String[] args) {

		Map<String, Map<String, List<String>>> country = adduniversites();
		
		LOGGER.info("---Using iterator Interfaces-----");
		
		
		
		
		
		Set<String> keys = country.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String ckeys = itr.next();
			System.out.println(ckeys);
			
			
			Map<String, List<String>> states = country.get(ckeys);
			
			
			
			
			
			Set<String> stateskey = states.keySet();
			Iterator<String> itr2 = stateskey.iterator();
			while (itr2.hasNext()) {
				String skeys = itr2.next();
				System.out.println(skeys);
				List<String> ckeys2 = states.get(skeys);
				Iterator<String> itr3 = ckeys2.iterator();
				while(itr3.hasNext())
				{
					String Lkys = itr3.next();
					System.out.println(Lkys);
				}
				
			}

		}
		
		
		LOGGER.info("---Using ForEachLoop-----");
		for(String countrykey:keys)
			{
				System.out.println(countrykey+" "+country.get(countrykey));
				Map<String, List<String>> stateskey = country.get(countrykey);
				Set<String> skey= stateskey.keySet();
				for(String sk:skey)
				{
					System.out.println(sk+" "+stateskey.get(sk));
					List<String> fk = stateskey.get(sk);
					for(String f:fk)
					System.out.println(f);
				}
			}
			
		}



}
