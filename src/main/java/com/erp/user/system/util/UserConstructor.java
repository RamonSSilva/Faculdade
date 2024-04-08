package com.erp.user.system.util;

import com.erp.user.system.model.User;

public class UserConstructor {
    private UserConstructor() {

    }

    public static User create(Long id, String name, String email, String telefone, String password) {
        return new User(id, name, email, telefone, password);
    }
}