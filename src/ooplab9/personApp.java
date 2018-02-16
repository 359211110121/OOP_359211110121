package ooplab9;

public class personApp {
    public static void main(String[] args) {
        Person person = new Person("10121", "Patchayaphon",
                new Address("22 m7", "Satun", "91000"),
                new Job("Programer", 65000));

        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary(60000);
        System.out.println("Name: " + person.getname() +
                "Salary: " + person.getJob().getSalary());
    }
}//class