package lab.bookings.controllers;


import lab.bookings.models.Apartment;
import lab.bookings.repositories.ApartmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/apartments")
public class ApartmentController {
    private ApartmentRepository repository;

    public ApartmentController(ApartmentRepository rep){
        repository = rep;
    }

    @GetMapping()
    public String getAll(Model model) {
        model.addAttribute(new Apartment()); model.addAttribute("apartments", repository.findAll()); return "apartments";
    }

    @PostMapping()
    public String create(Apartment apartment) {
        repository.save(apartment);
        return "redirect:/apartments";
    }

    public ApartmentRepository getRepository() {
        return repository;
    }

    public void setRepository(ApartmentRepository repository) {
        this.repository = repository;
    }
}
