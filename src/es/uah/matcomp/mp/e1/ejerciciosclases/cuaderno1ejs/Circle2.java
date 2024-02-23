package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno1ejs;

public class Circle2 {
        // La clase es privada,no es accesible desde fuera

        /**
         * Constructor predeterminado que inicializa el radio a 1.0
         */
        private double radius = 1.0;


        public Circle2() {
        }

        public Circle2(double radius) {
            this.radius = radius;
        }

        /**
         * Devuelve el radio
         */
        public double getRadius() {
            return radius;
        }
        /**
         * Establece el radio
         */
        public void setRadius(double radius) {
            this.radius = radius;
        }

        /**
         * Devuelve el área
         */
        public double getArea() {
            return radius * radius * Math.PI;
        }

        /**
         * Devuelve la circunferencia del circulo usando la fórmula 2πr
         */
        public double getCircumference(){

            return 2 * Math.PI * radius;
        }

        /**
         * Devuelve una representación de cadena del objeto
         */
        public String toString() {
            return "Circle [radius=" + radius + "]";
        }
    }
