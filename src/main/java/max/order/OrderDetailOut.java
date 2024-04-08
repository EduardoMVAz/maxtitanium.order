package max.order;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record OrderDetailOut (
    String idProduct,
    Integer quantity
) {
    
}
