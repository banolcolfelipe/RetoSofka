
package com.retosofka;

public class Gemini implements NaveEspacial{

    // 1. Realizo la implementacion de los atributos abstractos de la nave espacial Skylab
    @Override
    public String obtenerNombre() {

        return ("Gemini.");
    }

    @Override
    public String obtenerClasificacion(){

        return ("Clasificacion nave espacial: Tripulada.");
    }
    @Override
    public String obtenerPeso() {
        return ("Peso nave espacial: 3.628 kg.");

    }
    @Override
    public String obtenerTipoCombustible() {
        return ("Combustible nave espacial: Queroseno + H(liq).");

    }
    @Override
    public String obtenerFabricante() {
        return ("Fabricante: NASA.");

    }

    // 2. Declarare los metodos que diferencian una nave de otra, con su respectivo constructor, getters y setters.

    private String despegueTitanII;
    private String viajeEspacial;
    private String acoplamiento;

    public Gemini(String despegueTitanII, String viajeEspacial, String acoplamiento) {
        this.despegueTitanII = despegueTitanII;
        this.viajeEspacial = viajeEspacial;
        this.acoplamiento = acoplamiento;
    }

    public String getDespegueTitanII() {
        return despegueTitanII;
    }

    public void setDespegueTitanII(String despegueTitanII) {
        this.despegueTitanII = despegueTitanII;
    }

    public String getViajeEspacial() {
        return viajeEspacial;
    }

    public void setViajeEspacial(String viajeEspacial) {
        this.viajeEspacial = viajeEspacial;
    }

    public String getAcoplamiento() {
        return acoplamiento;
    }

    public void setAcoplamiento(String acoplamiento) {
        this.acoplamiento = acoplamiento;
    }
}
