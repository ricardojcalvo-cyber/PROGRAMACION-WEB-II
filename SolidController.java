package tecnicotec.menu_de_navegacion;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SolidController {

    @GetMapping("/")
    public String home() {
        return "redirect:/s";
    }

    @GetMapping("/s")
    public String s(Model model) {
        model.addAttribute("active", "s");
        return "s";   // templates/s.html
    }

    @GetMapping("/o")
    public String o(Model model) {
        model.addAttribute("active", "o");
        return "o";
    }

    @GetMapping("/l")
    public String l(Model model) {
        model.addAttribute("active", "l");
        return "l";
    }

    @GetMapping("/i")
    public String i(Model model) {
        model.addAttribute("active", "i");
        return "i";
    }

    @GetMapping("/d")
    public String d(Model model) {
        model.addAttribute("active", "d");
        return "d";
    }
}
