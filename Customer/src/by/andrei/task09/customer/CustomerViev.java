package by.andrei.task09.exer01;

import java.util.List;

public class CustomerViev {

	public void print (List<Customer> list) {
		for (Customer customer : list) {
			System.out.println(customer.getCustomerSurname() + " " + customer.getCustomerName() + " " + customer.getCustomerLastname() + 
					". Адрес: " + customer.getCustomerAddress() + 
					". Номер кредитной карты: " + customer.getCustomerCreditCard() + 
					". Номер банковского счета: " + customer.getCustomerBankAccount() + ".");
		}
	}
	
	
}
