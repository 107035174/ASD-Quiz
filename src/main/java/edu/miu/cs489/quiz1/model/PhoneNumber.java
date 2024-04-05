package edu.miu.cs489.quiz1.model;

public class PhoneNumber {
    private String phoneNumber;
    private String label;
    private Contact contact;

    public PhoneNumber(String phoneNumber, String label, Contact contact) {
        this.phoneNumber = phoneNumber;
        this.label = label;
        contact.addPhoneNumber(this);
        this.contact = contact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n\t\t{ ");
        sb.append("\"phoneNumber\":\"").append(this.phoneNumber)
                .append("\", \"label\":\"").append(this.label)
                .append("\" }");
        return sb.toString();
    }

}
