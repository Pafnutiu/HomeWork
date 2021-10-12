package Work4;

import java.util.*;

public class PhoneBook {

    private HashMap<String, HashSet<String>> adrBook=new HashMap<>();

    public void add(String lastName,String phone) {
        HashSet<String> numbers;
        if (adrBook.containsKey(lastName)){
            numbers=adrBook.get(lastName);
        }
        else {
            numbers = new HashSet<>();
        }
            numbers.add(phone);
            adrBook.put(lastName,numbers);
    }

    public Set<String> getPhones(String nulastName) {
            return adrBook.get(nulastName);
    }

    public static void main(String[] args){

PhoneBook bookphone=new PhoneBook();
bookphone.add("Petrov","6549873216");
bookphone.add("Ivanov","1231231244");
bookphone.add("Ivanov","1231231245");

System.out.println("Ivanov: "+bookphone.getPhones("Ivanov"));
System.out.println("Petrov: "+bookphone.getPhones("Petrov"));
    }

}
