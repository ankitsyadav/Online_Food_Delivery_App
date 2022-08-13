package food.delivery.Controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import food.delivery.Model.FoodCart;
import food.delivery.Model.Item;
import food.delivery.Service.ICartService;

@RestController
@RequestMapping("foodPanda/cart")
public class CartController {

	@Autowired
	private ICartService iCartService;

	@PostMapping("/addItem")
	public ResponseEntity<FoodCart> addItemToCart(@RequestBody FoodCart foodCart, @RequestBody Item item)throws Exception {
		FoodCart foodCart2 = iCartService.addItemToCart(foodCart, item);
		return new ResponseEntity<FoodCart>(foodCart2, HttpStatus.CREATED);

	}

	@PutMapping("/item/increase")
	public ResponseEntity<FoodCart> increaseQuantity(@RequestBody FoodCart foodCart, @RequestBody Item item,
			@RequestBody int quantity) throws Exception{
		FoodCart foodCart2 = iCartService.increaseQuantity(foodCart, item, quantity);
		return new ResponseEntity<FoodCart>(foodCart2, HttpStatus.ACCEPTED);

	}

	@PutMapping("/item/reduce")
	public ResponseEntity<FoodCart> reduceQuantity(@RequestBody FoodCart foodCart, @RequestBody Item item,
			@RequestBody int quantity)throws Exception {
		FoodCart foodCart2 = iCartService.reduceQuantity(foodCart, item, quantity);
		return new ResponseEntity<FoodCart>(foodCart2, HttpStatus.ACCEPTED);

	}

	@PutMapping("/item/remove")
	public ResponseEntity<FoodCart> removeitem(@RequestBody FoodCart foodCart, @RequestBody Item item)
			throws Exception {
		FoodCart foodCart2 = iCartService.removeItem(foodCart, item);
		return new ResponseEntity<FoodCart>(foodCart2, HttpStatus.ACCEPTED);

	}

	@DeleteMapping("/clear")
	public ResponseEntity<FoodCart> clearCart(@RequestBody FoodCart foodCart) throws Exception {
		FoodCart foodCart2 = iCartService.clearCart(foodCart);
		return new ResponseEntity<FoodCart>(foodCart2, HttpStatus.ACCEPTED);

	}
}
