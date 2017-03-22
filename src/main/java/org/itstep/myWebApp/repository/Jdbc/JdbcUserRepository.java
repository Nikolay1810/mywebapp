package org.itstep.myWebApp.repository.Jdbc;

import com.fasterxml.jackson.databind.BeanProperty;
import org.itstep.myWebApp.model.User;
import org.itstep.myWebApp.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by student on 21.03.2017.
 */
@Repository
public class JdbcUserRepository implements IUserRepository {
    private final BeanPropertyRowMapper<User> rowMapper = BeanPropertyRowMapper.newInstance(User.class);

@Autowired
private JdbcTemplate jdbcTemplate;

@Override
public List<User> getAll(){
    return jdbcTemplate.query("Select * from user", rowMapper);
}

    @Override
    public boolean delete(Integer id){return false;}

    @Override
    public User save(User user){return null;}

    @Override
    public User getById(Integer id){return null;}

}
