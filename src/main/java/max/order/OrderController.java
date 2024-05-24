package max.order;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "max-order")
public interface OrderController {
    
    @GetMapping("/orders/{id}")
    public ResponseEntity<OrderOut> read(@PathVariable(required = true) String id);

    @GetMapping("/orders")
    public ResponseEntity<List<OrderOut>> list();

    @PostMapping("/orders")
    public ResponseEntity<OrderOut> create(@RequestBody(required = true) OrderIn orderIn);

    @PutMapping("/orders/{id}")
    public ResponseEntity<OrderOut> update(@PathVariable(required = true) String id, @RequestBody(required = true) OrderIn OrderIn);

    @DeleteMapping("/orders/{id}")
    public ResponseEntity<OrderOut> delete(@PathVariable(required = true) String id);

    @GetMapping("/orders/client/{id}")
    public ResponseEntity<List<OrderOut>> readByClient(@PathVariable(required = true) String id);
}
