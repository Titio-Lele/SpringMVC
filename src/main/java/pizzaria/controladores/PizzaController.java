package pizzaria.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {
	
	public PizzaController() {
		System.out.println("Controlador criado com sucesso.");
	}
	
	@RequestMapping("/ola/{nome}")
	@ResponseBody
	public String Hello (@PathVariable String nome) {
		return "Olá! " + nome; 
	}
}
