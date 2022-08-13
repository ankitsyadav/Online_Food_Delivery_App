package food.delivery.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import food.delivery.Model.Bill;
import food.delivery.Service.IBillService;

@RestController
@RequestMapping("foodPanda/bill")
public class BillController {
	@Autowired
	private IBillService billService;

	@PostMapping("/add")
	public ResponseEntity<Bill> addBill(@RequestBody Bill bill)throws Exception {
		Bill bill2 = billService.addBill(bill);
		return new ResponseEntity<Bill>(bill2, HttpStatus.CREATED);

	}

	@PutMapping("/update")
	public ResponseEntity<Bill> updateBill(@RequestBody Bill bill) throws Exception {
		Bill bill2 = billService.updateBill(bill);
		return new ResponseEntity<Bill>(bill2, HttpStatus.ACCEPTED);

	}

	@DeleteMapping("/remove")
	public ResponseEntity<Bill> removeBill(@RequestBody Bill bill) throws Exception {
		Bill bill2 = billService.removeBill(bill);
		return new ResponseEntity<Bill>(bill2, HttpStatus.ACCEPTED);

	}

	@GetMapping("/view")
	public ResponseEntity<Bill> viewBills(@RequestBody Bill bill) throws Exception {
		Bill bill2 = billService.viewBill(bill);
		return new ResponseEntity<Bill>(bill2, HttpStatus.OK);

	}

	@GetMapping("/views")
	public ResponseEntity<List<Bill>> viewBills(@RequestBody LocalDate startDate, @RequestBody LocalDate enDate)
			throws Exception {
		List<Bill> bills = billService.viewBills(startDate, enDate);
		return new ResponseEntity<List<Bill>>(bills, HttpStatus.OK);

	}

	@GetMapping("/view/{customerId}")
	public ResponseEntity<List<Bill>> viewBill(@PathVariable Integer customerId) throws Exception {
		List<Bill> bills = billService.viewBills(customerId);
		return new ResponseEntity<List<Bill>>(bills, HttpStatus.OK);

	}

	@GetMapping("calculate")
	public ResponseEntity<Double> calculateBill(@RequestBody Bill bill) throws Exception {
		double total = billService.calculateTotalCost(bill);
		return new ResponseEntity<Double>(total, HttpStatus.OK);

	}

}
