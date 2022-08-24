package com.example.hospital_crud.controllers;

import com.example.hospital_crud.models.Practitioner;
import com.example.hospital_crud.repositories.PractitionerRepisotory;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/practitioner")

public class PractitionerController {
    private final PractitionerRepisotory practitionerRepisotory;

    public PractitionerController(PractitionerRepisotory practitionerRepisotory) {
        this.practitionerRepisotory = practitionerRepisotory;
    }

    @GetMapping
    @RequestMapping("practitioners")
    public List<Practitioner> get() {
        return this.practitionerRepisotory.findAll();
    }

    @PostMapping
    public Practitioner create(@RequestBody final Practitioner practitioner) {
        return practitionerRepisotory.save(practitioner);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        practitionerRepisotory.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Practitioner update(@PathVariable Long id, @RequestBody Practitioner practitioner) {
        Practitioner existingPractitioner = practitionerRepisotory.findById(id).get();
        BeanUtils.copyProperties(practitioner, existingPractitioner, "id");
        return practitionerRepisotory.saveAndFlush(existingPractitioner);
    }
}
