package qabucks;
import java.util.*;

public class QaBucks {
	public static void main(String[] args) {
		ArrayList<String> ordersArray = new ArrayList<String>();
		ArrayList<String> doneOrdersArray = new ArrayList<String>();
		addOrder("Small Espresso w/ Chocolate", ordersArray);
		addOrder("Large Cold Brew w/ double shot", ordersArray);
		getOrder(ordersArray);
		modifyOrder(0,"Large Espresso w/ Chocolate", ordersArray);
		removeOrder(1, ordersArray);
		addToDoneOrders("Large Espresso w/ Chocolate", doneOrdersArray);
		printArraysLength(doneOrdersArray, ordersArray);
		clearArray(doneOrdersArray,ordersArray,false, false);
		printArraysLength(doneOrdersArray, ordersArray);
		
	}
	
	public static void addOrder(String order, ArrayList<String> ordersArray) {
		ordersArray.add(order);
	}
	
	public static String getOrder(ArrayList<String> ordersArray) {
		return ordersArray.get(ordersArray.size()-1);
	}
	
	public static void modifyOrder(int index, String order, ArrayList<String> ordersArray) {
		ordersArray.set(index, order);
	}
	
	public static void removeOrder(int index, ArrayList<String> ordersArray) {
		ordersArray.remove(index);
	}
	
	public static void addToDoneOrders(String order, ArrayList<String> doneOrdersArray) {
		doneOrdersArray.add(order);
	}
	
	public static void printArraysLength(ArrayList<String> doneOrdersArray,ArrayList<String> ordersArray) {
		System.out.println("Length of ordersArray is " + ordersArray.size());
		System.out.println("Length of DoneOrdersArray is " + doneOrdersArray.size());
	}
	
	public static void clearArray(ArrayList<String> doneOrdersArray,ArrayList<String> ordersArray, boolean clearBoth, boolean clearDoneOrder) {
		if(clearBoth) {
			doneOrdersArray.clear();
			ordersArray.clear();
		}else if(clearDoneOrder) {
			doneOrdersArray.clear();
		}else {
			ordersArray.clear();
		}
			
	}
	
}
