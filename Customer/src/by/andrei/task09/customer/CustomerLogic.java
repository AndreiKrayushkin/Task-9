package by.andrei.task09.exer01;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {
	public List<Customer> filter (int creditCardNumMin, int creditCardNumMax,List<Customer> a) {
		List <Customer> resultat = new ArrayList<Customer>();
		for (Customer account : a) {
			if (account.getCustomerCreditCard() > creditCardNumMin && account.getCustomerCreditCard() < creditCardNumMax) {
				resultat.add(account);	//resultat.account
			}						
		}
		return resultat;
	}	
}