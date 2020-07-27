package Hashmap;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class contactList {
	HashMap<String,Integer> contacts= new HashMap<>();
	
	public void addContact(String name,Integer number) {
		contacts.put(name,number);
	}
	
	public void removeContact(String name) {
		contacts.remove(name);
	}
	
	@Override
	public String toString() {
		return "contactList [contacts=" + contacts + "]";
	}
	
	public boolean doesContactNameExist(String name) {
		for(String key: contacts.keySet()) 
			if(key==name) 
				return true;
			
			return false;
		
	}
	
	public boolean doesContactNumberExist(Integer number) {
		for(int value:contacts.values())
			if(value==number)
				return true;
		return false;
	}
	
	public void listAllContacts() {
		Set<Entry<String,Integer>> set=contacts.entrySet();
		Iterator<Entry<String,Integer>> it= set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> me=it.next();
			System.out.println(me);
		}

		}
	
	

	public static void main(String[] args) {
		contactList contactlist = new contactList();
		
		contactlist.addContact("Raghav", 123);
		contactlist.addContact("aryan", 5412);
		contactlist.addContact("dodo", 100);
		contactlist.addContact("janhavi", 321);
		contactlist.addContact("maa",000 );
		
		System.out.println("Name Exists?:"+ contactlist.doesContactNameExist("janhavi"));
		System.out.println("Number Exists?:"+ contactlist.doesContactNumberExist(123));
		
		System.out.println();
	contactlist.listAllContacts();

	}

}
