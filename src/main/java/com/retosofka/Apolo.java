
package com.retosofka;

public class Apolo implements NaveEspacial{

    // 1. Realizo la implementacion de los atributos abstractos de la nave espacial Apolo 11
    @Override
    public String obtenerNombre() {

        return ("Apolo 11.");
    }

    @Override
    public String obtenerClasificacion(){

        return ("Clasificacion nave espacial: Tripulada.");
    }
    @Override
    public String obtenerPeso() {
        return ("Peso nave espacial: 480.000 kg.");

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

    private String despegueSaturnoV;
    private String viajeLuna;
    private String alunizaje;

    public Apolo(String despegueSaturnoV, String viajeLuna, String alunizaje) {
        this.despegueSaturnoV = despegueSaturnoV;
        this.viajeLuna = viajeLuna;
        this.alunizaje = alunizaje;
    }

    public String getDespegueSaturnoV() {
        return despegueSaturnoV;
    }

    public void setDespegueSaturnoV(String despegueSaturnoV) {
        this.despegueSaturnoV = despegueSaturnoV;
    }

    public String getViajeLuna() {
        return viajeLuna;
    }

    public void setViajeLuna(String viajeLuna) {
        this.viajeLuna = viajeLuna;
    }

    public String getAlunizaje() {
        return alunizaje;
    }

    public void setAlunizaje(String alunizaje) {
        this.alunizaje = alunizaje;
    }

}