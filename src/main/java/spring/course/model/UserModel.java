package spring.course.model;

public class UserModel {

    private String lastName;
    private Integer memberId;
    private String firstName;
    private String crteationTime;
    public UserModel(String firstName, String lastName, Integer memberId,String time) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberId = memberId;
        this.crteationTime=time;
    }

    public UserModel(){

    }

    public String getCrteationTime() {
        return crteationTime;
    }

    public void setCrteationTime(String crteationTime) {
        this.crteationTime = crteationTime;
    }
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


}
