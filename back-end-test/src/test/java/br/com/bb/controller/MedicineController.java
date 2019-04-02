package br.com.bb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.entity.Medicine;
import br.com.bb.service.impl.MediceServiceImpl;

@RestController
@RequestMapping(path = "medicine", produces = "text/plain;charset=ISO-8859-1")
public class MedicineController {

 
	@Autowired
	MediceServiceImpl medicineService;

	@RequestMapping(value = "/listAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
    List<Medicine> listAll() {
        return medicineService.findAll();
    }


	@RequestMapping(value = "/findOne/{medicineId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
    Medicine findOne(@PathVariable Integer medicineId) {
        return medicineService.findOne(medicineId);
    }
}