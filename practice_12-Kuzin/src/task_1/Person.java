package task_1;

public class Person {
    private String name;
    private String lastName;
    private String secondName;

    public Person(String name, String lastName, String secondName) {
        this.name = name;
        this.lastName = lastName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return new StringBuilder(lastName + " ")
                .append((name != null && !name.equals(""))? name.charAt(0) + ".": "")
                .append((secondName != null && !secondName.equals(""))? secondName.charAt(0) + ".": "")
                .toString();
    }
}


