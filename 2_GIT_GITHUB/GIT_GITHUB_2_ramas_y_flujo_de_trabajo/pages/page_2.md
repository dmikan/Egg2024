# Crear y modificar ramas

En este paso, profundizarás en el uso de ramas para establecer un flujo de trabajo eficiente con Git. Si lo desean, un integrante del equipo puede compartir su pantalla para que lo resuelvan de manera colaborativa. Sin embargo, es importante que todos realicen la actividad en sus propios ordenadores para asegurarse de que cada uno practique de manera individual.

Para trabajar con el flujo de trabajo propuesto por Git, es importante tener en cuenta estos pasos:

- **Partir desde la rama principal**: comienza en la rama principal (*main* o *master*) y crea una nueva rama para el desarrollo. Esta será la rama en la que se integrarán las nuevas funcionalidades.

- **Fusionar cambios en la rama principal**: las vistas o funcionalidades desarrolladas deben fusionarse nuevamente en la rama principal. Esto garantiza que todo el trabajo se centralice y mantenga la estabilidad del proyecto.

- **Crear ramas de trabajo**: crea ramas de trabajo desde la rama principal para desarrollar avances específicos del proyecto. Estas ramas permiten trabajar de forma independiente y evitar interferencias con otras tareas en curso.

Si ya tienes experiencia utilizando Git y te resulta sencillo realizar las actividades, es fundamental que aproveches esta oportunidad para apoyar a los demás miembros de tu equipo. Ayudar a tus compañeros a comprender el uso de Git de manera efectiva no solo fortalecerá tu propio conocimiento, sino que también mejorará el trabajo en equipo. Ser un colaborador activo en este proceso te permitirá compartir tus conocimientos, asegurándote de que todos estén preparados para trabajar juntos con esta herramienta clave en el desarrollo de proyectos. ¡Recuerda que el aprendizaje colaborativo es una de las mejores formas de consolidar lo que sabes!

---

## ✏️ Actividad: Crear la rama *develop* y *features*

### Objetivo
Crear una nueva rama de trabajo llamada *develop*, que se derivará de la rama principal del proyecto. A partir de *develop*, crearás varias ramas adicionales para simular "flujos de trabajo paralelos". Estas ramas gestionarán diferentes cambios en tu archivo, permitiendo trabajar de forma independiente en diversas modificaciones.

💡 **Recuerda**: Trabajar con **Visual Studio Code** y la consola de comandos en la carpeta *profile*. Puedes usar la terminal de tu ordenador o la del editor de código.

---

### 🚀 Pasos a seguir:

#### 1️⃣ Verificar la rama en la que te encuentras
Ejecuta el siguiente comando para comprobar en qué rama estás trabajando (puede ser *main* o *master*):  

```sh
  git branch
```

#### 2️⃣ Asegurarse de que no haya cambios pendientes
Verifica el estado del repositorio con:  

```sh
  git status
```

Si todo está correcto, deberás ver un mensaje similar a:  

```sh
  nothing to commit, working tree clean
```

#### 3️⃣ Crear una nueva rama *develop*
Para crear y cambiar a una nueva rama llamada *develop*, usa:  

```sh
  git checkout -b develop
```

💡 **Explicación**: La opción `-b` permite crear y cambiar a una nueva rama en un solo paso.  
Si todo salió bien, la consola mostrará:  

```sh
  Switched to a new branch 'develop'
```

#### 4️⃣ Crear nuevas ramas de trabajo
Las siguientes ramas se crean a partir de *develop*:  

```sh
  git branch technologies
  git branch skills
  git branch hobbies
  git branch family
```

📌 **Importante**: Asegúrate de estar siempre en la rama *develop* antes de crear cada subrama.  

Para verificar la creación de las ramas, usa:  

```sh
  git branch
```

#### 5️⃣ Realizar modificaciones en una rama
Primero, cambia a la rama *technologies*:  

```sh
  git checkout technologies
```

Luego, edita el archivo `README.md` agregando información, por ejemplo:  

```md
## Technologies
- **Back-End**: Proficient in Java, I bring to the table a strong understanding of server-side development...
- **Front-End**: My expertise in Angular allows me to create interactive and user-friendly interfaces...
```

Guarda los cambios y haz un commit en la rama actual:  

```sh
  git add README.md
  git commit -m "Update Technologies"
```

💡 **Nota**: Los cambios realizados en una rama no afectan a las demás. Cada rama de trabajo mantiene sus modificaciones de forma independiente. En un equipo real, cada programador trabaja en su propia rama y luego comparte sus avances para revisión, aprobación e integración en el proyecto principal. 

#### 6️⃣ Repetir para las demás ramas  
- **Volver a *develop***:  

```sh
  git checkout develop
```

- **Cambiar a otra rama (ejemplo: *skills*)**:  

```sh
  git checkout skills
```

- **Editar `README.md`**, guardar los cambios y hacer commit:  

```sh
  git add README.md
  git commit -m "Update Skills"
```

Repite estos pasos para las secciones *family* y *hobbies*.

---

## 🔎 Resumen  

✔️ Creaste una rama llamada *develop*, a partir de la rama principal.  
✔️ Desde *develop*, generaste cuatro ramas adicionales: *technologies*, *skills*, *hobbies* y *family*.  
✔️ Cambiaste entre ramas para editar el archivo `README.md`.  
✔️ Cada rama almacenó los cambios relacionados con su sección específica.  
✔️ Realizaste un *commit* en cada rama.  

---

## 📖 Material Audiovisual  
Si tuviste dudas en alguna de las actividades, te invitamos a mirar el siguiente video donde se explica cómo solucionarlas:  

🎥 **[Introducción a Git | Ramas | Egg](https://www.youtube.com/watch?v=36VQ8wxjiW0)**
