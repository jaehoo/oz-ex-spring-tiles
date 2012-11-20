package com.oz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Orbital Zero.
 * <p/>
 * User: jaehoo
 * Date: 19/11/12
 * Time: 18:53
 *
 * @author: <a href="mailto:jaehoo@gmail.com">Lic. José Alberto Sánchez González</a>
 * twitter: @jaehoox
 */
public class HelloWorldController extends MultiActionController{

    public final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    public ModelAndView helloAction(HttpServletRequest request, HttpServletResponse response) throws Exception {

        logger.info("Hello Action... :p !!");

        return new ModelAndView("helloView");

    }





}
