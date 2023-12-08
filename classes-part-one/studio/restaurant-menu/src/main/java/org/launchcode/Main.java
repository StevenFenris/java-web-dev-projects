package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Menu myMenu = new Menu("Lots and Lots of Nachos");

        myMenu.addMenuItem(new MenuItem("Appetizer", "Nachos1", "You know what Nachos is", 8.50));
        myMenu.addMenuItem(new MenuItem("Appetizer", "Nachos2", "You know what Nachos is", 8.50));
        myMenu.addMenuItem(new MenuItem("Main Course", "Nachos3", "You know what Nachos is", 8.50));
        myMenu.addMenuItem(new MenuItem("Main Course", "Nachos4", "You know what Nachos is", 8.50));
        myMenu.addMenuItem(new MenuItem("Main Course", "Nachos5", "You know what Nachos is", 8.50));
        myMenu.addMenuItem(new MenuItem("Zessert", "Nachos6", "You know what Nachos is", 8.50));
        myMenu.addMenuItem(new MenuItem("Zessert", "Nachos7", "You know what Nachos is", 8.50));

        myMenu.printMenu(myMenu.getTheMenu());

    }
}
