package br.com.bb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.entity.Toy;
import br.com.bb.service.impl.ToyServiceImpl;

@RestController
@RequestMapping(path = "toy")
public class ToyController {

 
	@Autowired
    ToyServiceImpl toyService;
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    List<Toy> listAll() {
        return toyService.findAll();
    }

    @RequestMapping(value = "/listOne/{toyId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
    Toy listOne(@PathVariable Integer toyId) {
        return toyService.findOne(toyId);
    }
}