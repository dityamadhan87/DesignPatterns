package BuilderPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // var builder = new Trip.Builder(LocalDate.of(2023, 10, 1), 
        //                                LocalDate.of(2023, 10, 15), 
        //                                14, 
        //                                2);
        // var trip = builder
        //         .numberKids(3)
        //         .rating(5)
        //         .minimumStars(6)
        //         .build();
        // System.out.println(trip.start);
        var trip = Trip.builder(LocalDate.of(2023, 10, 1), 
                                LocalDate.of(2023, 10, 15), 
                                14, 
                                2)
                       .numberKids(3)
                       .rating(5)
                       .minimumStars(6)
                       .build();
        System.out.println(trip.getClass());
    }
}
