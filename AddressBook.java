package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> addressBook =new ArrayList<Contact>();
    public void setAddressBook(List<Contact>obj)
    {
        addressBook =obj;
    }
    public List<Contact> getAddressBook()
    {
        return addressBook;
    }
    public void addContact(Contact contactObj)
    {
        addressBook.add(contactObj);
    }
    public List<Contact> viewAllContacts()
    {
        return addressBook;
    }
    public Contact viewContactGivenPhone(long phoneNumber)
    {
        Contact obj=new Contact();
        for(Contact obj1: addressBook)
        {
            if(obj1.getPhoneNumber()==phoneNumber)
            {
                obj=obj1;
            }
        }
        return obj;
    }
    public boolean removeContact(long phoneNumber)
    {
        boolean f=false;
        for(Contact obj: addressBook)
        {
            if(obj.getPhoneNumber()==phoneNumber)
            {
                f=true;
                addressBook.remove(obj);
                break;
            }
        }
        return f;
    }
}

