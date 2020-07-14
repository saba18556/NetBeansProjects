
package labtsak5_18556;

import java.util.ArrayList;
import java.util.Scanner;

class Item{
    
    public String name;
    public double price;
    public int quantity;
    
    public Item(){
        
    }
    
    public Item(String name, int qty, double price){
        this.name = name;
        quantity = qty;
        this.price = price;
       
    } 
    
    public void setQuantity(int qty){
        quantity = qty;
    }
    
    public void setPrice(double rate){
        
        price = rate;
    }
    
    public int getQuantity(){
        
        return quantity;
        
    }
    
    public double getPrice(){
        
        return price;
        
    }
    
    public String toString(){
        
        return("Item: "+ name + ", quantity: "+quantity + ", price: "+ price);
    }
}

class Cosmetics extends Item{
    
    public Cosmetics(String name, int quantity, double price){
        
        super(name, quantity, price);
    }
  
}

class Clothes extends Item{
    
    public Clothes(String name, int quantity, double price){
        
        super(name, quantity, price);
        
    }
}

class Electronics extends Item{
    
    public Electronics(String name, int quantity, double price){
        
         super(name, quantity, price);
         
    }
}

class Groceries extends Item{
    
    public Groceries(String name, int quantity, double price){
        super(name, quantity, price);
    }
}


class Order{
    
    public String customerName;
    public double orderTotal;
    public ArrayList <Item> list = new ArrayList<>();
     
    
    
    public void addItem(Item item){
        
        list.add(item);
        
        for (Item list1 : list) {
            orderTotal += list1.quantity * list1.price;
        }
    }
    
    public void removeItem(Item item){
        
        list.remove(item);
        
        for (Item list1 : list) {
            orderTotal -= list1.quantity * list1.price;
        }
        
    }
    
    
    public double getOrderTotal (){
        
        return orderTotal;
    }
    
    public void setName(String name){
        
       customerName=name; 
        
    }
    
    public String getName(){
        
        return customerName;
        
    }
    
    
    public String toString(){
        
        return( " Total order: "+ orderTotal + ", Order Items: "+list.toString());
    }
    
   
}

class Inventory{
    
    public ArrayList<Item> obj1 = new ArrayList<>();
    public ArrayList<Order> obj2 = new ArrayList<>();
   
    
    public void addInventory(Item item ){
        
       boolean check=false;
            for (int i=0; i<obj1.size(); i++){
                if (obj1.get(i).name.equalsIgnoreCase(item.name)){
                    check=true;
                    obj1.get(i).setQuantity(item.quantity+obj1.get(i).quantity);
                }
            }
        
        if (check==false){
        obj1.add(item);
        }
    }
    
   
    
    public String getInventory(){
        
        
        return obj1.toString();
        
    }
    
    public void addOrders(Order order){
        
        obj2.add(order);
        
    }
    
    public String getOrder(){
        
        return obj2.toString();
        
    }
    
    public String toString(){
        
        return("Item list: "+obj1.toString()+", Order list: "+ obj2.toString());
        
    }
}

public class LabTsak5_18556 {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        Inventory o1 = new Inventory();
         Order o2= new Order();
        Item o3= new Item();
        
        System.out.println("----------------------------");
        System.out.println("Welcome to Inventory System: ");
        System.out.println("----------------------------");
        
        boolean check = true;
        
        do{
        
        System.out.println("Please make your selection:\n"+"1. Add Inventory\n"+"2. Add Order\n"+"3. Show Inventory\n"+"4. Show All Orders\n"+"5. Show All Details\n"+"6. Exit System\n");
        
        System.out.print("");
        System.out.print(">");
        int a = in.nextInt();
        
        switch(a){
            
            case 1:
                
                System.out.println("You can add items from the following list:\n"+"1. Clothes\n"+"2. Groceries\n"+"3. Electronics\n"+"4. Cosmetics");
                System.out.println("");
                
                System.out.print(">");
                int select1 = in.nextInt();
                
                switch(select1){
                    
                    case 1:
                        
                        System.out.println("---Clothes---");
                        System.out.print("Enter name: ");
                        String name1 = in.next();
                        System.out.print("Enter Quantity: ");
                        int qty1 = in.nextInt();
                        System.out.println("Enter Price per unit: ");
                        double rate1 = in.nextDouble();
                        
                        o1.addInventory(new Clothes(name1, qty1, rate1));
                        
                        break;
                        
                    case 2:
                        
                        System.out.println("---Groceries---");
                        System.out.print("Enter name: ");
                        String name2 = in.next();
                        System.out.print("Enter Quantity: ");
                        int qty2 = in.nextInt();
                        System.out.println("Enter Price per unit: ");
                        double rate2 = in.nextDouble();
                        
                        o1.addInventory(new Groceries(name2, qty2, rate2));
                        
                        break;
                        
                    case 3:
                        
                        System.out.println("---Electronics---");
                        System.out.print("Enter name: ");
                        String name3 = in.next();
                        System.out.print("Enter Quantity: ");
                        int qty3 = in.nextInt();
                        System.out.println("Enter Price per unit: ");
                        double rate3 = in.nextDouble();
                        
                        o1.addInventory(new Electronics(name3, qty3, rate3));
                        
                        break;
                        
                    case 4:
                        
                        System.out.println("---Cosmetics---");
                        System.out.print("Enter name: ");
                        String name4 = in.next();
                        System.out.print("Enter Quantity: ");
                        int qty4 = in.nextInt();
                        System.out.println("Enter Price per unit: ");
                        double rate4 = in.nextDouble();
                        
                        o1.addInventory(new Electronics(name4, qty4, rate4));
                        
                        break;
                        
                }
            break;
                
            case 2:
                
                System.out.println("You can add to the cart from the following options: ");
                System.out.println("");
                
                System.out.println(o1.getInventory());
                System.out.println("");
                System.out.print("Enter Name: ");
                String name=in.next();
                System.out.print("Enter Quantity: ");
                int quantity=in.nextInt();
                
                for (int i=0; i<o1.obj1.size(); i++){
                    if ((o1.obj1.get(i).name.equalsIgnoreCase(name))){    
                        if(o1.obj1.get(i).quantity<(quantity)){
                        System.err.print("Please enter a valid quantity: ");
                        int quan =in.nextInt();
                        o2.addItem(new Item(name, quan, o1.obj1.get(i).price));
                        o1.obj1.get(i).setQuantity(o1.obj1.get(i).getQuantity()-quan);
                    }
                        else {
                        o2.addItem(new Item(name, quantity, o1.obj1.get(i).price));
                        o1.obj1.get(i).setQuantity(o1.obj1.get(i).getQuantity()-quantity);
                        }
                    }
                    
                    
                }
                System.out.println("");
                System.out.println(o2);
                break;
                
            case 3:
                System.out.println("");
                System.out.println("Inventory: " + o1);
                break;
                
            case 4:
                System.out.println("");
                System.out.println("Orders: " + o2);
                break;
            
            case 5:
                System.out.println("");
                System.out.println("Inventory: " + o1 + "\nOrders: " + o2);
                break;
                
            case 6:
                System.out.println("System exits.");
                System.exit(0);
                break;
            
           
            }
        }
        while(check==true);
                
        }
        
        
       
        
        
    }
    

