package crud.Dao;
import crud.model.User;

import java.util.List;

public interface UserDao {

    List<User> index ();

    User showUser (int id);

    void save (User user);

    void update (User user);

    void deleteUser (int id);
}

