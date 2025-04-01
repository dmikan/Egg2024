## Modelado de tus primeros objetos

En este paso, iniciarás con la maquetación de objetos, definiendo sus atributos y asignándoles valores iniciales para darles vida.  

### 🎥 Material Audiovisual
Te invitamos a ver el siguiente video, el cual complementará tu teoría y sentará las bases para llevar a cabo tus próximas actividades.

---

<div align="center">
  <a href="https://www.youtube.com/watch?v=GyhDsUYhSfU" target="_blank">
    <img src="https://img.youtube.com/vi/GyhDsUYhSfU/0.jpg" width="500">
  </a>
</div>


---

### ✏️ Actividad: Creación de un objeto "Persona"

**Objetivo:** Aplicar los conceptos de programación orientada a objetos mediante la creación de una clase llamada `Persona`, con instancias que contengan datos personalizados.

#### Instrucciones:
1. **Abre tu editor de código y crea un nuevo proyecto Java.**
2. **Define la clase `Persona`:**
   - Crea una clase llamada `Persona` en tu proyecto.
   - Declara al menos dos atributos para esta clase: `nombre` y `edad`.
3. **Agrega un método para imprimir datos:**
   - Dentro de la clase `Persona`, crea un método llamado `imprimirDatos`.
   - Este método debe mostrar en la consola una presentación de la persona, incluyendo sus atributos.
4. **Implementa el punto de entrada del proyecto:**
   - Incluye en tu proyecto una clase principal que contenga un método `main`. Este será el punto de ejecución del programa.
5. **Crea y utiliza instancias de `Persona`:**
   - En el método `main`, crea un objeto a partir de la clase `Persona`.
   - Asigna valores a los atributos `nombre` y `edad` del objeto creado.
   - Invoca el método `imprimirDatos` para mostrar en consola la presentación del objeto.
6. **Crea un segundo objeto:**
   - Crea otro objeto del tipo `Persona`.
   - Asigna valores diferentes a sus atributos.
   - Llama al método `imprimirDatos` para imprimir sus datos en la consola.
7. **Valida el funcionamiento:**
   - Asegúrate de que ambos objetos muestran correctamente sus datos al ejecutar el programa.

💡 **No olvides repasar el material teórico si surge alguna duda. Además, aprovecha los recursos en línea como Google, ChatGPT, YouTube, entre otros, para resolver cualquier inquietud. Aprender a realizar consultas en internet es crucial, ya que te será de gran utilidad en tu vida diaria como programador.**

---

## Uso de Constructores

En Java, las clases tienen un método especial llamado **constructor**, diseñado específicamente para inicializar objetos.

El objetivo principal de un constructor es asignar valores iniciales a los atributos de un objeto al momento de su creación. Si no defines un constructor explícitamente en una clase, el compilador genera automáticamente un constructor sin parámetros, conocido como **constructor predeterminado** o **constructor por defecto**.  

### 🎥 Material Audiovisual
Te invitamos a ver el siguiente video, el cual complementará tu teoría y sentará las bases para llevar a cabo tus próximas actividades.

---
<div align="center">
  <a href="https://www.youtube.com/watch?v=-x71oKT5bjY" target="_blank">
    <img src="https://img.youtube.com/vi/-x71oKT5bjY/0.jpg" width="500">
  </a>
</div>
---

### ✏️ Actividad: Implementación de constructores

**Objetivo:** Comprender y practicar la implementación y el uso de constructores personalizados en una clase, explorando cómo estos facilitan la inicialización de objetos con diferentes configuraciones.  

#### Instrucciones:
1. **Abre tu editor de código y crea un nuevo proyecto Java.**
2. **Define la clase `Auto`:**
   - Crea una clase llamada `Auto` en tu proyecto.
   - Define 3 atributos para la clase: `marca`, `modelo` y `año`.
3. **Crea los siguientes constructores:**
   - Constructor que inicialice `marca`, `modelo` y `año`.
   - Constructor que inicialice `marca` y `modelo`.
   - Constructor que inicialice solamente la `marca`.
   - Constructor sin parámetros.
4. **Agrega un método para imprimir datos:**
   - Escribe el método `imprimirDatos` dentro de la clase `Auto`, que al ser invocado imprima en consola su `marca`, `modelo` y `año`.
   - Teniendo en cuenta que algunos atributos pueden no ser inicializados, el método debe detectar e imprimir sólo aquellos atributos con valor asignado o mostrar un mensaje en el caso de haber sido inicializado con el constructor sin parámetros.
5. **Crea al menos 4 objetos para probar todos los constructores de la clase, con diferentes valores y muestra sus atributos en la consola.**

💡 **Recuerda siempre considerar las recomendaciones previas y llevar tus actividades al siguiente nivel. No te limites a los puntos sugeridos para resolver la tarea; siempre puedes añadir tu propio toque creativo o utilizar de forma integral las herramientas y conocimientos que tienes a tu disposición. ¡El aprendizaje se potencia con la práctica y la experimentación!**

---

### ✏️ Actividad: Ejercicio Complementario

✨ **Este ejercicio es complementario**, lo que significa que está diseñado para ayudarte a profundizar en el tema visto. No es obligatorio desarrollarlo y no está contemplado dentro del tiempo de la sesión. Sin embargo, te recomendamos revisarlo y realizarlo cuando tengas oportunidad, ya que contribuirá a reforzar tus conocimientos.

**Ejercicio: Menú de opciones para crear un objeto `Auto`**

Diseña un menú interactivo en consola que permita al usuario crear un objeto de la clase `Auto`.

#### Sugerencias:
- El usuario podrá ingresar valores para los atributos del objeto (`marca`, `modelo`, `año`), pero también tendrá la opción de dejar algunos atributos sin completar.
- Incluye una opción en el menú para imprimir en consola los valores de los atributos del objeto creado.
- En los constructores donde no se reciban suficientes parámetros para inicializar todos los atributos, asigna un valor por defecto a los atributos restantes. Esto garantizará que el objeto siempre tenga valores válidos.

💡 **Sugerencia adicional:** Considera implementar validaciones en la entrada del usuario para asegurarte de que los datos ingresados sean adecuados, como un año válido o una marca no vacía.