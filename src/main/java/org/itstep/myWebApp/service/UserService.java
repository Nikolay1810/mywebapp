package org.itstep.myWebApp.service;

import org.itstep.myWebApp.model.User;
import org.itstep.myWebApp.repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository repository = new UserRepository();

    public List<User> getAll() {
        return repository.getAll();
    }

    public void delete(Integer id) {
        repository.delete(id);
    }

    public User getUserById(Integer id){return repository.getUserById(id);}

    public void add(User user) {
        repository.add(user);
    }
}
