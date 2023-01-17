package classDemo;

//标准的JavaBean：

public class UserSignUp {
    String username;
    String password;
    String email;
    String gender;
    int age;

    public UserSignUp(){}

    public  UserSignUp(String username, String password, String email, String gender, int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getUsername(){return this.username;}
    public String getPassword(){return this.password;}
    public String getEmail(){return this.email;}
    public String getGender(){return this.gender;}
    public int getAge(){return this.age;}

}
