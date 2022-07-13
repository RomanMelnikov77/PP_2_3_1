package crud.service;
import crud.model.User;

import java.util.List;

public interface UserService {


    List<User> index ();

    User showUser (int id);

    void save (User user);

    void update (User user);

    void deleteUser (int id);
}