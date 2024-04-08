package max.order;

import java.util.Map;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record OrderOut(
    String orderId,
    String clientId,
    String address,
    String orderDate,
    Map<String, Integer> products,
    Double orderValue
) {
    
}
