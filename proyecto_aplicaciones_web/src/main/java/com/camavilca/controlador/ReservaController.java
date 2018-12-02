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

import com.camavilca.model.Reserva;
import com.camavilca.repositorio.ReservaRepositorio;

@Controller
@RequestMapping("/reserva")
public class ReservaController {

	@Autowired
	private ReservaRepositorio r;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String Listar(ModelMap mp) {
		mp.put("reservas", r.findAll());
		return "reserva/listar";
	}
//--------------------------
	@RequestMapping(value = "/nuevo", method = RequestMethod.GET)
	public String nuevo(ModelMap mp) {
		mp.put("reserva", new Reserva());
		return "reserva/nuevo";
	}

	@RequestMapping(value = "/crear", method = RequestMethod.POST)
	public String crear(@Valid Reserva reserva, BindingResult bindingResult, ModelMap mp) {
		if (bindingResult.hasErrors()) {
			return "/reserva/nuevo";
		} else {
			r.save(reserva);
			mp.put("reserva", reserva);
			return "reserva/creado";
		}
	}

	@RequestMapping(value = "/creado", method = RequestMethod.POST)
	public String creado(@RequestParam("reserva") Reserva reserva) {
		return "/reserva/creado";
	}
	@RequestMapping(value="/borrar/{id}", method=RequestMethod.GET)
	public String borrar(@PathVariable("id") long id, ModelMap mp){
	    r.deleteById(id);
	    mp.put("reserva", r.findAll());
	    return "reserva/listar";
	}
	@RequestMapping(value="/editar/{id}", method=RequestMethod.GET)
	public String editar(@PathVariable("id") long id, ModelMap mp){
	    mp.put("reserva", r.findById(id));
	    return "reserva/editar";
	}
	 
	@RequestMapping(value="/actualizar", method=RequestMethod.POST)
	public String actualizar(@Valid Reserva reserva, BindingResult bindingResult, ModelMap mp){
		if (bindingResult.hasErrors()) {
			return "/reserva/listar";
		} else {
			r.save(reserva);
			mp.put("reservas", reserva);
			return "reserva/actualizado";
		}
	}
}