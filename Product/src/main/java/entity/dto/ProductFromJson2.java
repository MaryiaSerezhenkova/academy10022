package entity.dto;
import java.util.List;
 
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
 
import entity.core.Product;
 
public class ProductFromJson2 {
 
    public static ProductCreateDTO fromJson(String jsonString) throws JsonProcessingException {
        return new ObjectMapper().readValue(jsonString, ProductCreateDTO.class);
    }
    public static String toJson(List<Product> product) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(product);
    }
}
