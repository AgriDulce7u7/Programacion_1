package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.Model.Libro;


public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitle("Cien años de soledad");
        libro1.setGender("Realismo mágico");
        libro1.setAuthor("Gabriel García Márquez");
        libro1.setPublicationYear(1967);
        libro1.setEditorial("Editorial sudamericana");
        libro1.setPageNumber(471);

        Libro libro2 = new Libro();
        libro2.setTitle("Crónica de una muerte anunciada");
        libro2.setGender("Novela");
        libro2.setAuthor("Gabriel García Márquez");
        libro2.setPublicationYear(1981);
        libro2.setEditorial("La oveja negra");
        libro2.setPageNumber(156);

        Libro libro3 = new Libro();
        libro3.setTitle("El diablo en la botella");
        libro3.setGender("Ficción");
        libro3.setAuthor("Robert Louis Stevenson");
        libro3.setPublicationYear(1891);
        libro3.setEditorial("New York Herald");
        libro3.setPageNumber(64);

        Libro libro4 = new Libro();
        libro4.setTitle("Cálculo integral");
        libro4.setGender("Matemático");
        libro4.setAuthor("William Anthony Granville");
        libro4.setPublicationYear(1904);
        libro4.setEditorial("Limusa");
        libro4.setPageNumber(704);

        Libro libro5 = new Libro();
        libro5.setTitle("Frankenstein");
        libro5.setGender("Terror");
        libro5.setAuthor("Mary Shelley");
        libro5.setPublicationYear(1818);
        libro5.setEditorial("Lackington");
        libro5.setPageNumber(184);

        contarConsonantesYVocales(libro1, libro2,libro3,libro4, libro5);
        cambiarTitulo(libro1, libro2,libro3,libro4, libro5);
        tipoGenero(libro1, libro2,libro3,libro4, libro5);
        cantidadPaginas(libro1, libro2,libro3,libro4, libro5);
    }

    public static void contarConsonantesYVocales(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5) {
        int contadorVocal = 0;
        int contadorConsonante = 0;

        char caracter01 = libro1.getTitle().charAt(0);
        char caracter02 = libro2.getTitle().charAt(0);
        char caracter03 = libro3.getTitle().charAt(0);
        char caracter04 = libro4.getTitle().charAt(0);
        char caracter05 = libro5.getTitle().charAt(0);
        if(caracter01 == 'a' || caracter01 == 'e' || caracter01 == 'i' || caracter01 == 'o' || caracter01 == 'u' || caracter01 == 'A' || caracter01 == 'E' || caracter01 == 'I' || caracter01 == 'O' || caracter01 == 'U'){
            contadorVocal += 1;
        }else{
            contadorConsonante += 1;
        }
        if(caracter02 == 'a' || caracter02 == 'e' || caracter02 == 'i' || caracter02 == 'o' || caracter02 == 'u' || caracter02 == 'A' || caracter02 == 'E' || caracter02 == 'I' || caracter02 == 'O' || caracter02 == 'U'){
            contadorVocal += 1;
        }else{
            contadorConsonante += 1;
        }
        if(caracter03 == 'a' || caracter03 == 'e' || caracter03 == 'i' || caracter03 == 'o' || caracter03 == 'u' || caracter03 == 'A' || caracter03 == 'E' || caracter03 == 'I' || caracter03 == 'O' || caracter03 == 'U'){
            contadorVocal += 1;
        }else{
            contadorConsonante += 1;
        }
        if(caracter04 == 'a' || caracter04 == 'e' || caracter04 == 'i' || caracter04 == 'o' || caracter04 == 'u' || caracter04 == 'A' || caracter04 == 'E' || caracter04 == 'I' || caracter04 == 'O' || caracter04 == 'U'){
            contadorVocal += 1;
        }else{
            contadorConsonante += 1;
        }
        if(caracter05 == 'a' || caracter05 == 'e' || caracter05 == 'i' || caracter05 == 'o' || caracter05 == 'u' || caracter05 == 'A' || caracter05 == 'E' || caracter05 == 'I' || caracter05 == 'O' || caracter05 == 'U'){
            contadorVocal += 1;
        }else{
            contadorConsonante += 1;
        }
        System.out.println("La totalidad de libros que inician con vocal son: "+contadorVocal);
        System.out.println("La totalidad de libros que inican con consonante son: "+contadorConsonante);
    }
    public static void cambiarTitulo(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5){
        String tituloActual = "Cálculo integral";
        String tituloNuevo = "Cálculo integral  y diferencial";

        if (libro1.getTitle().equalsIgnoreCase(tituloActual)){
            libro1.setTitle(tituloNuevo);
            System.out.println("El libro llamado "+tituloActual+" ahora se encuentra con el nuevo título: " +libro1.getTitle());
        }
        if (libro2.getTitle().equalsIgnoreCase(tituloActual)) {
            libro2.setTitle(tituloNuevo);
            System.out.println("El libro llamado "+tituloActual+" ahora se encuentra con el nuevo título: " + libro2.getTitle());
        }
        if (libro3.getTitle().equalsIgnoreCase(tituloActual)) {
            libro3.setTitle(tituloNuevo);
            System.out.println("El libro llamado "+tituloActual+" ahora se encuentra con el nuevo título: " + libro3.getTitle());
        }
        if (libro4.getTitle().equalsIgnoreCase(tituloActual)) {
            libro4.setTitle(tituloNuevo);
            System.out.println("El libro llamado "+tituloActual+" ahora se encuentra con el nuevo título: " + libro4.getTitle());
        }
        if (libro5.getTitle().equalsIgnoreCase(tituloActual)) {
            libro5.setTitle(tituloNuevo);
            System.out.println("El libro llamado "+tituloActual+" ahora se encuentra con el nuevo título: " + libro5.getTitle());
        }
    }
    public static void tipoGenero(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5) {

        int contadorTerror = 0;

        if (libro1.getGender().equalsIgnoreCase("Terror"))
            contadorTerror += 1;

        if (libro2.getGender().equalsIgnoreCase("Terror"))
            contadorTerror += 1;

        if (libro3.getGender().equalsIgnoreCase("Terror"))
            contadorTerror += 1;

        if (libro4.getGender().equalsIgnoreCase("Terror"))
            contadorTerror += 1;

        if (libro5.getGender().equalsIgnoreCase("Terror"))
            contadorTerror += 1;
        System.out.println("La cantidad de libros de terros son: " + contadorTerror);
    }

    public static void cantidadPaginas(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5){
        int superiorNumeroPaginas = 0;
        if (libro1.getPageNumber()>=150){
            superiorNumeroPaginas += 1;
        }
        if (libro2.getPageNumber()>=150){
            superiorNumeroPaginas += 1;
        }
        if (libro3.getPageNumber()>=150){
            superiorNumeroPaginas += 1;
        }
        if (libro4.getPageNumber()>=150){
            superiorNumeroPaginas += 1;
        }
        if (libro5.getPageNumber()>=150){
            superiorNumeroPaginas += 1;
        }
        System.out.println("Hay " +superiorNumeroPaginas+ " libros con más de 150 páginas.");
    }

    }
