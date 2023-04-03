//Cian Murray
//This class holds all the parameters and exceptions for shift workers. These
// parameters include name, age, gender, shift.

public class ShiftWorker {
    String name;
    int age;
    String gender;
    int shift;

    public ShiftWorker(String name, int age, String gender, int shift) throws IllegalArgumentException {
        if (name.length() < 6 || name.length() > 21) {
            throw new IllegalArgumentException("Invalid, length of name provided is not valid");
        }
        if (age < 18) {
            throw new IllegalArgumentException("Invalid, age must be at least 18");
        }
        if (gender != "Man" && gender != "Woman" && gender != "Non-Binary") {
            throw new IllegalArgumentException("Invalid, unrecognised Gender");
        }
        if (shift != 1 && shift != 2) {
            throw new IllegalArgumentException("Invalid, unrecognised Shift Type");
        }

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.shift = shift;
    }
}
