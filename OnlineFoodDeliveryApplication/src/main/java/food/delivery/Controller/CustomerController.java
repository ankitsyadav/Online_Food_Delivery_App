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

import food.delivery.Model.Customer;
import food.delivery.Model.Restaurant;
import food.delivery.Service.ICustomerService;
import food.delivery.Service.ICustomerServiceImpl;


@RequestMapping("foodPanda/customer")
public class CustomerController {
	
    @PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer ) {
		ICustomerService customerService=new ICustomerServiceImpl();
		Customer customer2=customerService.addCustomer(customer);
		return new ResponseEntity<Customer>(customer2, HttpStatus.CREATED);

	}
    @PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer ) {
		ICustomerService customerService=new ICustomerServiceImpl();
		Customer customer2=customerService.updateCustomer(customer);
		return new ResponseEntity<Customer>(customer2, HttpStatus.ACCEPTED);

	}
     
    @DeleteMapping("/remove")
	public ResponseEntity<Customer> removeCustomer(@RequestBody Customer customer ) {
		ICustomerService customerService=new ICustomerServiceImpl();
		Customer customer2=customerService.removeCustomer(customer);
		return new ResponseEntity<Customer>(customer2, HttpStatus.OK);

	}
    
    @GetMapping("/view")
	public ResponseEntity<Customer> viewCustomer(@RequestBody Customer customer ) {
		ICustomerService customerService=new ICustomerServiceImpl();
		Customer customer2=customerService.viewCustomer(customer);
		return new ResponseEntity<Customer>(customer2, HttpStatus.OK);

	}
    @GetMapping("/view/all")
   	public ResponseEntity<List<Customer>> viewAllCustomer(@RequestBody Restaurant restaurant )  {
   		ICustomerService customerService=new ICustomerServiceImpl();
   		List<Customer> customers=customerService.viewsAllCustomers(restaurant);
   		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);

   	}
    
    
}
