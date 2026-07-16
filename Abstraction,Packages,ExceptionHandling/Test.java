package Packages;
	abstract class Vehicle {

	    public abstract String getModelName();

	    public abstract String getRegistrationNumber();

	    public abstract String getOwnerName();
	}

	class Hero extends Vehicle {

	    public String getModelName() {
	        return "Hero Splendor";
	    }

	    public String getRegistrationNumber() {
	        return "AP39AB1234";
	    }

	    public String getOwnerName() {
	        return "Kalpana";
	    }

	    public int getSpeed() {
	        return 80;
	    }

	    public void radio() {
	        System.out.println("Radio is ON");
	    }
	}

	class Honda extends Vehicle {

	    public String getModelName() {
	        return "Honda City";
	    }

	    public String getRegistrationNumber() {
	        return "AP39CD5678";
	    }

	    public String getOwnerName() {
	        return "Kalpana";
	    }

	    public int getSpeed() {
	        return 120;
	    }

	    public void cdplayer() {
	        System.out.println("CD Player is ON");
	    }
	}

	public class Test {

	    public static void main(String[] args) {

	        Hero h = new Hero();
	        System.out.println("Hero Details");
	        System.out.println("Model Name: " + h.getModelName());
	        System.out.println("Registration Number: " + h.getRegistrationNumber());
	        System.out.println("Owner Name: " + h.getOwnerName());
	        System.out.println("Speed: " + h.getSpeed());
	        h.radio();

	        System.out.println();

	        Honda c = new Honda();
	        System.out.println("Honda Details");
	        System.out.println("Model Name: " + c.getModelName());
	        System.out.println("Registration Number: " + c.getRegistrationNumber());
	        System.out.println("Owner Name: " + c.getOwnerName());
	        System.out.println("Speed: " + c.getSpeed());
	        c.cdplayer();
	    }
	}
