/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jolab.webapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * This is a config class for DispatcherServlet core Spring MVC context.
 * This configuration class is a substitute for web.xml based configuration.
 * With this we configure the Spring MVC framework.
 * Each class that extends AbstractAnnotationConfigDispatcherServletInitializer 
 * class will automatically be used to configure DispatcherServlet and the 
 * Spring applicationcontext in the application servlet context.
 * 
 * From Servlet 3.0 container any class that implements the 
 * javax.servlet.ServletContainerInitializer interface is used to configure the 
 * servlet container.
 * 
 * Spring extends from that its SpringServletContainerInitializer that seeks out 
 * any implementationof WebApplicationInitializer interface and delegate to 
 * them for initialization.
 * AbstractAnnotationConfigDispatcherServletInitializer is a convenient base 
 * implementation of WebApplicationInitializer.
 * 
 * This class extends the abstract Spring class to define which classes is the 
 * configurator for Servlet Container.
 * 
 * @author jolab
 */
public class WebAppInitialier extends AbstractAnnotationConfigDispatcherServletInitializer{

    /**
     * Define which @Configuration class contains definitions for 
     * the middle-tier and data-tier Beans. 
     * These are the ContextLoaderListener Beans.
     * 
     */ 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // register the Root configurator Class
        return new Class<?>[] { RootConfig.class};
    }

    /**
     * Define which @Configuration class contains definition for beans for 
     * controller, view resolver and handler mappings. 
     * These are the DispatcherServlet Beans.
     * In alternative to this Java configuration style, DispatcherServlet could 
     * be initialized by web.xml file.
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        // register the Web configurator Class
        return new Class<?>[] { WebConfig.class};
    }

    /**
     * This method identify one or more paths that DispatcherServlet is mapped to.
     */
    @Override
    protected String[] getServletMappings() {
      // All requests
      return new String[] {"/"};
    }
    
}
