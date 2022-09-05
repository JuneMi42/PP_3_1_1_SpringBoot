package webApp.PP_3_1_1_SpringBoot.Service;

import webApp.PP_3_1_1_SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUserById(int id);
    void save(User user);
    void update(int id, User updateUser);
    void deleteById(int id);
}
