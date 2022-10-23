package core.dto;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import core.MenuRow;

public class PizzaInfoFromJson {
		 
	    public static PizzaInfoDTO fromJson(String jsonString) throws JsonProcessingException {
	        return new ObjectMapper().readValue(jsonString, PizzaInfoDTO.class);
	    }
	    public static String toJson(List<MenuRow> menu) throws JsonProcessingException {
	        return new ObjectMapper().writeValueAsString(menu);
	    }
	}


