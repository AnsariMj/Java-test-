class Distance {
    private int feet;
    private int inches;

    // Default constructor
    public Distance() {
        feet = 0;
        inches = 0;
    }

    // Parameterized constructor
    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Method to add two distances
    public Distance addDistance(Distance other) {
        int totalFeet = this.feet + other.feet;
        int totalInches = this.inches + other.inches;

        if (totalInches >= 12) {
            totalFeet += totalInches / 12;
            totalInches %= 12;
        }

        return new Distance(totalFeet, totalInches);
    }

    // Method to subtract two distances
    public Distance subtractDistance(Distance other) {
        int totalFeet = this.feet - other.feet;
        int totalInches = this.inches - other.inches;

        if (totalInches < 0) {
            totalFeet--;
            totalInches += 12;
        }

        return new Distance(totalFeet, totalInches);
    }

    // Method to display the distance
    public void displayDistance() {
        System.out.println(feet + " feet " + inches + " inches");
    }
}

public class MyDistance {
    public static void main(String[] args) {
        Distance distance1 = new Distance(5, 8);
        Distance distance2 = new Distance(3, 10);

        Distance sum = distance1.addDistance(distance2);
        Distance difference = distance1.subtractDistance(distance2);

        System.out.println("Distance 1:");
        distance1.displayDistance();

        System.out.println("Distance 2:");
        distance2.displayDistance();

        System.out.println("Sum of Distances:");
        sum.displayDistance();

        System.out.println("Difference of Distances:");
        difference.displayDistance();
    }
}
