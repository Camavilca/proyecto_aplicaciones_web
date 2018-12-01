package com.camavilca.controlador;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.camavilca.model.Destino;
import com.camavilca.repositorio.DestinoRepositorio;

@Controller
@RequestMapping("/destino")
public class DestinoController {

	@Autowired
	private DestinoRepositorio d;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String Listar(ModelMap mp) {
		mp.put("destinos", d.findAll());
		return "destino/listar";
	}

	@RequestMapping(value = "/nuevo", method = RequestMethod.GET)
	public String nuevo(ModelMap mp) {
		mp.put("destino", new Destino());
		return "destino/nuevo";
	}

	@RequestMapping(value = "/crear", method = RequestMethod.POST)
	public String crear(@Valid Destino destino, BindingResult bindingResult, ModelMap mp) {
		if (bindingResult.hasErrors()) {
			return "/destino/nuevo";
		} else {
			d.save(destino);
			mp.put("destino", destino);
			return "destino/creado";
		}
	}

	@RequestMapping(value = "/creado", method = RequestMethod.POST)
	public String creado(@RequestParam("destino") Destino destino) {
		return "/destino/creado";
	}
	@RequestMapping(value="/borrar/{id}", method=RequestMethod.GET)
	public String borrar(@PathVariable("id") long id, ModelMap mp){
	    d.deleteById(id);
	    mp.put("destinos", d.findAll());
	    return "destino/listar";
	}
	@RequestMapping(value="/editar/{id}", method=RequestMethod.GET)
	public String editar(@PathVariable("id") long id, ModelMap mp){
	    mp.put("destino", d.findById(id));
	    return "destino/editar";
	}
	 
	@RequestMapping(value="/actualizar", method=RequestMethod.POST)
	public String actualizar(@Valid Destino destino, BindingResult bindingResult, ModelMap mp){
		if (bindingResult.hasErrors()) {
			return "/destino/listar";
		} else {
			d.save(destino);
			mp.put("destinos", destino);
			return "destino/actualizado";
		}
	}
}