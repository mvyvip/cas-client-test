package com.lt.cas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by litao on 2016/12/27 0027.
 */
@Controller
public class CasController {
    @RequestMapping("/test")
    @ResponseBody
    public String index(HttpServletRequest request, HttpServletResponse response) {
        String result = "execute test method</br>";
        result +=   "sessionId                  :   "+request.getSession().getId()  +"</br>";
        result +=   "request.getRemoteUser()    :   " + request.getRemoteUser()     +"</br>";
        result +=   "request.getUserPrincipal() :   " + request.getUserPrincipal()  +"</br>";
        return result;
    }

    @RequestMapping(value={"/","/index"})
    @ResponseBody
    public String error(HttpServletRequest request, HttpServletResponse response) {
        String result = "execute index method</br>";
        result +=   "sessionId                  :   "+request.getSession().getId()  +"</br>";
        result +=   "request.getRemoteUser()    :   " + request.getRemoteUser()     +"</br>";
        result +=   "request.getUserPrincipal() :   " + request.getUserPrincipal()  +"</br>";
        return result;
    }
}
