package com.fest.user.service.impl;

import com.fest.user.domain.entity.CloudUser;
import com.fest.user.mapper.CloudUserMapper;
import com.fest.user.service.LocalUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: yesitao
 * @Date: 2019/11/14 16:24
 * @Description:
 */
@Service
public class LocalUserServiceImpl implements LocalUserService {

    @Resource
    CloudUserMapper cloudUserMapper;

    @Override
    public void saveUser(CloudUser user) {
        cloudUserMapper.insertSelective(user);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateUser(CloudUser user){
//        if(user.getId()>6){
//            throw new RuntimeException("错误");
//        }else{
//            user.setAge(user.getId());
//        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cloudUserMapper.updateByPrimaryKey(user);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateUser1(CloudUser user){
//        if(user.getId()>6){
//            throw new RuntimeException("错误");
//        }else{
//            user.setAge(user.getId());
//        }
        cloudUserMapper.updateByPrimaryKey(user);
    }

    @Override
    public List<CloudUser> getUsers() {
        return cloudUserMapper.getUsers();
    }
}
