package entity.dto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
 
public class ProductFromJson {
    public static ProductCreateDTO readJson(String jsonString) throws JsonProcessingException {
        Gson g = new Gson();
        return g.fromJson(jsonString, ProductCreateDTO.class);
    }
}