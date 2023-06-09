/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.inventory;

import java.util.ArrayList;
import model.store.Store;

/**
 *
 * @author nikethanann
 */
public class InventoryDirectory {
    private ArrayList<Inventory> inventoryDirectory;
    
    public InventoryDirectory(){
        this.inventoryDirectory = new ArrayList<>();
    }

    public ArrayList<Inventory> getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(ArrayList<Inventory> inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }
    
    public Inventory addNewInventory(){
        Inventory newMedicine = new Inventory();
        inventoryDirectory.add(newMedicine);
        return newMedicine;
    }
    
    public void viewInventory(Inventory inv){
        System.out.print(inv.getMedicineID()+" ---- "+inv.getMedicineName()+" --- "+ inv.getStoreID());       
    }
    
    public int getSize(){
        return inventoryDirectory.size();
    }
}
