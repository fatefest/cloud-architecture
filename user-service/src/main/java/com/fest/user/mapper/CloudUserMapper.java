package com.fest.user.mapper;

import com.fest.user.domain.entity.CloudUser;

import java.util.List;

public interface CloudUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CloudUser record);

    int insertSelective(CloudUser record);

    CloudUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CloudUser record);

    int updateByPrimaryKey(CloudUser record);

    List<CloudUser> getUsers();

}