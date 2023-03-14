package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> getListUsers();
    void removeUserById(long id);

    User getUserById(long id);

    void updateUser(User user);
}
