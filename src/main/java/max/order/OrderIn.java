package max.order;

import java.util.Map;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record OrderIn (
    String idClient,
    String address,
    Map<String, Integer> products 
) {
    
}
