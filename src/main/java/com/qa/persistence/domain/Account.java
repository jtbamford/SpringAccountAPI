package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	@Column(length = 45)
	private String firstName;
	@Column(length = 45)
	private String lastName;
	private String accountNumber;
	private String accountType;

	public Account() {

	}

	public Account(String fName, String lName, String accountType) {

		this.firstName = fName;
		this.lastName = lName;
		this.accountType = accountType;

	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Long getID() {
		return this.ID;
	}

	public String setFirstName(String name) {

		firstName = name;

		return "First Name Changed";
	}

	public String setLastName(String name) {

		lastName = name;

		return "Last Name Changed";
	}

	public String setAccountNumber(String id) {

		accountNumber = id;

		return "Account Number Changed";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}


}
