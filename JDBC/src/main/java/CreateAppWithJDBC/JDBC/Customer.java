package CreateAppWithJDBC.JDBC;

public class Customer {
	private long id;
	private String firstName, lastName;
	public Customer (long id, String firstname, String lastName) {
		this.id=id;
		this.firstName=firstname;
		this.lastName=lastName;
		
	}
	
//	public String toString() {
//		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id,firstName,lastName);
//	}
}
