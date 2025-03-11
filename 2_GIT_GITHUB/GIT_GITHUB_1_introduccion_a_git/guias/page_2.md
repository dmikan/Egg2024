# Creación y Versionado de tu Primer Proyecto

Ahora que comprendes la importancia de Git, es momento de instalar esta poderosa herramienta en tu ordenador y comenzar a utilizarla en tu proyecto.

Te recomendamos crear tu propio manual con los comandos utilizados en esta sección. Tenerlos a mano te facilitará consultarlos cuando los necesites y te ayudará a familiarizarte con ellos para tus proyectos.

En esta primera instancia, crearás una carpeta que contendrá archivos con los que trabajarás diferentes versiones. La lógica de implementación será siempre similar, independientemente del tipo de archivo que estés gestionando.

Es importante que, si ya tienes experiencia usando Git y cuentas con la configuración necesaria, inviertas tiempo en apoyar a los integrantes de tu equipo. Ayudar a tus compañeros a instalar y configurar Git correctamente no solo fortalecerá tu aprendizaje, sino que también beneficiará el trabajo en equipo. Ser parte de esta colaboración activa te permitirá compartir conocimientos y asegurarte de que todos estén listos para trabajar en conjunto con esta herramienta esencial.

## ✏️ Actividad: Instalar Git en tu ordenador  

Git es un sistema de control de versiones que te permite llevar un seguimiento detallado de los cambios en el código fuente u otros archivos de texto. Funciona como una bitácora, registrando todas las modificaciones que realices, ya sea solo o en equipo.

## 📖 Material Audiovisual  

Si lo necesitas, te proporcionamos un video que te guiará en la instalación de Git, con el cual también podrás profundizar en algunas configuraciones básicas que puedes definir durante el proceso. Si prefieres, puedes seguir el paso a paso indicado en la guía de instalación.  

### 🎥 Instalación de Git | Git | Egg  
[![Instalación de Git | Git | Egg](https://img.youtube.com/vi/Rpd978YJdM4/0.jpg)](https://www.youtube.com/watch?v=Rpd978YJdM4)  

## 🛠 Pasos para instalar Git en tu ordenador  

1. Ingresa al sitio web oficial de Git 👉 [https://git-scm.com/downloads](https://git-scm.com/downloads)  
2. Selecciona la versión de Git correspondiente a tu sistema operativo (**Windows, macOS o Linux**).  
3. Haz clic en el enlace de descarga para iniciar la descarga del instalador.  
4. Una vez que esté descargado, ejecuta el archivo de instalación.  
5. Puedes definir las configuraciones propuestas por defecto durante el proceso. Algunas sugerencias:  

   - **Desmarca** la opción **“Only show new options”** al iniciar el proceso de instalación. Esto te permitirá configurar manualmente algunos aspectos durante la instalación de Git.  
   - En la ventana **“Select Components”**, asegúrate de marcar la opción **“Open Git Bash Here”** para trabajar con mayor comodidad en la consola desde diversas ubicaciones.  
   - En la ventana **“Choosing the default editor used by Git”**, selecciona **“Use Visual Studio Code as Git’s default editor”**.  
   - En la ventana **“Adjusting the name…”**, selecciona **“Override the default branch name for new repositories”** y deja el nombre **`main`**.  
   - En la ventana **“Choosing the SSH executable & HTTPS..”**, deja marcada la opción recomendada.  
   - En la ventana **“Configuring the line ending...”**:  
     - **Windows**: marca la primera opción.  
     - **MacOS/Linux**: selecciona la segunda opción.  
   - Para el resto de configuraciones, deja las opciones predeterminadas.  

6. Haz clic en **“Install”** y, por último, en **“Finish”**.  

---

## ✅ Verificación de la instalación  

¡Listo! 🙌 Una vez finalizada la instalación, te recomendamos **reiniciar la computadora**.  

Luego, verifica que Git se haya instalado correctamente abriendo la terminal y ejecutando el siguiente comando:  

```sh
git --version 
```

Si la instalación fue exitosa, verás un mensaje con la versión de Git disponible en tu ordenador. 🚀


## ✏️ Actividad : Configurar Git  

Después de instalar Git, es importante realizar una configuración inicial utilizando el comando `git config`. Esta configuración es necesaria para que Git pueda identificar al autor de los cambios y asegurar la trazabilidad de los mismos.  

La configuración inicial consiste en establecer:  

Tu nombre de usuario con el comando: `git config --global user.name "Tu nombre"` 

Tu dirección de correo con el comando: `git config --global user.email "Tu email"`

Ten en cuenta que, al definir tu nombre de usuario y correo electrónico en la configuración de Git, es importante que uses un correo al que tengas acceso y elijas un nombre de usuario adecuado. Más adelante, trabajarás con servicios de control de versiones (como GitHub o GitLab) y necesitarás estos datos para vincular tu cuenta y tus proyectos correctamente.  

Desde la consola, ejecuta lo siguiente, por ejemplo:

```
git config --global user.name "nickname user"
git config --global user.email "nickname@mail.com"
```

Para validar que la información se guardó correctamente, ejecuta primero **git config user.name** y luego **git config user.email**. Deberías ver los valores que configuraste previamente.

👉 Si necesitas ayuda, te dejamos un video para guiarte:  

[![🎥 Introducción a Git | Configurar Git | Egg](https://img.youtube.com/vi/6ZRr8bv0NEA/0.jpg)](https://www.youtube.com/watch?v=6ZRr8bv0NEA)  

Ahora que has realizado la configuración inicial, estás listo para comenzar a gestionar tus proyectos en Git. ¡Adelante! 🚀

## ✏️ Actividad: Crear un repositorio de Git “Local”

Ahora que tienes instalado y configurado Git en tu ordenador, aprenderás a crear un repositorio local.

Un **repositorio** es un espacio centralizado donde se almacena, organiza y mantiene la información. Es la carpeta o espacio donde guardarás tu proyecto para luego compartirlo con otros colaboradores a través de un repositorio en la nube (como, por ejemplo, GitHub).

### 📌 Instrucciones:

1. **Crea una nueva carpeta** en tu ordenador con el nombre **"profile"**.
2. **Abre la terminal** en esa carpeta:
   - En **Windows**: Haz clic derecho sobre la carpeta y selecciona **"Git Bash Here"**.
   - En **Linux**: Abre la carpeta y selecciona **"Open in terminal"**.

   En la terminal, escribe el siguiente comando y presiona Enter:

```
git init
```

Al ejecutar git init, estás creando un nuevo repositorio Git vacío (o reiniciando uno existente). Si se creó correctamente, deberías ver el mensaje: `"Initialized empty Git repository in /ruta/a/tu/directorio/.git/"`. 

Escribe el siguiente comando y presiona Enter:

```
git status
```

Con git status, estás verificando el estado de tu repositorio. La consola te informará sobre el estado actual del mismo. En esta ocasión, observa que estás en tu directorio de trabajo (`"working directory"`), ubicado en la rama (`"branch"`) principal, que puede aparecer como `"master"` o `"main"`.

👉 Si necesitas ayuda, te dejamos un video para guiarte :

[![🎥 Introducción a Git | Git init | Egg](https://img.youtube.com/vi/PXzXL4hyXkE/0.jpg)](https://www.youtube.com/watch?v=PXzXL4hyXkE)


## ✏️  Actividad: Crear una primera versión de un archivo

**Objetivo:** Crear tu primer archivo en un repositorio local de Git, comprenderás cómo agregarlo al staging area y realizarás tu primer commit. Esto te permitirá familiarizarte con los pasos fundamentales para iniciar la gestión de tus proyectos utilizando Git.

### Crear un archivo Markdown  
Con la consola de comandos Git Bash abierta en la carpeta “profile” creada previamente, ejecuta el siguiente comando:  

```sh
touch README.md
```

> **Nota:** Este comando funciona en Git Bash y en terminales de Linux o macOS. En la consola de Windows (CMD), es posible que no funcione debido a que `touch` no está integrado.  

Este comando crea un nuevo archivo llamado `README.md` en la carpeta “profile”. Este archivo está en tu directorio de trabajo, lo que significa que Git sabe que el archivo está presente, pero aún no está siguiendo los cambios realizados en él.  

Un archivo con extensión `.md` es un archivo de **Markdown**, un lenguaje de marcado ligero que permite dar formato al texto de manera sencilla. Se usa ampliamente para crear documentación porque es fácil de leer en texto plano y se puede convertir a HTML para una mejor presentación en sitios web.  

### Agregar un archivo a “staging area”  
A continuación, ejecuta el siguiente comando:  

```sh
git add README.md
```

Desde este momento, el archivo se encuentra en el **staging area** (área de preparación), y Git comenzará a rastrear los cambios que realices en él. El comando `git add` mueve el archivo desde el **directorio de trabajo** (tu carpeta de proyecto) al **staging area**, que funciona como una "sala de espera" para agrupar todos los cambios que deseas guardar juntos en el repositorio.  

Para verificar si el archivo cambió de ubicación (del directorio de trabajo al área de preparación, es decir, del *working* al *staging*), ejecuta:  

```sh
git status
```

El archivo debería figurar debajo de **"Changes to be committed"**.  

### Realizar el primer commit  
Finalmente, ejecuta el siguiente comando:  

```sh
git commit -m "creacion readme"
```

Con este comando, realizas el primer envío o versión del proyecto. Es decir, `git commit` guarda los cambios desde el **staging area** en el **repositorio local**. Al hacer esto, Git crea un "punto de guardado" en el historial del proyecto.  

El texto entre comillas (`"creacion readme"`) es un mensaje descriptivo que indica el propósito del cambio realizado, facilitando su identificación en el historial de versiones.  

Este comando toma todos los cambios que están en el **staging area** y los almacena en el **repositorio local**, marcando un punto clave en el avance del proyecto. 🚀  

## 👉 Si necesitas ayuda, te dejamos un video para guiarte:  

[![🎥 Video](https://img.youtube.com/vi/7RnHisHEd4k/0.jpg)](https://www.youtube.com/watch?v=7RnHisHEd4k)


### ⚠️ ¡¡¡IMPORTANTE!!! Ten en cuenta lo siguiente:

- El mensaje del commit debe ser **breve y descriptivo**, indicando claramente el cambio realizado.  
- Para verificar que el archivo se ha movido correctamente del staging area al repositorio local, ejecuta:  
  ```sh
  git status
  ```
  La consola debería mostrar el mensaje:  
  ```
  Nothing to commit, working tree clean
  ```
- Antes de realizar un nuevo commit, asegúrate de que hayas **creado, modificado o eliminado archivos** en tu proyecto.  
- Recuerda los pasos clave:  
  1. Mueve los archivos al área de preparación con:  
     ```sh
     git add <archivo>
     ```
  2. Realiza el commit para guardarlos en el repositorio local con:  
     ```sh
     git commit -m "Mensaje descriptivo del cambio"
     ```
