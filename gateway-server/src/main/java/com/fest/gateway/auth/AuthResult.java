package com.fest.gateway.auth;

/**
 * @Author: yesitao
 * @Date: 2019/12/5 14:51
 * @Description:
 */

public class AuthResult {

    private String msg;

    private Boolean success;

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

    public static AuthResult ofSeccess(String msg){
        AuthResult authResult = new AuthResult();
        authResult.setSuccess(true);
        authResult.setMsg(msg);
        return authResult;
    }

    public static AuthResult ofFailed(String msg){
        AuthResult authResult = new AuthResult();
        authResult.setSuccess(false);
        authResult.setMsg(msg);
        return authResult;
    }
}
