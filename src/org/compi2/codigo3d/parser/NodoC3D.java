package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String verdadera;
    private String falsa;

    public NodoC3D(String cad, String verdadera, String falsa){
        this.cad = cad;
        this.verdadera= verdadera;
        this.falsa = falsa;
    }
    public NodoC3D(String cad) {
        this.cad = cad;
    }
    public String getVerdadera(){
        return verdadera;
    }
    public String getFalsa(){
        return falsa;
    }
    public String getCad(){
        return cad;
    }
        
}
