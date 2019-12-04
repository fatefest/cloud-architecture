package com.fest.user.mapper;

import com.fest.user.domain.entity.CloudUser;

public interface CloudUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CloudUser record);

    int insertSelective(CloudUser record);

    CloudUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CloudUser record);

    int updateByPrimaryKey(CloudUser record);
}