package labu1herenciapolimorfismo;

/**
 * 29/01/2026
 * @author Lizbeth Rodríguez Avelar
 */
// TODO 5: Extiende la clase Book a Media
public class Book extends Media
{
    // TODO 6: Crea el atributo pageCount de tipo entero y privado
    private int pageCount;
    
    // TODO 8: Define el constructor y pasa los parámetros a la superclase
    // utilizando super, los párametros son title, creator y pageCount
    // Recuerda poner este constructor después de la declaración de los campos
    public Book(String titulo, String autor, int pageCount) 
    {
        super(titulo, autor);
        setPageCount(pageCount);
    }
    
    // TODO 7: Define los getter y setter para el atributo pageCount
    /**
     * @return the pageCount
     */
    public int getPageCount() 
    {
        return pageCount;
    }

    /**
     * @param pageCount the pageCount to set
     */
    public void setPageCount(int pageCount) 
    {
        this.pageCount = pageCount;
    }
    
    // TODO 9: Sobreescribe el método play() de la superclase. El método tiene la misma firma
    // el método imprimirá lo siguiente:
    // System.out.println("Reading " + getTitle() + " by " + getCreator() + " with " + pageCount + " pages");
    // No olvides poner la anotación @Override
    @Override
    public void play()
    {
        System.out.println("Reading " + getTitulo() + " by " + getAutor() + " with " + pageCount + " pages");
    }
}

