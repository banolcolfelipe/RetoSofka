
package com.retosofka;

public class Mariner implements NaveEspacial{

    // 1. Realizo la implementacion de los atributos abstractos de la nave espacial Mariner IV
    @Override
    public String obtenerNombre() {
        return("Mariner IV.");
    }

    @Override
    public String obtenerClasificacion(){
        return("Clasificacion nave espacial: No tripulada.");

    }
    @Override
    public String obtenerPeso() {
        return("Peso nave espacial: 260,88 kg.");

    }
    @Override
    public String obtenerTipoCombustible() {
        return ("Combustible nave espacial: Hidracina.");

    }
    @Override
    public String obtenerFabricante() {
        return("Fabricante: Jet Propulsion Laboratory.");

    }

    // 2. Declarare los metodos que diferencian una nave de otra, con su respectivo constructor, getters y setters.
    private String desplazamientoOrbita;
    private String capturarImagenes;
    private String capturarEnergia;

    public Mariner(String desplazamientoOrbita, String capturarImagenes, String capturarEnergia) {
        this.desplazamientoOrbita = desplazamientoOrbita;
        this.capturarImagenes = capturarImagenes;
        this.capturarEnergia = capturarEnergia;
    }

    public String getDesplazamientoOrbita() {
        return desplazamientoOrbita;
    }

    public void setDesplazamientoOrbita(String desplazamientoOrbita) {
        this.desplazamientoOrbita = desplazamientoOrbita;
    }

    public String getCapturarImagenes() {
        return capturarImagenes;
    }

    public void setCapturarImagenes(String capturarImagenes) {
        this.capturarImagenes = capturarImagenes;
    }

    public String getCapturarEnergia() {
        return capturarEnergia;
    }

    public void setCapturarEnergia(String capturarEnergia) {
        this.capturarEnergia = capturarEnergia;
    }

}
