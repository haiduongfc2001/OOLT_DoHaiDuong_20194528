package AimsProject.hust.soict.hedspi.aims.order;

import AimsProject.hust.soict.hedspi.aims.media.Media;
import AimsProject.hust.soict.hedspi.aims.utils.MyDate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Order {
	public static int id = 0;
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMIT_ORDERS = 5;
	private final ArrayList<Media> itemsOrdered = new ArrayList<>();
	private static int nbOrders = 0;
	private MyDate dateOrdered;

	public Order() {
		dateOrdered = new MyDate();
	}

	public static Order createOrder() {
		if (nbOrders >= MAX_LIMIT_ORDERS) {
			System.out.println("Bạn đã đạt đến số lượng đơn đặt hàng tối đa.");
			return null;
		} else {
			nbOrders++;
			return new Order();
		}
	}

	public void addMedia(Media media) {
		if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
			System.out.println("Đơn hàng đã đầy!");
		} else {
			media.setId(id);
			itemsOrdered.add(media);
			id++;
		}
	}

	public void addMedia(Media[] media) {
		List<Media> discList = new ArrayList<>();
		if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
			System.out.println("Đơn hàng đã đầy!");
		} else {
			for (Media media1 : media) {
				if (itemsOrdered.size() > MAX_NUMBERS_ORDERED) {
					discList.add(media1);
					continue;
				}
				itemsOrdered.add(media1);
			}
		}
		if (discList.size() != 0) {
			System.out.println("Danh sách các mặt hàng không thể thêm.");
			discList.forEach(digitalVideoDisc -> System.out.println(digitalVideoDisc.getTitle()));
		}
	}

	public void removeMedia(Media media) {
		itemsOrdered.remove(media);
	}

	public void removeMedia(int id) {
		for (int i = 0; i < itemsOrdered.size(); i++) {
			Media element = itemsOrdered.get(i);
			if(element.getId()==id) itemsOrdered.remove(i);
		}
	}

	public void show() {
		//itemsOrdered.forEach((System.out::println)); 
		for (int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println(itemsOrdered.get(i));
		}
	}

	public float totalCost() {
		float total = 0 ;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			total = total + itemsOrdered.get(i).getCost();
		}
		return total;
	}

	public Media getALuckyItem() {
		return itemsOrdered.get((int) (Math.random() * itemsOrdered.size()));
	}
}
