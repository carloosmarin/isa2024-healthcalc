package healthcalc;

public class HealthCalcImpl implements HealthCalc {
    @Override

    public float idealBodyWeight(int altura, char gen) throws Exception{
        Character genero = Character.toUpperCase(gen);
        if (genero != "M" && genero != "W"){
            throw new IllegalArgumentException("Entrada de genero no admitida, solo son admitidas m para hombre y w para mujer ");

        } else if (altura > 251) {
            throw new IllegalArgumentException("La entrada de la altura es superior a la máxima permitida");

        } else {
            if (genero == "M"){
                if (altura >= 110) {
                    return altura -100 -(altura-150)/4;

                }

            }else {
                if (altura >= 100){
                    return altura - 100 -(altura-150)/2.5;

                }
            }throw new IllegalArgumentException("La entrada de la altura es menor a la minima permitida");

        }
    }

    @Override

    public float basalMetabolicRate(float peso, int altura, char genero, int edad) throws Exception {
        if(peso < 25 || peso > 500){
            throw new IllegalArgumentException("La entrada para el peso esta fuera del umbral permitido, debe estar entre 25 y 500 kg");

        } else if(altura < 75 || altura > 251){
            throw new IllegalArgumentException("La entrada de la altura está fuera del umbral permitido, debe estar entre 75cm y 251cm");
        } else {
            Character sexo = Character.toUpperCase(genero);
            if(sexo != "M" && sexo != "W"){
                throw new IllegalArgumentException("La entrada para el genero es incorrecta, debe ser M para hombres o W para mujeres");
            }else if(sexo = "M"){
                float BMR = 13.7*peso + 5 * altura - 6.75*edad;
                if (BMR >0){
                    return BMR;
                }
                else{
                    throw new IllegalArgumentException("Los valores introducidos no son correctos");
                } else {
                    float BMR = 9.6 * peso + 1.8 * altura - 4.7*edad;
                    if(BMR > 0){
                        return BMR;
                    }
                    else{
                        throw new IllegalArgumentException("Los valores introducidos no son correctos");
                    }
                }
            }

        }
        }
    }

}
