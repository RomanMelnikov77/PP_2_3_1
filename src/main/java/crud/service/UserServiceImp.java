package crud.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import crud.Dao.UserDao;
import crud.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDaoImpl;


    @Override
    @Transactional
    public List<User> index() {
        return userDaoImpl.index();
    }

    @Override
    @Transactional
    public User showUser(int id) {
        return userDaoImpl.showUser(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDaoImpl.save(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        userDaoImpl.update(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDaoImpl.deleteUser(id);
    }
}
