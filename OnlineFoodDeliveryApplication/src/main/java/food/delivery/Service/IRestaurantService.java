package food.delivery.Service;


import java.util.List;

import food.delivery.Model.Restaurant;

public interface IRestaurantService {
	public Restaurant addRestaurant(Restaurant res);
	public Restaurant updateRestaurant(Restaurant res);
	public Restaurant removeRestaurant(Restaurant res) ;
	public Restaurant viewRestaurant(Restaurant res);
	public List<Restaurant> viewBearRestaurants(String location);
	public List<Restaurant> viewRestaurantByItemName(String name);

}
