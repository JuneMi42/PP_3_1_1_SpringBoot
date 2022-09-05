package webApp.PP_3_1_1_SpringBoot.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import webApp.PP_3_1_1_SpringBoot.DAO.UserDao;
import webApp.PP_3_1_1_SpringBoot.model.User;


import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void update(int id, User updateUser) {
        userDao.update(id, updateUser);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        User user = userDao.getUserById(id);
        userDao.delete(user);
    }
}
