public class RegisterHandler {
    private Person[] registered_persons = new Person[1];

    public void RegisterPerson(Person p) {
        // Expand array1
        Person[] expanded = new Person[registered_persons.length+1];
        System.arraycopy(registered_persons, 0, expanded, 0, registered_persons.length);

        registered_persons[registered_persons.length-1] = p;
    }

    public Person GetPersonByEmail(String target_email) {
        Person p = null;

        for (int i = 0; i<registered_persons.length; i++) {
            if (registered_persons[i].GetEmail() == target_email) {
                return registered_persons[i];
            }
        }

        return p;
    }

}
