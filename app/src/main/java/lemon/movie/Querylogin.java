package lemon.movie;

/**
 * Created by lemon on 12/11/2017.
 */

public class Querylogin {

        private String name;
        private String state;
        private String country;
        private boolean capital;
        private long population;

        public Querylogin() {}

        public Querylogin(String name, String state, String country, boolean capital, long population) {
            // ...
        }

        public String getName() {
            return name;
        }

        public String getState() {
            return state;
        }

        public String getCountry() {
            return country;
        }

        public boolean isCapital() {
            return capital;
        }

        public long getPopulation() {
            return population;
        }

    }

