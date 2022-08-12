package food.delivery.Service;

import food.delivery.Model.FoodCart;
import food.delivery.Model.Item;

public interface ICartService {
  public FoodCart addItemToCart(FoodCart cart,Item item);
  public FoodCart increaseQuantity(FoodCart cart,Item item,int quantity);
  public FoodCart reduceQuantity(FoodCart cart,Item item,int quantity);
  public FoodCart removeItem(FoodCart cart,Item item)throws Exception;
  public FoodCart clearCart(FoodCart cart)throws Exception;
}
