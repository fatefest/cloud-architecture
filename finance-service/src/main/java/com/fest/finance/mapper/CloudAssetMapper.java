package com.fest.finance.mapper;

import com.fest.finance.domain.entity.CloudAsset;
import com.fest.finance.domain.entity.CloudAssetKey;

public interface CloudAssetMapper {
    int deleteByPrimaryKey(CloudAssetKey key);

    int insert(CloudAsset record);

    int insertSelective(CloudAsset record);

    CloudAsset selectByPrimaryKey(CloudAssetKey key);

    int updateByPrimaryKeySelective(CloudAsset record);

    int updateByPrimaryKey(CloudAsset record);
}