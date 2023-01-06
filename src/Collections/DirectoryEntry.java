package Collections;

import java.util.ArrayList;

public class DirectoryEntry {
    String name;
    String number;

    public DirectoryEntry(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "DirectoryEntry{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<DirectoryEntry> theDirectory = new ArrayList<DirectoryEntry>();

        theDirectory.add(new DirectoryEntry("Jane Smith", "555-1212"));
        theDirectory.add(new DirectoryEntry("Jane Joe", "444-1212"));
        theDirectory.add(new DirectoryEntry("Jane Green", "333-1212"));
        theDirectory.add(new DirectoryEntry("Jane Mbasa", "222-1212"));


        /*int index = theDirectory.indexOf(new DirectoryEntry(aName, ""));

        if (index != -1)
            dE = theDirectory.get(index);
        else
            dE = null;*/
        System.out.println(theDirectory);
        //instantiate a class
        /*DirectoryEntry directoryEntry = new DirectoryEntry("Alamin", "Juma");
        System.out.println(directoryEntry.getNumber());*/


    }
}