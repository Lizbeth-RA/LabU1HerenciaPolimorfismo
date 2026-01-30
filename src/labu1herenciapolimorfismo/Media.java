package labu1herenciapolimorfismo;

/**
 * 29/01/2026
 * @author Lizbeth Rodríguez Avelar
 */
public class Media 
{
    // TODO 1: Crea los campos titulo y autor de tipo String
    // y privados
    private String titulo;
    private String autor;
    
    // TODO 3: Crea el constructor para inicializar los campos
    // utiliza los métodos setter para establecer sus valores.
    // Recuerda poner este constructor después de la declaración de los campos
    public Media(String titulo, String autor) 
    {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // TODO 2: Crea los getter y setter para los campos
    /**
     * @return the titulo
     */
    public String getTitulo() 
    {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() 
    {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) 
    {
        this.autor = autor;
    }
    
    // TODO 4: Crea un método llamado play(), público de tipo void
    // este método tiene la siguiente instrucción.
    // System.out.println("Playing: " + title + " by " + creator);  
    public void play()
    {
        System.out.println("Playing: " + titulo + " by " + autor);  
    }
    
}
