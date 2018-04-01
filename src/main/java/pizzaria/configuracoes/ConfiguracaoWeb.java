package pizzaria.configuracoes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@EnableWebMvc
@Controller
@ComponentScan(basePackages="pizzaria")
public class ConfiguracaoWeb extends WebMvcConfigurerAdapter{

}
