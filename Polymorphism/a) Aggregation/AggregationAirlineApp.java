// Pilot class representing a pilot
package com.Aggregation.practies;

public class Pilot {

    // Member variable to store the pilot's name
    String name;

    // Constructor to initialize the pilot's name
    Pilot(String name){
        this.name = name;
    }

    // Method to simulate flying
    void fly() {
        System.out.println(name + " is flying.");
    }
}

// Airline class representing an airline with a Pilot as part of its operation
package com.Aggregation.practies;

public class Airline {

    // Member variables for airline brand and a Pilot object
    String brand;
    Pilot p;

    // Constructor to initialize airline brand and the associated Pilot
    public Airline(String brand, Pilot p) {
        super();
        this.brand = brand;
        this.p = p;
    }

    // Method to simulate the airline's operation
    void operation() {
        System.out.println(brand + " Airline is performing operations.");
        p.fly();
    }
}

// Main application class demonstrating aggregation between Pilot and Airline
package com.Aggregation.practies;

public class AggregationAirlineApp {

    public static void main(String[] args) {
        // Creating a Pilot object
        Pilot p = new Pilot("Raju");

        // Calling the fly method on the Pilot object
        p.fly();

        // Creating an Airline object with the associated Pilot
        Airline ar = new Airline("Indian", p);

        // Calling the operation method on the Airline object
        ar.operation();
    }
}


// Explanation:

// 1. **Pilot Class:**
//    - Represents a pilot with a name.
//    - The `fly` method simulates the action of flying.

// 2. **Airline Class:**
//    - Represents an airline with a brand and a Pilot as part of its operation.
//    - The `operation` method simulates the airline's operation and calls the `fly` method of the associated Pilot.

// 3. **AggregationAirlineApp Class:**
//    - Main application class demonstrating aggregation.
//    - Creates a Pilot object named "Raju" and calls the `fly` method.
//    - Creates an Airline object named "Indian" with the associated Pilot "Raju" and calls the `operation` method.

// In this example, the `Airline` class has a member variable of type `Pilot`, demonstrating aggregation, where an Airline "has a" Pilot as part of its structure. The main application (`AggregationAirlineApp`) showcases the interaction between these classes.
