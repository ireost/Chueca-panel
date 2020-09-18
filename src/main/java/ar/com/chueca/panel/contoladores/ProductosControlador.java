package ar.com.chueca.panel.contoladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import ar.com.chueca.panel.entidades.Productos;
import ar.com.chueca.panel.servicio.ProductosServicio;


@Controller
public class ProductosControlador {
	
	@Autowired
	private ProductosServicio prodServ;
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("productos", prodServ.traerProductos());
		return "home";
	}
	
	@GetMapping("/")
	public String hola() {
		return "bienvenida";
	}

	
	@GetMapping("/lista")
	public String traerLista(Model model) {
        model.addAttribute("productos", prodServ.traerProductos());
        return "lista";
    }
	
	@GetMapping("/agregarProducto")
	public String agregar(Model model) {
		model.addAttribute("producto", new Productos());
		return "agregarProducto";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute Productos producto, BindingResult result) {
		prodServ.guardar(producto);
		return "redirect:" + "home";
		
		
	}
	
	@GetMapping("/editar/{id}") // Map ONLY POST Requests
	public String editarProducto(@PathVariable(name="id") Long id, Model model) {
		model.addAttribute("producto", prodServ.editarProductos(id));
		return "agregarProducto";
	}
	
	@GetMapping("/eliminar/{id}") // Map ONLY POST Requests
	public String eliminarProducto(@PathVariable(name="id") Long id, Model model) {
		prodServ.eliminarProductos(id);
		model.addAttribute("productos", prodServ.traerProductos());
		return "home";
	}
	

}
