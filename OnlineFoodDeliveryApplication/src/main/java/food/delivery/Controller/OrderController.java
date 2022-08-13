package food.delivery.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.delivery.Model.Customer;
import food.delivery.Model.OrderDetails;
import food.delivery.Model.Restaurant;
import food.delivery.Service.IOrderService;



@RestController
@RequestMapping("foodPanda/order")
public class OrderController {

	private IOrderService orderService;
	
	@PostMapping("/add")
	public ResponseEntity<OrderDetails> addOrder(@RequestBody OrderDetails order) throws Exception {
		OrderDetails orderDetails=orderService.addOrder(order);
		return new ResponseEntity<OrderDetails>(orderDetails,HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<OrderDetails> updateOrder(@RequestBody OrderDetails order)throws Exception {
		OrderDetails orderDetails=orderService.updateOrder(order);
		return new ResponseEntity<OrderDetails>(orderDetails,HttpStatus.OK);
	}
	@DeleteMapping("/remove")
	public ResponseEntity<OrderDetails> removeOrder(@RequestBody OrderDetails order)throws Exception {
		OrderDetails orderDetails=orderService.removeOrder(order);
		return new ResponseEntity<OrderDetails>(orderDetails,HttpStatus.OK);
	}
	@GetMapping("/view")
	public ResponseEntity<OrderDetails> viewOrder(@RequestBody OrderDetails order)throws Exception {
		OrderDetails orderDetails=orderService.viewOrder(order);
		return new ResponseEntity<OrderDetails>(orderDetails,HttpStatus.OK);
	}
	@GetMapping("/view/all")
	public ResponseEntity<List<OrderDetails>> viewAllOrder(@RequestBody Restaurant restaurant)throws Exception {
		List<OrderDetails> orderDetails=orderService.viewAllAllOrders(restaurant);
		return new ResponseEntity<List<OrderDetails>>(orderDetails,HttpStatus.OK);
	}
	@GetMapping("/view/all")
	public ResponseEntity<List<OrderDetails>> viewAllOrder(@RequestBody Customer customer)throws Exception {
		List<OrderDetails> orderDetails=orderService.viewAllAllOrders(customer);
		return new ResponseEntity<List<OrderDetails>>(orderDetails,HttpStatus.OK);
	}
	

}
