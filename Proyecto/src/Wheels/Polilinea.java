package Wheels;

public class Polilinea implements Componente {
    private float coordenadaxorigen;
    private float coordenadayorigen;
    private float coordenadaxdestino;
    private float coordenadaydestino;
    private String nombre;
    private float distancia;
    private float tiempo;

    public Polilinea(float coordenadaxorigen, float coordenadayorigen, float coordenadaxdestino, float coordenadaydestino, String nombre, float distancia, float tiempo) {
        setCoordenadaxdestino(coordenadaxdestino);
        setCoordenadaydestino(coordenadaydestino);
        setCoordenadaxorigen(coordenadaxorigen);
        setCoordenadayorigen(coordenadayorigen);
        setNombre(nombre);
        setDistancia(distancia);
        setTiempo(tiempo);
    }

    public float getCoordenadaxorigen() {
        return coordenadaxorigen;
    }

    public void setCoordenadaxorigen(float coordenadaxorigen) {
        this.coordenadaxorigen = coordenadaxorigen;
    }

    public float getCoordenadayorigen() {
        return coordenadayorigen;
    }

    public void setCoordenadayorigen(float coordenadayorigen) {
        this.coordenadayorigen = coordenadayorigen;
    }

    public float getCoordenadaxdestino() {
        return coordenadaxdestino;
    }

    public void setCoordenadaxdestino(float coordenadaxdestino) {
        this.coordenadaxdestino = coordenadaxdestino;
    }

    public float getCoordenadaydestino() {
        return coordenadaydestino;
    }

    public void setCoordenadaydestino(float coordenadaydestino) {
        this.coordenadaydestino = coordenadaydestino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }


   
    public void mostrar() {
        }
	@Override
	public String getValores() {
		return "El nombre de la calle es "+nombre+"\nSale desde ("+coordenadaxorigen+","+coordenadayorigen+")"
                + ""+" \nHacia ("+coordenadaxdestino+","+coordenadaydestino+")"+"\nDistancia :"+distancia+"\nTiempo estimado : "+tiempo;
	}
	@Override
	public void SetValores(String adicional) {
		// TODO Auto-generated method stub
		
	}
 
}