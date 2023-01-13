package com.hm.mobilestore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MobileStore {
	
	List<Mobile> mobList;
	
	public MobileStore() {
		
		Mobile m1 = new Mobile("Apple", "iPhone14", 800, "6.1", "3000", "128", 12);
		Mobile m2 = new Mobile("Samsung","Galaxy S22",450,"6.2","4000","256",108);
		Mobile m3 = new Mobile("Apple", "iPhone14 Pro", 1000, "6.1", "3000", "128", 48);
		Mobile m4 = new Mobile("Samsung","Galaxy S22 Ultra",900,"6.2","4500","256",108);
		Mobile m5 = new Mobile("OnePlus", "Oneplus 10", 400, "6.1", "5000", "256", 48);

		mobList=Arrays.asList(m1,m2,m3,m4,m5);
	
		
	}

	//Find phones of a particular brand.
    public List<Mobile> findPhoneByBrand(String brandName)
    {
    	List<Mobile> mobiles = new ArrayList<>();
    	for(Mobile m:mobList) {
    		if(m.getBrandName().equals(brandName)) {
    			mobiles.add(m);
    		}
    	}
        return mobiles;
    }

    //Find the phones whose cost is $500 and above.
    public List<Mobile> findPhoneCostMoreThan500$()
    {

    	return null;
     
    }

    //Enlist the phones which have camera specification as 12 MP and more
    public List<Mobile> findPhonePixelMoreThan12MP()
    {

        return null;
    }
    
    public List<Mobile> getSortedListByPrice(){
    	
    	return null;
    }
    
    public List<Mobile> getMobilesWithPriceBetween(double min, double max){
    	return null;
    }
    
    public static void main(String[] args) {
		MobileStore mStore = new MobileStore();
		List<Mobile> mobiles =  mStore.findPhoneByBrand("Samsung");
		for(Mobile m:mobiles) {
			System.out.println(m);
		}
	}

	
}
