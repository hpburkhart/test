public class Leuchte
{

    private String farbe;

    public Leuchte()
    {
        this.farbe="__";
    }
    
    public Leuchte(String f)
    {
        this.farbe= f;
    }

    public void setFarbe(String f)
    {
        farbe = f;
    }
    
    public String getFarbe()
    {
        return farbe;
    }
}
