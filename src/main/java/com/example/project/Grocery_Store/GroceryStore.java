package com.example.project.Grocery_Store;
import java.util.ArrayList;
public class GroceryStore {
    /** An array of products normally stocked at the grocery store
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private Product[] productsStocked;

    public GroceryStore(Product[] initialInventory) {
        productsStocked = initialInventory;
    }

    /** Returns an ArrayList of indices for Product elements in the
     *  productsStocked array that need to be reordered, as described in part (a)
     *  Precondition: min > 0 */
    public ArrayList<Integer> getReorderList(int min) {
        /* to be implemented in part (a) */
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < productsStocked.length; i++) {
            if (productsStocked[i].getQuantity() <= min) {
                list.add(i);
            }
        }
        return list;
    }

    /** Returns true if all products named in shoppingList are available for purchase
     *  and returns false otherwise, as described in part (b)
     *  Precondition: The products named in shoppingList are found exactly once
     *  in the productsStocked array.
     */
    public boolean checkAvailability(ArrayList<String> shoppingList) {
        /* to be implemented in part (b) */
        //check for product name
        //check if stock is less than 1
        boolean bool = true;
        for (String thing : shoppingList) {
            for (Product product : productsStocked) {
                if (thing.equals(product.getName())) {
                    if (product.getQuantity() < 1) {
                        bool = false;
                    }
 
 
                }
            }
        }
        return bool;
    } 
}