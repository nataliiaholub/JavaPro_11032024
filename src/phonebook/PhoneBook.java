package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private List<Record> phoneBook;

    public PhoneBook() {
        phoneBook = new ArrayList<>();
    }

    public void add(Record record) {
        phoneBook.add(record);
    }

    public Record find(String name) {
        for (Record record : phoneBook) {
            if (record.getName().equalsIgnoreCase(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> result = new ArrayList<>();
        for (Record record : phoneBook) {
            if (record.getName().equalsIgnoreCase(name)) {
                result.add(record);
            }
        }
        if (result.isEmpty()) {
            return null;
        } else {
            return result;
        }
    }
    public static void main(String[] args){

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(new Record("Robin Smith", "123456789"));
        phoneBook.add(new Record("Romeo Jones", "123123123"));
        phoneBook.add(new Record("Robin Smith", "999999999"));

        Record foundRecord = phoneBook.find("John Doe");
        if (foundRecord != null) {
            System.out.println("Found record: " + foundRecord.getName() + " - " + foundRecord.getPhone());
        } else {
            System.out.println("Record not found.");
        }

        String searchName = "Robin Smith";
        System.out.println("All records for " + searchName + ":");
        for (Record record : phoneBook.findAll(searchName)) {
            System.out.println(record.getName() + " - " + record.getPhone());
        }


    }

}
