# 📌 Generación de Múltiples Versiones

Ya comprendiste que crear un repositorio te permitirá tener un control más eficiente sobre las versiones de un proyecto. Por esto, el siguiente desafío tiene como objetivo personalizar el perfil y familiarizarte con los comandos más usados de Git.

## ✏️ Actividad: Personalizar el archivo `README.md`

Para trabajar de manera más cómoda en esta actividad, abre tu editor de código recomendado para este módulo, **Visual Studio Code**.

### 🛠️ PASO 1: Abrir carpeta en Visual Studio Code  

1. Abre la carpeta **"profile"** en **Visual Studio Code**.  
2. En el menú del editor, selecciona **Terminal > New Terminal (Nueva terminal)** para abrir una consola de comandos en la carpeta **"profile"**.  

### 🛠️ PASO 2: Modificar y personalizar el archivo `README.md`  

Ahora que tienes todo listo, comienza a editar el archivo `README.md` y personalizar el repositorio de tu perfil. Este ejercicio te permitirá familiarizarte con los comandos de Git.  

✏️ **Editar el archivo:** Define un título para tu perfil y guarda los cambios. Un ejemplo podría ser:

```md
# Hello! I'm Eggsy! Full Stack Developer
```

💡 Completa tu perfil con tus datos y personaliza a tu gusto.  

---

### 🛠️ PASO 3: Preparar el archivo para el commit  

En la terminal, ejecuta el siguiente comando para preparar el archivo en el **staging area**:  

```sh
git add README.md
```

---

### 🛠️ PASO 4: Hacer el commit  

Luego, realiza el commit ejecutando:

```sh
git commit -m “title”
```

💡 **Recuerda utilizar un commit breve y descriptivo.**  

✏️ **Verificar el commit:** Si todo ha salido correctamente, deberías ver un mensaje en la consola similar a:

```sh
[main 39a1f05] tu mensaje
1 file changed, 1 insertion(+)
```

Este mensaje indica que el commit se realizó con éxito y que tus cambios han sido guardados en tu repositorio local.  
Si no ves este mensaje, revisa los pasos anteriores para confirmar que todo está correctamente configurado.  

---

### 🛠️ PASO 5: Editar y agregar una nueva sección  

Continuarás personalizando el archivo `README.md`. Ahora, define la sección **"Sobre mí"**. Puedes escribir el texto que desees, por ejemplo:

```md
## About me  
Hello! I'm a passionate Full Stack Developer with a keen focus on Java and Angular.  
My journey in the tech world began with a fascination for building solutions that not only perform efficiently but also deliver a compelling user experience.
```

---

### 🛠️ PASO 6: Registrar los cambios  

Prepara nuevamente el archivo en el **staging area** con el comando:  

```sh
git add README.md
```

Luego, realiza un commit con un mensaje descriptivo, por ejemplo:

```sh
git commit -m "about me"
```

---

### 🛠️ PASO 7: Agregar una sección de cierre  

Edita el archivo `README.md` nuevamente y agrega una sección final para tu perfil, como la siguiente (pon la información que tú desees):

```md
## Contact me  
As I continue my journey in Full Stack development, I am always on the lookout for collaborative projects and opportunities where I can contribute my skills and grow both personally and professionally.  
Let's connect and explore how we can create something amazing together!
```

✏️ **Registrar esta versión:**  
Prepara y versiona este cambio de la misma manera que antes, utilizando `git add` y `git commit`.  

```sh
git add README.md  
git commit -m "contact me section"
```

💡 **Recuerda utilizar un mensaje descriptivo para el commit.**  

---

### 🛠️ PASO 8: Revisar el historial de commits  

Finalmente, para revisar los commits realizados, ejecuta el siguiente comando:

```sh
git log --oneline
```

Este comando te permitirá ver una lista del historial de commits en la consola y verificar fácilmente el progreso de tu trabajo.  

📌 **También puedes hacer uso de la interfaz de Visual Studio Code para previsualizar el documento.**

---

## 🎥 Material Audiovisual  

Si tuviste dudas en alguna de las actividades, te invitamos a mirar el siguiente video donde se explica cómo solucionarlas:  

🎥 **Introducción a Git | Commits | Egg**  

---

## 🎯 No te quedes solo con lo solicitado  

Si ya terminaste las actividades propuestas, ¡no te detengas ahí! Aprovecha este tiempo para ir más allá y profundizar tus conocimientos.  
Practica con proyectos que tengas en tu ordenador, crea nuevos repositorios locales y sigue explorando las posibilidades que Git te ofrece.  

Recuerda que cuanto más practiques, más confianza y fluidez ganarás.  
Cada repositorio, cada commit y cada práctica adicional te acercan un paso más a dominar el control de versiones.  

¡Tú decides hasta dónde quieres llegar! 🚀  

---

## 📌 Puntos clave de la sección: Introducción a Git  

- **Importancia de Git:** Git es esencial para gestionar el código fuente y los cambios en proyectos de software.  
  Permite el control de versiones, evita la desorganización y facilita la colaboración en proyectos complejos.  

- **Interacción con Git:** La mayoría de las acciones en Git se realizan a través de la consola de comandos,  
  lo que, aunque parece complejo, otorga un control total sobre el proyecto.  
  Existen interfaces gráficas, pero la consola es la más universal y poderosa.  

- **Áreas de trabajo en Git:** Git organiza el trabajo en tres áreas clave:  

  - **Working Directory (Directorio de trabajo):** Espacio donde se realizan los cambios en los archivos, pero sin que sean permanentes.  
  - **Staging Area (Área de Preparación):** Aquí se organizan y seleccionan los cambios específicos que se incluirán en el próximo commit.  
  - **Local Repository (Repositorio Local):** Una vez que los cambios son confirmados (con un commit), se guardan permanentemente en el repositorio local.  

### 📌 Comandos esenciales en Git  

```sh
git init          # Inicializa un repositorio en el proyecto.
git status        # Muestra los cambios realizados y los archivos listos para ser comprometidos.
git add          # Prepara los archivos para el siguiente commit, moviéndolos del Working Directory al Staging Area.
git commit -m "mensaje" # Realiza el commit, registrando los cambios en el repositorio local.
git log          # Muestra el historial de cambios realizados en el proyecto.
git log --graph  # Visualiza gráficamente las ramas y fusiones del proyecto.
```

- **El archivo `README.md` es esencial en cada repositorio.**  
  Sirve para describir el proyecto, proporcionar instrucciones de instalación, ejemplos de uso y enlaces a documentación adicional.  
  También incluye detalles sobre cómo contribuir, la licencia del proyecto y la información de contacto.  
