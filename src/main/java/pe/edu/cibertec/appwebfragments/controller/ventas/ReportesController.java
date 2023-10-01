package pe.edu.cibertec.appwebfragments.controller.ventas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ventas/reportes")
public class ReportesController {
    @GetMapping("/registrar")
    public String registrarReporte(Model model) {
        return "ventas/reportes";
    }
}
