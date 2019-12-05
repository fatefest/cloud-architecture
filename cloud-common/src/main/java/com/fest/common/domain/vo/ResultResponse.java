package com.fest.common.domain.vo;

/**
 * @Author: yesitao
 * @Date: 2019/12/5 15:55
 * @Description:
 */
public class ResultResponse<T> {

    private String msg;

    private Boolean success;

    private T data;

    public static <T> ResultResponse<T> ofSuccess(String msg,T data){
        return of(msg,true,data);
    }

    public static ResultResponse ofSuccess(String msg){
        return of(msg,true,null);
    }
    
    public static ResultResponse ofSuccess(){
        return of("",true,null);
    }

    public static <T> ResultResponse<T> ofError(String msg,T data){
        return of(msg,false,data);
    }

    public static ResultResponse ofError(String msg){
        return of(msg,false,null);
    }

    public static ResultResponse ofError(){
        return of("",false,null);
    }

    private static <T> ResultResponse<T> of(String msg,Boolean success,T data){
        ResultResponse r = new ResultResponse();
        r.setSuccess(success);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
