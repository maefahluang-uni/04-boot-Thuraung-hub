package th.mfu.boot;

public class User {
     private String username;
     private String displayname;
    private String email;
    
    
    public String getUsername(){
        return username;
    }
    public void setUsername(String name){
        this.username = name;
    }
    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }
    
    

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}