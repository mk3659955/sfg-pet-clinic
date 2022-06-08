package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequiredArgsConstructor
@RequestMapping("/owners")
public class OwnerController
{
    private final OwnerService ownerService;

    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners(Model model)
    {
        Set<Owner> all = ownerService.findAll();

        model.addAttribute("owners", all);

        return "owners/index";
    }
}
