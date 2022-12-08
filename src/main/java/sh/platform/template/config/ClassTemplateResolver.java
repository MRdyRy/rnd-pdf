package sh.platform.template.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;


import static org.thymeleaf.templatemode.TemplateMode.HTML;
import static sh.platform.template.util.CommonConstant.UTF_8;

@Configuration
public class ClassTemplateResolver {
    @Bean
    public ClassLoaderTemplateResolver classLoaderTemplateResolver(){
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(HTML);
        templateResolver.setCharacterEncoding(UTF_8);
        return templateResolver;
    }
}