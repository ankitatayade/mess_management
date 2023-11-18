package tester;

import java.time.LocalDate;

import java.util.Map;
import java.util.Scanner;

import com.code.Customer;
import com.code.MessPlan;

import static com.code.exception.CustomException.*;
import static com.code.exception.CustomerUtilsValidation.*;
import static utils.CustomerUtils.*;

public class Mess_Management {

	private static final Map<Integer, Customer> messMap = null;

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			//get the populated map
			
			Map<Integer,Customer>messMap = populateCustomerMap();
			boolean exit = false;
			while(!exit) {
				
				System.out.println("0:Exit 1:SignUp customer \n "
						+ "2: Sign in(if already exist) \n "
						+ "3: Upadate password  \n"
						+ "4.1:Sort by First name Display \\n"
						+ "4.2:Sort as per Plan \n "
						+ "4.3:Sort according to registration date \n "
						+ "5: Unsunscribe customer  \n"
						+ "6: Display custoer details \n"
						+ "7: Modify first name  \n"
						+ "8: Display email Id of the persons who joined mess in the month of January \n"
						+ "9: Display customer count who subscribed the monthly plan \n"
						+ "10:Search the customer who lives in Akurdi \n "
						+ "11:Name of customer who got 20% discount \n"
						+ "12:Display customer details");
				
				try {
					switch(sc.nextInt())
					{
					case 1:
						System.out.println(" Enter customerId, first_name, last_name, email, password, address,\r\n"
								+ "	 registerDate,  phoneNo, plan,  finalAmount");
						Customer cust = validateAllInputs(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),messMap);
						messMap.put(cust.getCustomerId(),cust);
						System.out.println("New account created");
						break;
						
			
					case 2:
						System.out.println("Enter customre Id");
						int customerId = sc.nextInt();
						if(messMap.containsKey(customerId)) {
							System.out.println("Enter email and password");
							String email = sc.next();
							String pasword = sc.next();
						validateEmailPass(email,pasword,messMap);
							
						}
					//cust= authenticateCustomer(sc.nextInt(),sc.next(),sc.next(),messMap);
						
					System.out.println("Customer sign in successfully");
					   
						break;
						
						
					case 3:
						System.out.println("Enter email and old password to change password");
						String email = sc.next();
						String password = sc.next();
						
						validateEmailPass(email,password,messMap);
						
						System.out.println("Enter new password");
						Customer cust1 = messMap.get(email);
						cust1.setPassword(sc.next());
						System.out.println("Password changed successfully");
						break;
						
						
					case 41:	
						System.out.println("Sort as per First name");
						messMap.values()
						.stream()
						.sorted((c1,c2) -> c1.getFirst_name().compareTo(c2.getFirst_name()))
						.forEach(c-> System.out.println(c));
						 break;
						 
						 
					case 42:
						System.out.println("Sort as per plan");
					    messMap.values()
					    .stream()
					    .sorted((c1,c2)->c1.getPlan().name().compareTo(c2.getPlan().name()))
					    .forEach(c-> System.out.println(c));
 					    break;
					    
					    
					case 43:
						System.out.println("Sort as per registration date");
						messMap.values()
						.stream()
						.sorted((c1,c2)->c1.getRegisterDate().compareTo(c2.getRegisterDate()))
						.forEach(c-> System.out.println(c));
						 break;
						
						 
					case 5:
						removePlan(messMap);
						System.out.println("Customer unsubscribed successfully");
						break;
						
						
						
					case 6:
						messMap.values().forEach(c -> System.out.println(c));
						break;
						
						
					
					case 7:
						for(Customer c: messMap.values()) {
							String fname = c.getFirst_name();
							String newName = Character.toUpperCase(fname.charAt(0)) + fname.substring(1);
							c.setFirst_name(newName);
						}
						System.out.println("First name is modified");
						break;
						
						
					case 8:
						System.out.println("Display email Id of the persons who joined mess in the month of January ");
						messMap.values().stream()
						.filter(s-> s.getRegisterDate().getMonthValue() == 1)
						.map(s-> s.getEmail())
						.forEach(s -> System.out.println(s));
						
						break;
						
						
					case 9:
						long count = messMap.values().stream()
						.filter(s -> s.getPlan()== MessPlan.MONTHLY)
						.count();
						
						System.out.println("count of customers who subscribed monthly plan"+count);
						
						break;
						
						
					case 10:
						messMap.values().stream()
						.filter(s -> s.getAddress().equals("Akurdi"))
                        .forEach(s -> System.out.println(s));
						break;
						
						
//					case 11:
//						System.out.println("Give the 20% discount to the customers who have selected yearly plan");
//						for(Customer c:messMap.values())
//						{
//							
//						}
//						System.out.println("Discount applied successfully!");
//						break;
//						
//						
						
					case 12:
						System.out.println("Customer details:");
						for(Customer cust2 : messMap.values())
							System.out.println(cust2);
						break;
					}
				}
			catch(Exception e) {
				sc.nextLine();
				System.out.println(e);
			}
		}

	}
	}

	
		
	}


