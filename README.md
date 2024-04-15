# isa2024-healtcalc
Health calculator

# Práctica 1

#Test para el metodo idealWeight():

1.Altura minima
Test para comprobar que se cumple con una altura mínima. Tomaremos la altura media de un niño de 1 año en España (75 cm), ya que este tipo de estudios en personas menores a esa edad no tendria mucho sentido.

2.Altura maxima
Test para comprobar que se cumple con una altura máxima. Tomaremos la altura de la persona más alta del mundo actualmente (2'51 m), para que nuestro test sea alcanzable hasta el máximo número de personas.

3.Altura negativa
Test para comprobar el caso de que se introduzca una altura negativa, ya que evidentemente es imposible este suceso.

4.Género no válido
Test que se enfoca en el caso de que se introduzca un género distinto a "m" o "w".

5.Input de género
Test para comprobar el uso de mayúsculas y minúsculas para el input del género.

6.Media de Hombres
Test que comprueba el funcionamiento en caso del uso del hombre promedio a través de la fórmula.

7.Media de Mujeres
Test que comprueba el funcionamiento en caso del uso de la mujer promedio a través de la fórmula.


Test para el metodo basalMetabolicRate():

1.Input de peso incorrecto
Test para el caso de una entrada de peso fuera del umbral establecido (mínimo 25 kg, máximo 500 kg).Se lanzara una excepcion que pida al usuario revisar los datos introducidos.

2.Input de altura incorrecto
Test para el caso de una entrada de altura fuera del umbral (minimo 75 cm,maximo 251 cm).Se lanzara una excepcion que pida al usuario revisar los datos introducidos.


3.Input de género incorrecto
Test para el caso de de obtener un valor distinro a "m" o "w". Se lanzara una excepcion que pida al usuario revisar los datos introducidos.

4.Input de género
Test para comprobar el uso de mayúsculas y minúsculas para el input del género.

# Práctica 2
En esta práctica realizamos un diagrama de Casos de Uso con las distintas funcionalidades de nuestra calculadora, además de añadir los casos de uso del cálculo del indice de masa corporal y de la presión arterial media.

![Diagrama de Casos de Uso de nuestra Calculadora]https://github.com/carloosmarin/isa2024-healthcalc/blob/main/doc1/Diagrama%20Casos%20de%20uso%20extendido.png?raw=true

# Especificación del Caso de Uso Peso Ideal (IW)

Actor Principal: Usuario

Especificación del Caso de Uso Peso Ideal(IW)


Ámbito: Aplicación de calculadora de salud

Nivel: Funcional

Stakeholders e Intereses:

Usuario: Interés en obtener una estimación precisa de su peso ideal para mantener una salud óptima.
Desarrollador de la aplicación: Interés en proporcionar una funcionalidad precisa y fácil de usar que satisfaga las necesidades del usuario.
Precondiciones:

El usuario debe tener acceso a la aplicación de calculadora de salud.
El usuario debe tener información válida sobre su peso, estatura, edad y género.
Garantías Mínimas:

La aplicación debe calcular el peso ideal del usuario utilizando una fórmula precisa y bien establecida.
La aplicación debe manejar correctamente los datos ingresados por el usuario y proporcionar resultados significativos.
Garantía de Éxito:

El usuario recibirá una estimación del peso ideal que se ajuste a su estatura, edad y género.
Escenario Principal:

El usuario accede a la aplicación de calculadora de salud.
El usuario selecciona la opción de "Cálculo del Peso Ideal (IW)".
La aplicación solicita al usuario ingresar su peso actual, estatura, edad y género.
El usuario introduce los datos solicitados.
La aplicación utiliza los datos ingresados para calcular el peso ideal del usuario según la fórmula establecida.
La aplicación muestra al usuario el peso ideal calculado.
Escenarios Alternativos:

Si los datos ingresados por el usuario son inválidos (por ejemplo, estatura o peso negativos), la aplicación mostrará un mensaje de error y solicitará al usuario que ingrese datos válidos.
Si el usuario no ingresa uno o más de los datos requeridos (peso, estatura, edad o género), la aplicación mostrará un mensaje de advertencia indicando que todos los campos son obligatorios.
Extensiones:

Después de calcular el peso ideal, la aplicación puede ofrecer al usuario la opción de establecer metas de peso y proporcionar recomendaciones para lograr esas metas, como consejos de dieta y ejercicio. Esto extendería el caso de uso principal para incluir funcionalidades adicionales de seguimiento de objetivos y asesoramiento de salud.
# Práctica 3

### Historia de Usuario 1: Cálculo del Peso Ideal de una Persona

**Título:** Calcular Peso Ideal

**Descripción:**
Como usuario de la calculadora, quiero poder calcular el peso ideal de una persona basado en su altura y género, para tener una referencia de su peso objetivo.

**Criterios de Aceptación:**
1. Dado que soy un usuario de la calculadora, cuando ingreso la altura y el género de la persona, la calculadora me muestra su peso ideal.
2. Si ingreso una altura válida en metros y un género válido (masculino o femenino), la calculadora calcula y muestra el peso ideal correspondiente.
3. La calculadora debe manejar diferentes unidades de altura, como metros, centímetros o pies, y realizar la conversión internamente si es necesario.
4. En caso de ingresar valores no válidos (por ejemplo, altura negativa o caracteres no numéricos), la calculadora muestra un mensaje de error indicando que los datos ingresados no son válidos y solicita al usuario que ingrese valores correctos.

### Historia de Usuario 2: Cálculo de la Tasa Metabólica Basal de una Persona

**Título:** Calcular Tasa Metabólica Basal (TMB)

**Descripción:**
Como usuario de la calculadora, deseo poder calcular la tasa metabólica basal (TMB) de una persona basado en su edad, peso, altura y nivel de actividad física, para tener una estimación de su requerimiento calórico diario.

**Criterios de Aceptación:**
1. Cuando ingreso la edad, peso, altura y nivel de actividad física de la persona, la calculadora me muestra su tasa metabólica basal (TMB).
2. La calculadora debe permitir ingresar la edad en años, el peso en kilogramos, la altura en metros y el nivel de actividad física (sedentario, ligero, moderado, activo o muy activo) como opciones predefinidas.
3. Debe calcular la TMB según la fórmula de Harris-Benedict o Mifflin-St Jeor, teniendo en cuenta el género de la persona si es relevante para la fórmula seleccionada.
4. Si el usuario no selecciona un nivel de actividad física, la calculadora debe asumir un nivel predeterminado.
5. La calculadora debe manejar diferentes unidades de medida para la altura y el peso, realizando conversiones internas si es necesario.
6. Si se ingresan valores no válidos (por ejemplo, edad negativa, peso no numérico, nivel de actividad no válido), la calculadora debe mostrar un mensaje de error indicando que los datos ingresados no son válidos y solicitar al usuario que ingrese valores correctos.

Estos son ejemplos de historias de usuario y sus criterios de aceptación para las funcionalidades mencionadas. Puedes ajustar los criterios de aceptación según las necesidades específicas de tu proyecto.
