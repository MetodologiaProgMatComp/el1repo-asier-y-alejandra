package es.uah.matcomp.mp.e1.ejerciciosclases;

    public class Circle1 { // Save as "Circle.java"
        // private instance variable, not accessible from outside this class///
        private double radius;
        private String color;

        // Constructors (overloaded)

        /**
         * Constructs a Circle instance with default value for radius and color
         */
        public Circle1() { // 1st (default) constructor
            radius = 1.0;
            color = "red";
        }

        /**
         * Constructs a Circle instance with the given radius and default color
         */
        public Circle1(double r) { // 2nd constructor
            radius = r;
            color = "red";
        }

        /**
         * Returns the radius
         */
        public double getRadius() {
            return radius;
        }

        /**
         * Returns the area of this Circle instance
         */
        public double getArea() {
            return radius * radius * Math.PI;
        }
    }

