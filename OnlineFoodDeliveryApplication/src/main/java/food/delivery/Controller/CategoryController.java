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

import food.delivery.Model.Category;
import food.delivery.Service.ICategoryService;
import food.delivery.Service.ICategoryServiceImpl;

@RestController
@RequestMapping("foodPanda/category")
public class CategoryController {

	private ICategoryService categoryService;

	@PostMapping("/add")
	public ResponseEntity<Category> addCategory(@RequestBody Category cat)throws Exception {
		Category category = categoryService.addCategory(cat);
		return new ResponseEntity<Category>(category, HttpStatus.CREATED);

	}

	@PutMapping("/update")
	public ResponseEntity<Category> updateCategory(@RequestBody Category cat)throws Exception {
		Category category = categoryService.updateCategory(cat);
		return new ResponseEntity<Category>(category, HttpStatus.ACCEPTED);

	}

	@DeleteMapping("/remove")
	public ResponseEntity<Category> removeCategory(@RequestBody Category cat)throws Exception {
		Category category = categoryService.removeCategory(cat);
		return new ResponseEntity<Category>(category, HttpStatus.OK);

	}

	@GetMapping("/view")
	public ResponseEntity<Category> viewCategory(@RequestBody Category cat)throws Exception {
		Category category = categoryService.viewCategory(cat);
		return new ResponseEntity<Category>(category, HttpStatus.OK);

	}

	@GetMapping("/view/all")
	public ResponseEntity<List<Category>> viewAllCategory()throws Exception {
		List<Category> categories = categoryService.viewAllCategory();
		return new ResponseEntity<List<Category>>(categories, HttpStatus.OK);

	}
}
