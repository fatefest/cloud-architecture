package com.fest.finance.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CloudAsset extends CloudAssetKey {
    /**
     *  
     */
    private BigDecimal availableMoney;

    /**
     *  
     */
    private BigDecimal frozenMoney;

    /**
     *  
     */
    private Date createTime;

    /**
     *  
     */
    private Date updateTime;

    public BigDecimal getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(BigDecimal availableMoney) {
        this.availableMoney = availableMoney;
    }

    public BigDecimal getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(BigDecimal frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}