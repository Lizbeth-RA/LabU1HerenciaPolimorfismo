package labu1herenciapolimorfismo;

/**
 * 29/01/2026
 * @author Lizbeth Rodríguez Avelar
 */
public class LabU1HerenciaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 24: Declara tres objetos, uno de tipo Movie (movie), 
        // otro Book (book) y otro de tipo Music (music)
        // Recuerda como se especifica el tipo de referencia para que implementes
        // el polimorfismo
        // Ejemplo: Shape bangle = new Circle();
        // para el objeto movie pasa los siguientes valores: "Titanic", "James Cameron", 180
        // para el objeto book los valores: "Java How To Program", "Deitel", 500
        // para el objeto music los valores: "Imagine" "John Lennon", "Rock"
        
        Media movie = new Movie("Titanic", "James Cameron", 180);
        
        Media book = new Book("Java How To Program", "Deitel", 500);
        
        Media music = new Music("Imagine", "John Lennon", "Rock");
        
        //Añadiendo un objeto de mi subclase Game
        Media game = new Game("The Legend of Zelda", "Nintendo", "Switch");

        
        // TODO 25: Crea un objeto de tipo MediaLibrary llamado mediaLibrary
        MediaLibrary mediaLibrary = new MediaLibrary();
        
        // TODO 26: Ahora llama al método addLibrary del objeto mediaLibrary
        // y asignale cada uno de tus medios
        // ejemplo: mediaLibrary.addItem(movie);
        // agrega todos los otros dos objetos
        mediaLibrary.addLibrary(movie);
        mediaLibrary.addLibrary(book);
        mediaLibrary.addLibrary(music);
        
        //Llamada al método addLibrary del objeto mediaLibrary 
        //y asignandolo al nuevo medio 
        mediaLibrary.addLibrary(game);
        
        
        // TODO 27: Ahora llama al método playAllItems del objeto mediaLibrary
        // para poner en play todos tus medios o items
        mediaLibrary.playAllItems();

        
        // Ejecuta tu programa, la salida debe ser la siguiente:
        // Watching Titanic directed by James Cameron, Duration: 180 minutes
        // Reading Java How To Program by Deitel with 500 pages
        // Listening to Imagine by Jhon Lennon in the Rock genre
        // Si lo lograste ¡¡¡Felicidades!!!
        
    }
    
}
