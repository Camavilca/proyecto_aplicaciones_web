package com.camavilca.controlador;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.camavilca.model.Cliente;
import com.camavilca.repositorio.ClienteRepositorio;

@Controller
@RequestMapping("/cliente")
public class ClienteControler {

	@Autowired
	private ClienteRepositorio c;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String Listar(ModelMap mp) {
		mp.put("clientes", c.findAll());
		return "cliente/listar";
	}

	@RequestMapping(value = "/nuevo", method = RequestMethod.GET)
	public String nuevo(ModelMap mp) {
		mp.put("cliente", new Cliente());
		return "cliente/nuevo";
	}

	@RequestMapping(value = "/crear", method = RequestMethod.POST)
	public String crear(@Valid Cliente cliente, BindingResult bindingResult, ModelMap mp) {
		if (bindingResult.hasErrors()) {
			return "/cliente/nuevo";
		} else {
			c.save(cliente);
			mp.put("cliente", cliente);
			return "cliente/creado";
		}
	}

	@RequestMapping(value = "/creado", method = RequestMethod.POST)
	public String creado(@RequestParam("cliente") Cliente cliente) {
		return "/cliente/creado";
	}
	@RequestMapping(value="/borrar/{id}", method=RequestMethod.GET)
	public String borrar(@PathVariable("id") long id, ModelMap mp){
	    c.deleteById(id);
	    mp.put("clientes", c.findAll());
	    return "cliente/listar";
	}
	@RequestMapping(value="/editar/{id}", method=RequestMethod.GET)
	public String editar(@PathVariable("id") long id, ModelMap mp){
	    mp.put("cliente", c.findById(id));
	    return "cliente/editar";
	}
	 
	@RequestMapping(value="/actualizar", method=RequestMethod.POST)
	public String actualizar(@Valid Cliente cliente, BindingResult bindingResult, ModelMap mp){
		if (bindingResult.hasErrors()) {
			return "/cliente/listar";
		} else {
			c.save(cliente);
			mp.put("clientes", cliente);
			return "cliente/actualizado";
		}
	}
}
