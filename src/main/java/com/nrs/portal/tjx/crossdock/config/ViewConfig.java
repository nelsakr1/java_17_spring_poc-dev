package com.nrs.portal.tjx.crossdock.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ViewConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
            .addResourceHandler("/static/**")
            .addResourceLocations("classpath:/static/");
        registry
            .addResourceHandler("/favicon.ico")
            .addResourceLocations("classpath:/static/img/favicon.ico");
    }
}
