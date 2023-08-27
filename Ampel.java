public class Ampel
{

    private int phase;
    private Leuchte rtLicht;
    private Leuchte gbLicht;
    private Leuchte grLicht;

    public Ampel()
    {
        rtLicht = new Leuchte();
        gbLicht = new Leuchte();
        grLicht = new Leuchte();
    }

    public void setRot()
    {
        rtLicht.setFarbe("rt");
        gbLicht.setFarbe("__");
        grLicht.setFarbe("__");
    }
    
    public void setGruen()
    {
        rtLicht.setFarbe("__");
        gbLicht.setFarbe("__");
        grLicht.setFarbe("gr");
    }
    
    public void setGelb()
    {
        rtLicht.setFarbe("__");
        gbLicht.setFarbe("gb");
        grLicht.setFarbe("__");
    }
    
    public void setRotgelb()
    {
        rtLicht.setFarbe("rt");
        gbLicht.setFarbe("gb");
        grLicht.setFarbe("__");
    }
    
    public void anzeige()
    {
        System.out.print(rtLicht.getFarbe() + gbLicht.getFarbe()+ grLicht.getFarbe());
        System.out.println(" ");
              
        
    }
    
    public void umschalten()
    {
        switch (phase){
            case 0:
                phase =1;
                setRotgelb();
                anzeige();
                break;
            case 1:
                phase =2;
                setGruen();
                anzeige();
                break;
            case 2:
                phase =3;
                setGelb();
                anzeige();
                break;    
            case 3:
                phase =0;
                setRot();
                anzeige();
                break;
        }
    }
}
