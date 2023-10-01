package pe.edu.cibertec.appwebfragments.controller.ventas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ventas/producto")
public class ProductoController {
    @GetMapping("/registrar")
    public String registrarProducto(Model model) {
        return "ventas/producto";
    }
}
