package MiniProject2;

public class videostore {
		private video[] store;
	    private int count;
	    public videostore() {
	        store = new video[10];
	        count = 0;
	    }
	    public void addVideo(String name) {
	        if (count == store.length) {
	            System.out.println("Store is Full.");
	            return;
	        }
	        store[count] = new video(name);
	        count++;
	        System.out.println("Video \"" + name + "\" added successfully.");
	    }
	    public void doCheckout(String name) {
	        for (int i = 0; i < count; i++) {
	            if (store[i].getName().equalsIgnoreCase(name)) {
	                if (store[i].getCheckout()) {
	                    System.out.println("Video already checked out.");
	                } else {
	                    store[i].doCheckout();
	                    System.out.println("Video \"" + name + "\" checked out successfully.");
	                }
	                return;
	            }
	        }
	        System.out.println("Video not found.");
	    }
	    public void doReturn(String name) {
	        for (int i = 0; i < count; i++) {
	            if (store[i].getName().equalsIgnoreCase(name)) {
	                if (!store[i].getCheckout()) {
	                    System.out.println("Video is already available.");
	                } else {
	                    store[i].doReturn();
	                    System.out.println("Video \"" + name + "\" returned successfully.");
	                }
	                return;
	            }
	        }
	        System.out.println("Video not found.");
	    }
	    public void receiveRating(String name, int rating) {
	        for (int i = 0; i < count; i++) {
	            if (store[i].getName().equalsIgnoreCase(name)) {
	                store[i].receiveRating(rating);
	                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
	                return;
	            }
	        }
	        System.out.println("Video not found.");
	    }
	    public void listInventory() {
	        System.out.println("--------------------------------------------------------------");
	        System.out.printf("%-20s %-20s %-10s\n",
	                "Video Name",
	                "Checkout Status",
	                "Rating");
	        System.out.println("--------------------------------------------------------------");
	        for (int i = 0; i < count; i++) {
	            String rate;
	            if (store[i].getRating() == 0) {
	                rate = "Not Rated";
	            } else {
	                rate = String.valueOf(store[i].getRating());
	            }
	            System.out.printf("%-20s %-20b %-10s\n",
	                    store[i].getName(),
	                    store[i].getCheckout(),
	                    rate);
	        }
	        System.out.println("--------------------------------------------------------------");
	    }

	}
