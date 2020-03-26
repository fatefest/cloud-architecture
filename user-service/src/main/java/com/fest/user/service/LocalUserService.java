package com.fest.user.service;


import com.fest.user.domain.entity.CloudUser;

import java.util.List;

/**
 * @Author: yesitao
 * @Date: 2019/11/14 16:23
 * @Description:
 */
public interface LocalUserService {
    void saveUser(CloudUser user);

    void updateUser(CloudUser user);

    void updateUser1(CloudUser user);

    List<CloudUser> getUsers();
}
