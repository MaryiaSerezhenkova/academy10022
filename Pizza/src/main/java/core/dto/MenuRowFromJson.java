package core.dto;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import core.MenuRow;

public class MenuRowFromJson {
 
    public static MenuRowDTO fromJson(String jsonString) throws JsonProcessingException {
        return new ObjectMapper().readValue(jsonString, MenuRowDTO.class);
    }
    public static String toJson(List<MenuRow> menu) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(menu);
    }
}