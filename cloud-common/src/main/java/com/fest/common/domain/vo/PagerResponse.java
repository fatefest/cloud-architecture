package com.fest.common.domain.vo;

/**
 * @Author: yesitao
 * @Date: 2019/12/12 13:51
 * @Description: 分页响应
 */
public class PagerResponse extends ResultResponse {

    private Long totalNum;

    private Long totalPage;

    private Integer pageIndex;

    private Integer pageSize;

}
