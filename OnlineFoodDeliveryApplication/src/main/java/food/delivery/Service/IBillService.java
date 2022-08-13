package food.delivery.Service;

import java.time.LocalDate;
import java.util.List;

import food.delivery.Model.Bill;

public interface IBillService {
	public Bill addBill(Bill bill);
	public Bill updateBill(Bill bill)throws Exception;
	public Bill removeBill(Bill bill)throws Exception;
	public Bill viewBill(Bill bill)throws Exception;
	public List<Bill> viewBills(LocalDate startDate,LocalDate enDate)throws Exception;
	public List<Bill> viewBills(int custId)throws Exception;
	public double calculateTotalCost(Bill bill)throws Exception;

}
