package com.dtsp.portal.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created by Dimitar Dimitrov
 */
@RestController
public class MainPageController {

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = {"/",
            "/login",
            "/registration",
            "/recovery",
            "/booking/*",
            "/accept/*",
            "/meeting/*",
            "/dashboard",
            "/history",
            "/homepage",
            "/scheduling",
            "/appointment/*",
            "/account/*",
            "/dependents",
            "/role",
            "/learn-more",
            "/documents",
            "/appointments"})
    public ModelAndView mainPage() {
        return new ModelAndView("forward://index.html");
    }
}
