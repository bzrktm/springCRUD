package web.DAO;

import web.models.User;

import java.util.List;

public interface UserDAO {

    public User getById(Long id);

    public List<User> getUsers();

    public void add(User user);

    public void updateUser(long id, User updateUser);

    public void delete(long id);


}
