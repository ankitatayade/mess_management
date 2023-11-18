package utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.code.Customer;
import com.code.MessPlan;

public class CustomerUtils {
	
	//add a method to populate sample accts data
	
	public static Map<Integer,Customer> populateCustomerMap(){
		//create empty map
		
		Map<Integer,Customer> customers = new HashMap<>();
		
		
		System.out.println("Added "+customers.put(123,new Customer(123,"Nargis"," Shaikh ", " Shaikh@daund.com"," Nargis@123"," Daund",LocalDate.parse("2022-12-13")," 7836738292",MessPlan.MONTHLY,3000)));
		System.out.println("Added "+customers.put(456,new Customer(456,"Ankita"," Tayade ", " Tayade@nashik.com","Ankita@123"," Nashik",LocalDate.parse("2022-01-12")," 7836700292",MessPlan.QUARTERLY,11700)));
		System.out.println("Added "+customers.put(789,new Customer(789,"Phalguni"," Mahajan", "Mahajan@jalgaon.com","Phalguni@123","Jalgaon",LocalDate.parse("2021-03-12")," 9436738292",MessPlan.YEARLY,32000)));
		System.out.println("Added "+customers.put(376,new Customer(376,"Siddhi","Khande", "Khande@nashik.com","Siddhi@123","Nashik",LocalDate.parse("2022-04-19")," 7836799562",MessPlan.HALFYEAR,17500)));
		
		return customers;
	}

}
