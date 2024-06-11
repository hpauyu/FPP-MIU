package lab7.prob1;

// Common task : Make sure to check your code should not throw any run time exception
public class MyPersonList {
    private final int INITIAL_LENGTH = 3;
    private Person[] PersonArray;
    private int size;

    // Default Constructor
    public MyPersonList() {
        PersonArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    // 1. Implement method to Add as last element, make sure you have enough room else call resize()
    public void add(Person s) {
        if (s.equals(null))
            return;
        if (size == PersonArray.length)
            resize();
        PersonArray[size] = s;
        size++;
    }

    // 2. get person information by passing index
    public Person get(int i) {
        if (i < 0 || i > size)
            return null;
        return PersonArray[i];
    }

    // 3. Find the Person object using lastname
    public boolean find(String lastName) {
        return findIndex(lastName) == -1 ? false : true;
    }

    private int findIndex(String lastName) {
        for (int i = 0; i < PersonArray.length; i++) {
            if (PersonArray[i] != null && PersonArray[i].getLast().equals(lastName)) {
                return i;
            }
        }
        return -1;
    }

    // 4. Remove the person object by passing its lastname
    public boolean remove(String lastName) {
        int index = findIndex(lastName);
        if (index == -1)
            return false;
        else {
            Person[] temp = new Person[PersonArray.length];
            System.arraycopy(PersonArray, 0, temp, 0, index);
            System.arraycopy(PersonArray, index + 1, temp, index, size - index);
            PersonArray = temp;
            size--;
            return true;
        }
    }

    // 5. Resizing the list
    private void resize() {
        Person[] temp = new Person[PersonArray.length * 2];
        System.arraycopy(PersonArray, 0, temp, 0, size);
        PersonArray = temp;

    }

    // To display all the persons list
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(STR."""
\{PersonArray[i]},\s
""");
        }
        sb.append(STR."\{PersonArray[size - 1]}]");
        return sb.toString();
    }

    // Return the size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyPersonList list = new MyPersonList();
        list.add(new Person("Bruce", "Tom", 36));
        list.add(new Person("Paul", "Corozza", 51));
        list.add(new Person("Joe", "Lermon", 53));
        list.add(new Person("Anne", "Dow", 55));
        System.out.println("\nSize() : " + list.size() + "\n" + list);
        list.remove("Tom");
        System.out.println("\nSize() : " + list.size() + "\n" + list);
        System.out.println("\nSearching of Lermon: " + list.find("Lermon"));
        System.out.println(list.get(2));
    }
}