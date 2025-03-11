public class Person {
    String name, email;
    byte age;
    
    public int GetIdade() {
        return this.age & 0xFF; // Returns unsigned age, you never know when someone may be 128 years old
        // Masks the byte and casts it into an int
    }
    public String GetName() {
        return this.name;
    }
    public String GetEmail() {
        return this.email;
    }

    public void SetAge(int age) {
        this.age = (byte) age;
    }
    public void SetEmail(String email) {
        this.email = email;
    }
    public void SetName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Pessoa: " + name + "\n  - Idade: " + age + "\n  - E-mail: " + email + "\n";
    }
}
