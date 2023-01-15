
package com.retosofka;

public class Falcom implements NaveEspacial {

    // 1. Realizo la implementacion de los atributos abstractos de la nave espacial Falcom IX.
    @Override
    public String obtenerNombre() {
        return ("Falcom IX.");
    }

    @Override
    public String obtenerClasificacion(){
        return ("Clasificacion nave espacial: Vehículo lanzadera.");
    }
    @Override
    public String obtenerPeso() {
        return ("Peso nave espacial: 22.800 kg.");

    }
    @Override
    public String obtenerTipoCombustible() {
        return ("Combustible nave espacial: Queroseno + O(liq).");

    }
    @Override
    public String obtenerFabricante() {
        return ("Fabricante: Space X.");

    }

    // 2. Declarare los metodos que diferencian una nave de otra, con su respectivo constructor, getters y setters.

    private String despegue;
    private String desprendimientoDeCarga;
    private String regreso;
    private String aterrizaje;

    public Falcom(String despegue, String desprendimientoDeCarga, String regreso, String aterrizaje) {
        this.despegue = despegue;
        this.desprendimientoDeCarga = desprendimientoDeCarga;
        this.regreso = regreso;
        this.aterrizaje = aterrizaje;
    }

    public String getDespegue() {
        return despegue;
    }

    public void setDespegue(String despegue) {
        this.despegue = despegue;
    }

    public String getDesprendimientoDeCarga() {
        return desprendimientoDeCarga;
    }

    public void setDesprendimientoDeCarga(String desprendimientoDeCarga) {
        this.desprendimientoDeCarga = desprendimientoDeCarga;
    }

    public String getRegreso() {
        return regreso;
    }

    public void setRegreso(String regreso) {
        this.regreso = regreso;
    }

    public String getAterrizaje() {
        return aterrizaje;
    }

    public void setAterrizaje(String aterrizaje) {
        this.aterrizaje = aterrizaje;
    }
}