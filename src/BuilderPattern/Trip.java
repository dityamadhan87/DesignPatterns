package BuilderPattern;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Trip {
    private final LocalDate startDate;
    private final LocalDate endDate;
    public final String start;
    public final String end;
    public final int duration;
    public final int numberTravellers;
    public final int numberKids;
    public final int minimumStars;
    public final int minimumRecommendations;
    public final int rating;
    public final int minimumNumberRatings;

    private Trip(Builder builder) {
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        var formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        start = formatter.format(startDate);
        end = formatter.format(endDate);
        this.duration = builder.duration;
        this.numberTravellers = builder.numberTravellers;
        this.numberKids = builder.numberKids;
        this.minimumStars = builder.minimumStars;
        this.minimumRecommendations = builder.minimumRecommendations;
        this.rating = builder.rating;
        this.minimumNumberRatings = builder.minimumNumberRatings;
    }

    public static Trip.Builder builder(LocalDate startDate, LocalDate endDate,
                                       int duration, int numberTravellers) {
        return new Trip.Builder(startDate, endDate, duration, numberTravellers);
    }

    public static class Builder {
        private LocalDate startDate;
        private LocalDate endDate;
        private int duration;
        private int numberTravellers;
        private int numberKids = 0;
        private int minimumStars = 0;
        private int minimumRecommendations = 0;
        private int rating = 0;
        private int minimumNumberRatings = 0;

        public Builder(LocalDate startDate, LocalDate endDate,
                   int duration, int numberTravellers) {
            this.startDate = startDate;
            this.endDate = endDate;
            this.duration = duration;
            this.numberTravellers = numberTravellers;
        }

        public Builder numberKids(int numberKids) {
            this.numberKids = numberKids;
            return this;
        }

        public Builder rating(int rating) {
            this.rating = rating;
            return this;
        }

        public Builder minimumStars(int minimumStars) {
            this.minimumStars = minimumStars;
            return this;
        }

        public Trip build() {
            return new Trip(this);
        }
    }
}