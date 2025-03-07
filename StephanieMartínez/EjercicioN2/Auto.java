package StephanieMartínez.EjercicioN2;

public class Auto {
 
        private int año;
        private String modelo, marca, propietario, color;
    
        public int getAño() {
            return año;
        }
        public void setAño(int año) {
            this.año = año;
        }
        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        public String getMarca() {
            return marca;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public String getPropietario() {
            return propietario;
        }
        public void setPropietario(String propietario) {
            this.propietario = propietario;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
    
        @Override
        public String toString() {
            return "Vehículo { " +
                    "Año: " + año +
                    ", Modelo: '" + modelo + '\'' +
                    ", Marca: '" + marca + '\'' +
                    ", Propietario: '" + propietario + '\'' +
                    ", Color: '" + color + '\'' +
                    " }";
        }
    }

