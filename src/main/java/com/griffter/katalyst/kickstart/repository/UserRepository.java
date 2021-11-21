package com.griffter.katalyst.kickstart.repository;

import com.griffter.katalyst.kickstart.model.User;

public interface UserRepository {
    User getUser(String userName);

    int add(User newUser);
}
