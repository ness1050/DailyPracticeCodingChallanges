package src;

public class person {
    

    private int id;
    public String name;
    public long number;
    public String email;

  

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name == " ") {
            System.out.println("Enter a name " + "\n" + "no name provided!");
        }
        this.name = name;
    }

    public long getNumber() {
        return this.number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    @Override
    public String toString(){
        return ("Person name: " + name + "Id: " + id + "Email: " + email);
    }
    


    // getters and setters plus other methods needed 
}
