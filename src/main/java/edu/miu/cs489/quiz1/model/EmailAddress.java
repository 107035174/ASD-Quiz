package edu.miu.cs489.quiz1.model;

public class EmailAddress {
    private String email;
    private String label;
    private Contact contact;

    public EmailAddress(String email, String label, Contact contact) {
        this.email = email;
        this.label = label;
        contact.addEmailAddress(this);
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        sb.append("\"email\":\"").append(this.email)
                .append("\", \"label\":\"").append(this.label)
                .append("\" }");
        return sb.toString();
    }

    
}
