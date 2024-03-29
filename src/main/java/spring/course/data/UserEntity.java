package spring.course.data;

import jakarta.persistence.Entity;

import java.io.Serializable;
@Entity
public class UserEntity implements Serializable {
    private String lastName;
    private Integer memberId;
    private String firstName;
}
