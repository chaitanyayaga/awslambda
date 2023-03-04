package com.chaitanya.aws.lambda.s3sns;

public class PatientCheckoutEvent {

	public String firstName;

	public String middleName;

	public String lastName;

	public String ssn;

	public PatientCheckoutEvent() {
		super();
	}

	public PatientCheckoutEvent(String firstName, String middleName, String lastName, String ssn) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", ssn="
				+ ssn + "]";
	}

}
