package spring.course.services;

import spring.course.model.UserModel;

public interface UserService {
    UserModel getUser(String UserName);
    void addUser(UserModel userModel);
    void deleteUser(String userName);
}
