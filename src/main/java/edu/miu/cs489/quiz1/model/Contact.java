package edu.miu.cs489.quiz1.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        phoneNumbers = new ArrayList<>();
        emailAddresses = new ArrayList<>();
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }

    public void addAllPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers.addAll(phoneNumbers);
    }

    public boolean deletePhoneNumber(PhoneNumber phoneNumber) {
        return this.phoneNumbers.remove(phoneNumber);
    }

    public void addEmailAddress(EmailAddress emailAddress) {
        this.emailAddresses.add(emailAddress);
    }

    public void addAllEmailAddress(List<EmailAddress> emailAddresses) {
        this.emailAddresses.addAll(emailAddresses);
    }

    public boolean deleteEmailAddress(EmailAddress emailAddress) {
        return this.emailAddresses.remove(emailAddress);
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((company == null) ? 0 : company.hashCode());
        result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contact other = (Contact) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (company == null) {
            if (other.company != null)
                return false;
        } else if (!company.equals(other.company))
            return false;
        if (jobTitle == null) {
            if (other.jobTitle != null)
                return false;
        } else if (!jobTitle.equals(other.jobTitle))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n\t{ ");
        sb.append("\"firstName\":\"").append(this.firstName)
                .append("\", \"lastName\":\"").append(this.lastName)
                .append("\", \"company\":\"").append(this.company)
                .append("\", \"jobTitle\":\"").append(this.jobTitle)
                .append("\", \"phoneNumbers\":").append(this.phoneNumbers)
                .append(", \"emailAddresses\":").append(this.emailAddresses)
                .append(" }");
        return sb.toString();
    }

}
