package spring.course.model;

public class UserModel {
    public UserModel(String firstName, String lastName, Integer memberId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberId = memberId;
    }

    public UserModel(){

    }
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    private String lastName;
    private Integer memberId;
}
