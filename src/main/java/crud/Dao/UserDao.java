package crud.Dao;
import crud.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    User showUser (int id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser (int id);
}

