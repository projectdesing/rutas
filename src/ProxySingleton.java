
import java.util.HashMap;

public class ProxySingleton {
private static ProxySingleton unicaInstancia = null;
 
private  HashMap<String,Usuario> usuarios = new HashMap();
 
public  ProxySingleton(){
 
}
 
public static ProxySingleton reemplazarConstructora() {
if (unicaInstancia == null)
unicaInstancia = new ProxySingleton();
return unicaInstancia;
}
 
public void adicionar (String si,Usuario tambien) {
usuarios.put(si, tambien);
}
 
public Usuario buscar(String key){
return usuarios.get(key);
}
 
public boolean actualizar (String key, Usuario u){
Usuario resultado=null;
 
resultado = usuarios.get(key);
if (resultado==null)
return false;
else {
usuarios.put(key, u);
return true;
}
}
 
public void eliminar (String key) {
usuarios.remove(key);
}
 
 
 
}