import java.util.ArrayList;

public class RegisterHandler {
    private ArrayList<Person> registered_persons = new ArrayList<Person>();
    private boolean debug = false;

    public void RegisterPerson(Person p) {
        registered_persons.add(p);
    }

    public void PrintPersons() {
        for (int i = 0; i<registered_persons.size(); i++) {
            System.out.println(registered_persons.get(i));
        }
    }

    public void DeletePerson(String target_email) {
        for (int i = 0; i<registered_persons.size(); i++) {
            Person person = registered_persons.get(i);

            if (debug == true) System.out.println(person);

            if (person == null) continue;

            if (person.GetEmail().equals(target_email)) {
                registered_persons.remove(i); // Removes person from the list
                break;
            }
        }
    }

    public Person GetPersonByEmail(String target_email) {
        if (debug == true) System.out.println("Trying to find: " + target_email);

        for (int i = 0; i<registered_persons.size(); i++) {
            Person person = registered_persons.get(i);

            if (debug == true) System.out.println(person);

            if (person == null) continue;

            if (person.GetEmail().equals(target_email)) {
                return person;
            }
        }

        return null;
    }

}
