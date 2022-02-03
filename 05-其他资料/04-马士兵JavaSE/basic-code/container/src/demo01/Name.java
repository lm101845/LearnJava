package demo01;

/**
 * @Author 李明
 * @Date 2022/1/3 18:17:17
 **/
public class Name {
    private String firstName,lastName;

    public Name(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
