package edu.exercice.Crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.exercice.Crud.model.Montre;
import edu.exercice.Crud.repository.MontreRepository;

@RestController
@RequestMapping(value = "/app/education")
public class MontreController {

    @Autowired
    private MontreRepository montreRepository;

    @GetMapping
    public List<Montre> getMontre() {
	return montreRepository.findAll();
    }

    @PostMapping
    public void postMontre(@RequestBody Montre request) {
	Montre montre = new Montre();
	montre.setDiametre(request.getDiametre());
	montre.setMarque(request.getMarque());
	montre.setMouvement(request.getMouvement());

	montreRepository.save(montre);
    }

    @DeleteMapping("{id}")
    public void deleteClient(@PathVariable("id") Integer id) {
	Montre montre = montreRepository.getReferenceById(id);
	montreRepository.delete(montre);
    }

    @PutMapping("{id}")
    public void updateClient(@PathVariable("id") Integer id, @RequestBody Montre client) {
	Montre updateMontre = new Montre();
	updateMontre.setDiametre(client.getDiametre());
	updateMontre.setMarque(client.getMarque());
	updateMontre.setMouvement(client.getMouvement());
	montreRepository.save(updateMontre);
    }

}
