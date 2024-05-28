package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculadoraSaludProxy implements HealthHospital, HealthStats {
    private CalculadoraSaludAdapter calculadoraSaludAdapter;
    private List<Float> alturas;
    private List<Float> pesos;
    private List<Integer> edades;
    private List<Float> bmrs;
    private int numHombres;
    private int numMujeres;

    public CalculadoraSaludProxy(CalculadoraSaludAdapter calculadoraSaludAdapter) {
        this.calculadoraSaludAdapter = calculadoraSaludAdapter;
        this.alturas = new ArrayList<>();
        this.pesos = new ArrayList<>();
        this.edades = new ArrayList<>();
        this.bmrs = new ArrayList<>();
        this.numHombres = 0;
        this.numMujeres = 0;
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) {
        // Registra los datos del paciente
        alturas.add(altura);
        pesos.add((float) peso);
        edades.add(edad);
        float bmr = (float) calculadoraSaludAdapter.bmr(genero, edad, altura, peso);
        bmrs.add(bmr);
        // Actualiza el conteo de género
        if (genero == 'H') {
            numHombres++;
        } else if (genero == 'M') {
            numMujeres++;
        }
        return bmr;
    }

    @Override
    public int pesoIdeal(char genero, float altura) {
        // Registra los datos del paciente
        alturas.add(altura);
        // No es necesario registrar el peso para el método pesoIdeal
        edades.add(0); // Añadir 0 para la edad, ya que no es relevante para pesoIdeal
        float pesoIdeal = calculadoraSaludAdapter.pesoIdeal(genero, altura);
        pesos.add(pesoIdeal);
        // Actualiza el conteo de género
        if (genero == 'H') {
            numHombres++;
        } else if (genero == 'M') {
            numMujeres++;
        }
        return Math.round(pesoIdeal);
    }

    // Implementa métodos de HealthStats
    // ...

    @Override
    public float alturaMedia() {
        return calcularPromedio(alturas);
    }

    @Override
    public float pesoMedio() {
        return calcularPromedio(pesos);
    }

    @Override
    public float edadMedia() {
        return calcularPromedio(edades.stream().map(Integer::floatValue).collect(Collectors.toList()));
    }

    @Override
    public float bmrMedio() {
        return calcularPromedio(bmrs);
    }

    @Override
    public int numSexoH() {
        return numHombres;
    }

    @Override
    public int numSexoM() {
        return numMujeres;
    }

    @Override
    public int numTotalPacientes() {
        return alturas.size(); // Se asume que todas las listas tienen la misma longitud
    }

    // Método auxiliar para calcular el promedio de una lista de floats
    private float calcularPromedio(List<Float> lista) {
        if (lista.isEmpty()) {
            return 0;
        }
        float suma = 0;
        for (float valor : lista) {
            suma += valor;
        }
        return suma / lista.size();
    }
}

