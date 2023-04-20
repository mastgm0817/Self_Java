package miniCRUD;

public class User {
    private String name;
    private int id;
    
    public User(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
}
