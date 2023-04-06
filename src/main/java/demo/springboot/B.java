//package demo.springboot;
//
//import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class B implements WebMvcConfigurer {
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//
////使用前得先改名才能找到
//
//        registry.addResourceHandler("/imps/**").addResourceLocations("classpath:/imps/");
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("/imp/**").addResourceLocations("classpath:/imp/");
////        registry.addResourceHandler("/fs/**").addResourceLocations("classpath:/fs/");
////        registry.addResourceHandler("/hh/**").addResourceLocations("classpath:/hh/");
//
//    }
//}
