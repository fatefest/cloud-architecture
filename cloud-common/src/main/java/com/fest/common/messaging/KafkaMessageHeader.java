package com.fest.common.messaging;



import org.springframework.messaging.MessageHeaders;

import java.io.Serializable;

/**
 * @Author: yesitao
 * @Date: 2019/12/17 15:03
 * @Description:还未实现对kafka消息header的映射处理
 */
public class KafkaMessageHeader implements Serializable {


    private Long offset;
    private Boolean  nativeHeadersPresent;
    private Integer deliveryAttempt;
    private String timestampType;
    private String receivedMessageKey;
    private Long receivedPartitionId;
    private String contentType;
    private String topic;
    private Long receivedTimestamp;

    public KafkaMessageHeader(){}

    /**
     *
     * @param kafkaHeaders
     */
    public KafkaMessageHeader(MessageHeaders kafkaHeaders){
        //TODO 转化字段映射
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Boolean getNativeHeadersPresent() {
        return nativeHeadersPresent;
    }

    public void setNativeHeadersPresent(Boolean nativeHeadersPresent) {
        this.nativeHeadersPresent = nativeHeadersPresent;
    }

    public Integer getDeliveryAttempt() {
        return deliveryAttempt;
    }

    public void setDeliveryAttempt(Integer deliveryAttempt) {
        this.deliveryAttempt = deliveryAttempt;
    }

    public String getTimestampType() {
        return timestampType;
    }

    public void setTimestampType(String timestampType) {
        this.timestampType = timestampType;
    }

    public String getReceivedMessageKey() {
        return receivedMessageKey;
    }

    public void setReceivedMessageKey(String receivedMessageKey) {
        this.receivedMessageKey = receivedMessageKey;
    }

    public Long getReceivedPartitionId() {
        return receivedPartitionId;
    }

    public void setReceivedPartitionId(Long receivedPartitionId) {
        this.receivedPartitionId = receivedPartitionId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Long getReceivedTimestamp() {
        return receivedTimestamp;
    }

    public void setReceivedTimestamp(Long receivedTimestamp) {
        this.receivedTimestamp = receivedTimestamp;
    }

}
