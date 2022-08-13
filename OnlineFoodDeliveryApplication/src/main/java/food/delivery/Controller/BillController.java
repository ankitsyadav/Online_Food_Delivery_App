package food.delivery.Controller;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import food.delivery.Model.Bill;
import food.delivery.Service.IBillService;
import food.delivery.Service.IBillServiceImpl;
@RequestMapping("foodPanda/bill")
public class BillController {
	
	@PostMapping("/add")
	public ResponseEntity<Bill> addBill(@RequestBody Bill bill){
		IBillService billService=new IBillServiceImpl();
		Bill bill2=billService.addBill(bill);
		return new ResponseEntity<Bill>(bill2,HttpStatus.CREATED);
		
	}
	@PutMapping("/update")
	public ResponseEntity<Bill> updateBill(@RequestBody Bill bill) throws Exception{
		IBillService billService=new IBillServiceImpl();
		Bill bill2=billService.updateBill(bill);
		return new ResponseEntity<Bill>(bill2,HttpStatus.ACCEPTED);
		
	}
	@DeleteMapping("/remove")
	public ResponseEntity<Bill> removeBill(@RequestBody Bill bill) throws Exception{
		IBillService billService=new IBillServiceImpl();
		Bill bill2=billService.removeBill(bill);
		return new ResponseEntity<Bill>(bill2,HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/view")
	public ResponseEntity<Bill> viewBills(@RequestBody Bill bill) throws Exception{
		IBillService billService=new IBillServiceImpl();
		Bill bill2=billService.viewBill(bill);
		return new ResponseEntity<Bill>(bill2,HttpStatus.OK);
		
	}
	
	@GetMapping("/views")
	public ResponseEntity<List<Bill>> viewBills(@RequestBody LocalDate startDate,@RequestBody LocalDate enDate) throws Exception{
		IBillService billService=new IBillServiceImpl();
		List<Bill> bills=billService.viewBills(startDate, enDate);
		return new ResponseEntity<List<Bill>>(bills,HttpStatus.OK);
		
	}
	
	@GetMapping("/view/{customerId}")
<<<<<<< HEAD
	public ResponseEntity<List<Bill>> viewBill(@PathVariable int customerId ) throws Exception{
=======
	public ResponseEntity<List<Bill>> viewBill(@PathVariable Integer customerId ) throws Exception{
>>>>>>> 15fbf0fcb27194d9d7fd748f5f5c206724faf442
		IBillService billService=new IBillServiceImpl();
		List<Bill> bills=billService.viewBills(customerId);
		return new ResponseEntity<List<Bill>>(bills,HttpStatus.OK);
		
	}
	@GetMapping("calculate")
	public ResponseEntity<Double> calculateBill(@RequestBody Bill bill ) throws Exception{
		IBillService billService=new IBillServiceImpl();
		double total=billService.calculateTotalCost(bill);
		return new ResponseEntity<Double>(total,HttpStatus.OK);
		
	}

}
