package com.Exponent.CollectionMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class world {

	public static final Logger LOGGER = LogManager.getLogger(world.class);

	public static Map<String, Map<String, Map<String, String>>> addWorld() {
		Map<String, String> Maharashtra = new HashMap<String, String>();
		Maharashtra.put("Tier1", "Pune");
		Maharashtra.put("Tier2", "nagpur");

		Map<String, String> UttartPradesh = new HashMap<String, String>();
		UttartPradesh.put("Tier1", "azamgad");
		UttartPradesh.put("Tier2", "Islamabad");

		Map<String, Map<String, String>> india = new HashMap<String, Map<String, String>>();
		india.put("Uttarpradesh", UttartPradesh);
		india.put("Maharashtra", Maharashtra);
		
		
		
		Map<String, String> Washington = new HashMap<String, String>();
		Washington.put("Tier1", "Seattle");
		Washington.put("Tier2", "Spokane");

		Map<String, String> Losangelese = new HashMap<String, String>();
		Losangelese.put("Tier1", "Cudahy");
		Losangelese.put("Tier2", "Glendora");

		Map<String, Map<String, String>> USA = new HashMap<String, Map<String, String>>();
		USA.put("Washingtone", Washington);
		USA.put("Losangeles", Losangelese);
		
		
		
		Map<String, Map<String, Map<String, String>>> world = new HashMap<String, Map<String,Map<String,String>>>();
		world.put("USA", USA);
		world.put("INDIA",india);
		
		
		
		return world;

	}

	public static void main(String[] args) {

		Map<String, Map<String, Map<String, String>>> world = addWorld();
		
		Set<String> worldkey= world.keySet();
	  	Iterator<String> itr =  worldkey.iterator();
	  	while(itr.hasNext())
	  	{
	  		String  worldkeys = itr.next();
	  		System.out.println(worldkeys );
	  		
	  		Map<String, Map<String, String>>  country = world.get(worldkeys);
	  		Set<String> countrykey = country.keySet();
	  		 Iterator<String> itr1= countrykey.iterator();
	  		while(itr1.hasNext())
	  		{
	  			String countrykeys = itr1.next();
	  			System.out.println(countrykeys);
	  			Map<String, String> city = country.get(countrykeys);
	  			Set<String> citykey= city.keySet();
	  			Iterator<String> itr2= citykey.iterator();
	  			while(itr2.hasNext())
	  			{
	  				 String citykeys = itr2.next();
	  				 System.out.println(citykeys+" "+city.get(citykeys));
	  			}
	  			
	  		}
	  	}
	
	  	System.out.println();
	  	System.out.println();
	  	
	  	for(String w:worldkey)
	  	{
	  		System.out.println(w);
	  		Map<String, Map<String, String>> countrykey = world.get(w);
	  		 Set<String> ck= countrykey.keySet();
	  		 for (String c : ck) {
	  			System.out.println(c);
	  			Map<String, String> statekey= countrykey.get(c);
	  			 Set<String> sk= statekey.keySet();
	  			 for (String s: sk) {
					System.out.println(s+" "+statekey.get(s));
				}
	  			
				
			}
	  	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

	}

}
