public class Person implements Greeter {


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected static String firstName;

    protected String lastName;


}
