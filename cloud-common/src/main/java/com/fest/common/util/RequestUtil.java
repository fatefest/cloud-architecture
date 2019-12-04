package com.fest.common.util;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: yesitao
 * @Date: 2019/12/3 16:00
 * @Description:
 */
public class RequestUtil {

    /**
     * 获取请求主机IP地址,如果通过代理进来，则透过防火墙获取真实IP地址
     *
     * @param request
     * @return
     * @throws IOException
     */
    public static String getIpAddress(HttpServletRequest request) {

        String ip = request.getHeader("X-Forwarded-For");

        if (ipIsBlank(ip)) {
            ip = request.getHeader("Proxy-Client-IP");

            if (ipIsBlank(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");

                if (ipIsBlank(ip)) {
                    ip = request.getHeader("HTTP_CLIENT_IP");

                    if (ipIsBlank(ip)) {
                        ip = request.getHeader("HTTP_X_FORWARDED_FOR");

                        if (ipIsBlank(ip)) {
                            ip = request.getRemoteAddr();
                        }
                    }
                }
            }

        } else if (ip.length() > 15) {

            // 经过多层代理后会有多个代理，取第一个ip地址就可以了
            String[] ips = ip.split("\\,");

            for (int index = 0; index < ips.length; index++) {

                String strIp = ips[index];

                if (!("unknown".equalsIgnoreCase(strIp))) {
                    ip = strIp;
                    break;
                }
            }
        }

        return ip;
    }

    private static boolean ipIsBlank(String ip) {

        boolean ipIsBank = StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip);

        return ipIsBank;
    }
}
