package JasonRojas.EjercicioN2;

public class Libro {
    String titulo,autor,editorial,edicion;
    int paginas;
    public String getNombre() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String getEdicion() {
        return edicion;
    }
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    @Override
    public String toString() {
        return "Libro [nombre=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", edicion=" + edicion
                + ", paginas=" + paginas + "]";
    }
    

}
