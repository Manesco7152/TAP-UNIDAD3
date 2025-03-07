package StephanieMartínez.EjercicioN2;

public class Libro {
    String nombre,autororiginal,libreriadeventa,formatos;
    int paginas;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAutororiginal() {
        return autororiginal;
    }
    public void setAutororiginal(String autororiginal) {
        this.autororiginal = autororiginal;
    }
    public String getLibreriadeventa() {
        return libreriadeventa;
    }
    public void setLibreriadeventa(String libreriadeventa) {
        this.libreriadeventa = libreriadeventa;
    }
    public String getFormatos() {
        return formatos;
    }
    public void setFormatos(String formatos) {
        this.formatos = formatos;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    @Override
    public String toString() {
        return "Libro [nombre=" + nombre + ", autororiginal=" + autororiginal + ", libreriadeventa=" + libreriadeventa
                + ", formatos=" + formatos + ", paginas=" + paginas + "]";
    }
    
}
