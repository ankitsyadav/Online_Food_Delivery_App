package food.delivery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.delivery.Model.Category;
import food.delivery.Model.Item;
import food.delivery.Model.Restaurant;
import food.delivery.Service.IItemService;

@RestController
@RequestMapping("foodPanda/item")
public class ItemController {
	@Autowired
	private IItemService iItemService;

	@PostMapping("/add")
	public ResponseEntity<Item> addItem(@RequestBody Item item)throws Exception {
		Item item2 = iItemService.addItem(item);
		return new ResponseEntity<Item>(item2, HttpStatus.CREATED);

	}

	@PutMapping("/update")
	public ResponseEntity<Item> updateItem(@RequestBody Item item)throws Exception {
		Item item2 = iItemService.updateItem(item);
		return new ResponseEntity<Item>(item2, HttpStatus.OK);

	}

	@DeleteMapping("/remove")
	public ResponseEntity<Item> removeItem(@RequestBody Item item)throws Exception {
		Item item2 = iItemService.removeItem(item);
		return new ResponseEntity<Item>(item2, HttpStatus.OK);

	}

	@GetMapping("/view")
	public ResponseEntity<Item> viewItem(@RequestBody Item item)throws Exception {
		Item item2 = iItemService.viewItem(item);
		return new ResponseEntity<Item>(item2, HttpStatus.OK);

	}

	@GetMapping("/view/all")
	public ResponseEntity<List<Item>> viewAllItems(@RequestBody Category category)throws Exception {
		List<Item> items = iItemService.viewAllItem(category);
		return new ResponseEntity<List<Item>>(items, HttpStatus.OK);

	}

	@GetMapping("/view/all")
	public ResponseEntity<List<Item>> viewAllItems(@RequestBody Restaurant restaurant)throws Exception {
		List<Item> items = iItemService.viewAllItem(restaurant);
		return new ResponseEntity<List<Item>>(items, HttpStatus.OK);

	}
	@GetMapping("/view/{name}")
	public ResponseEntity<List<Item>> viewAllItemsByName(@PathVariable String name)throws Exception {
		List<Item> items = iItemService.viewAllItemByName(name);
		return new ResponseEntity<List<Item>>(items, HttpStatus.OK);

	}
}
