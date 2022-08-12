package food.delivery.Service;

import java.util.List;


import food.delivery.Model.Category;
import food.delivery.Model.Item;
import food.delivery.Model.Restaurant;

public interface IItemService {
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item viewItem(Item item);
	public List<Item> viewAllItem(Category cat);
	public List<Item> viewAllItem(Restaurant res);
	public List<Item> viewAllItemByName(String name);

}
