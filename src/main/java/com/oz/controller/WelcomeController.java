package com.oz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Orbital Zero.
 * <p/>
 * User: jaehoo
 * Date: 19/11/12
 * Time: 17:42
 *
 * @author: <a href="mailto:jaehoo@gmail.com">Lic. José Alberto Sánchez González</a>
 * twitter: @jaehoox
 */

@Controller
public class WelcomeController {

    public static final Logger LOG = LoggerFactory.getLogger(WelcomeController.class);

    @RequestMapping("welcome.html")
    public ModelAndView show() {

        LOG.info("Welcome Controller... :D!!");

        return new ModelAndView("welcomeView");
    }
}
