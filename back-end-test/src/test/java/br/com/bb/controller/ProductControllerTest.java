package br.com.bb.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import br.com.bb.Application;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class ProductControllerTest {

	@Autowired
    private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
    public void listByCategoryAlimentos() throws Exception {
        mockMvc.perform(get("/product/listByCategory/1")
        		.contentType(MediaType.APPLICATION_JSON)
        		.characterEncoding("utf-8"))
        .andExpect(status().isOk())
	    		.andExpect(jsonPath("$", hasSize(2)))
	        .andExpect(jsonPath("$[0].id", is(1)))
	        .andExpect(jsonPath("$[0].name", is("Arroz")))
	        .andExpect(jsonPath("$[1].id", is(2)))
	        .andExpect(jsonPath("$[1].name", is("Feijão")));
    }

	@Test
	public void listByCategoryEletrodomésticos() throws Exception {
		mockMvc.perform(get("/product/listByCategory/2")
				.contentType(MediaType.APPLICATION_JSON)
        		.characterEncoding("utf-8"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", hasSize(3)))
		.andExpect(jsonPath("$[0].id", is(3)))
		.andExpect(jsonPath("$[0].name", is("Aspirador de pó")))
		.andExpect(jsonPath("$[1].id", is(4)))
		.andExpect(jsonPath("$[1].name", is("Batedeira")))
		.andExpect(jsonPath("$[2].id", is(5)))
		.andExpect(jsonPath("$[2].name", is("Liquidificador")));
	}

	@Test
	public void listByCategoryMóveis() throws Exception {
		mockMvc.perform(get("/product/listByCategory/3")
				.contentType(MediaType.APPLICATION_JSON)
        		.characterEncoding("utf-8"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", hasSize(3)))
		.andExpect(jsonPath("$[0].id", is(6)))
		.andExpect(jsonPath("$[0].name", is("Sofá")))
		.andExpect(jsonPath("$[1].id", is(7)))
		.andExpect(jsonPath("$[1].name", is("Mesa")))
		.andExpect(jsonPath("$[2].id", is(8)))
		.andExpect(jsonPath("$[2].name", is("Estante")));
	}
	
	@Test
	public void listByCategoryNoContent() throws Exception {
		mockMvc.perform(get("/product/listByCategory/999")
				.contentType(MediaType.APPLICATION_JSON)
        		.characterEncoding("utf-8"))
		.andExpect(status().isNoContent());
	}
	
	@Test
	public void listByCategoryBadRequest() throws Exception {
		mockMvc.perform(get("/product/listByCategory/A")
				.contentType(MediaType.APPLICATION_JSON)
        		.characterEncoding("utf-8"))
		.andExpect(status().isBadRequest());
	}
	
	@Test
	public void listByCategoryNotFound() throws Exception {
		mockMvc.perform(get("/product/listByCategory/")
				.contentType(MediaType.APPLICATION_JSON)
        		.characterEncoding("utf-8"))
		.andExpect(status().isNotFound());
	}
}