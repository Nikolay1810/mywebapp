package org.itstep.myWebApp.repository.datajpa;


import org.itstep.myWebApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jca.cci.core.InteractionCallback;

public interface MyDataJpa extends JpaRepository<User, Integer> {

    Integer deleteById(Integer id);
}
