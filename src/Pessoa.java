public class Pessoa {
    String name;
    String email;
    byte age;

    public Pessoa(String name, String email, int age)     {
        this.name = name;
        this.email = email;
        this.age = (byte) age;
    }
    
    public int GetIdade() {
        return this.age & 0xFF; // Returns unsigned age, you never know when someone may be 128 years old
    }

    public void SetIdade(int idade) {
        this.age = (byte) idade;
    }
}
