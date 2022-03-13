package gameInterfaceDemo.entities.concretes;

import gameInterfaceDemo.entities.abstracts.BaseEntity;

public class Customer extends BaseEntity{
	private String userName;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private String dateOfBirth;
	public Customer() {
		super();
	}
	public Customer(int id,String userName, String firstName, String lastName, String nationalityId,
			String dateOfBirth) {
		super(id);

		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
