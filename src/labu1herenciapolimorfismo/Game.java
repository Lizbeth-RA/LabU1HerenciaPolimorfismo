package labu1herenciapolimorfismo;

/**
 * 29/01/2026
 * @author Lizbeth Rodríguez Avelar
 * Subclase añadida por mi, parte 5 del laboratorio
 */
public class Game extends Media
{
    //Atributo plataforma de tipo String y privado
    private String plataforma;
    
    //Constructor con los parámetros title, creator y plataforma
    //Asigna el valor del parámetro plataforma al campo correspondiente utilizando
    //su setter
    public Game(String titulo, String autor, String plataforma) 
    {
        super(titulo, autor);
        setPlataforma(plataforma); 
    }
    
    //Creación de los getter y setter para el campo anterior
    /**
     * @return the plataforma
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * @param plataforma the plataforma to set
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    //Sobreescribir el método play() de la superclase
    //El metodo muestra la siguiente salida
    @Override
    public void play()
    {
        System.out.println("Now playing the game " + getTitulo() + " by " + getAutor() + " on " + plataforma +" Platform.");
    }
    
}
