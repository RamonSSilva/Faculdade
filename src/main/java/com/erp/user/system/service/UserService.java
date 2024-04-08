package com.erp.user.system.service;

import java.util.List;
import java.util.Optional;
import com.erp.user.system.model.User;

public interface UserService {
    List<User> findAll();

    Optional<User> findById(Long id);

    User insert(User user);

    void delete(Long id);

    User update(Long id, User user);
}
