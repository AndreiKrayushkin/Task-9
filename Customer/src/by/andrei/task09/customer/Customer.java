package by.andrei.task09.exer01;

public class Customer implements Comparable<Customer> {
	private int id;
	private String surname;
	private String name;
	private String lastname;
	private String address;
	private int creditCard;
	private int bankAccount;
	
	public Customer() {}

	public Customer (int id, String surname, String name, String lastname, String address, int creditCard, int bankAccount) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.lastname = lastname;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
	}
	public void setCustomerId(int id) {
		this.id = id;
	}
	public int getCustomerId () {
		return id;
	}
	
	public void setCustomerSurname(String surname) {
		this.surname = surname;
	}
	public String getCustomerSurname() {
		return surname;
	}
	
	public void setCustomerName(String name) {
		this.name = name;
	}
	public String getCustomerName() {
		return name;
	}

	public void setCustomerLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCustomerLastname() {
		return lastname;
	}
	
	public void setCusstomerAddress(String address) {
		this.address = address;
	}
	public String getCustomerAddress() {
		return address;
	}
	
	public void setCustomerCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}
	public int getCustomerCreditCard () {
		return creditCard;
	}
	
	public void setCustomerBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}
	public int getCustomerBankAccount () {
		return bankAccount;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", lastname=" + lastname
				+ ", address=" + address + ", creditCard=" + creditCard + ", bankAccount=" + bankAccount + "]" + "\n";
	}
	
	@Override
	public int compareTo(Customer o) {
		int result = this.surname.compareTo(o.surname);
		if (result == 0) {
			result = this.name.compareTo(o.name);
		} 
		if (result == 0) {
			result = this.creditCard - o.creditCard;
		}
		return result;
	}

	
}
