package pe.edu.cibertec.appwebfragments.controller.ventas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ventas/clientes")
public class ClientesController {
    @GetMapping("/registrar")
    public String registrarCliente(Model model) {
        return "ventas/clientes";
    }
}
