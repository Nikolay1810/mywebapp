package org.itstep.myWebApp.repository.datajpa;

import org.itstep.myWebApp.model.User;
import org.itstep.myWebApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by student on 28.03.2017.
 */
public class DataJpaUserRepositories implements UserRepository {
    @Autowired
    MyDataJpa mydata;
    @Override
    public List getAll() {
        return mydata.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        return mydata.deleteById(id) != 0;
    }

    @Override
    public User save(User user) {
        return mydata.save(user);
    }

    @Override
    public User getById(Integer id) {
        return mydata.findOne(id);
    }
}
