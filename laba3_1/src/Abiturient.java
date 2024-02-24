import java.util.Arrays;

/**
 * Класс создания объекта - Абитуриент
 */
public class Abiturient {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String numberPhone;
    private int[] mark;

    {
        middleName = "Undefined";
    }

    Abiturient(int id, String lastName, String firstName, String middleName, String address, String numberPhone, int[] mark) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.numberPhone = numberPhone;
        this.mark = mark;
    }

    Abiturient(int id, String lastName, String firstName, String address, String numberPhone, int[] mark) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.numberPhone = numberPhone;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int[] getMark() {
        return mark;
    }

    public void setMark(int[] mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\tLast Name: " + lastName + "\tFirst Name: " + firstName + "\tMiddle Name: " + middleName +
                "\tAddress: " + address + "\tPhone Number: " + numberPhone + "\tMarks: " + Arrays.toString(mark);
    }
}

