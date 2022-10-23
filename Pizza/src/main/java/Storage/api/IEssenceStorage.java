package Storage.api;
import java.util.List;


public interface IEssenceStorage <TYPE> {
    List<TYPE> get();
    void add (TYPE type);
    TYPE get(Long id);
    void delete(Long id);
    
}