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

import br.com.bb.entity.Product;
import br.com.bb.service.impl.ProductServiceImpl;

@RestController
@RequestMapping(path = "product", produces = "text/plain;charset=ISO-8859-1")
public class ProductController {

 
	@Autowired
    ProductServiceImpl productService;

	@RequestMapping(value = "/listAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
    List<Product> listAll() {
        return productService.findAll();
    }

	
	@RequestMapping(value = "/listByCategory/{categoryId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    List<Product> listByCategory(@PathVariable Integer categoryId) {
        return productService.findByCategory(categoryId);
    }
}