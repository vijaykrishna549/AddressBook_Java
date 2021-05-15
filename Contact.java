package com.bridgelabz.addressbook;

public class Contact {
    private String firstName;
        private String lastName;
        private long  phoneNumber;
        private String emailId;
        private String City;
        private long zip;
    private String city;

    public Contact(){}
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
        public long getPhoneNumber() {
            return phoneNumber;
        }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setZip(long zip) { this.zip = zip;}
    public  long getZip() { return zip;}

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        public String getEmailId() {
            return emailId;
        }
        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }
        public Contact(String firstName, String lastName, long phoneNumber,
                       String emailId) {
            super();
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
            this.emailId = emailId;
            this.zip = zip;
            this.city = city;
        }
}

