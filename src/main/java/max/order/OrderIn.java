package max.order;

import java.util.Map;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record OrderIn (
    String clientId,
    String address,
    Map<Integer, Integer> products 
) {
    
}
