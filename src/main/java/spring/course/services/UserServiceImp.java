package spring.course.services;

import spring.course.model.UserModel;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImp implements UserService{

    private Map<String,UserModel> userMap=new HashMap<>();
    public UserServiceImp(){
        userMap.put("muneeb", new UserModel("Muneeb","Hassan",123));
        userMap.put("hassan", new UserModel("Rana","Hassan",113));
    }
    @Override
    public UserModel getUser(String userName) {

        return userMap.get(userName);
    }

    @Override
    public void addUser(UserModel userModel) {

        userMap.put(userModel.getFirstName(),userModel);
    }

    @Override
    public void deleteUser(String userName) {

        userMap.remove(userName);
    }
}
