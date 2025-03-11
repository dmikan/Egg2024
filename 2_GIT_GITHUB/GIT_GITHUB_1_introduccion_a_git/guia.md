# Primer paso a “Introducción a GIT”

¡Hola, bienvenido!  

En esta oportunidad, explorarás los conceptos fundamentales de **Git** y darás tus primeros pasos en el mundo del **control de versiones**. Aprenderás cómo funciona y descubrirás por qué es una herramienta imprescindible en el desarrollo de software y la colaboración en equipos.  

Prepárate para adquirir nuevos conocimientos y potenciar tus habilidades como desarrollador.  

¡Comencemos! 🚀  

## 📖 Material Descargable  
Aquí encontrarás el material descargable correspondiente que te dará las bases para tus próximos pasos **[teoria_introduccion_a_git.pdf](https://github.com/dmikan/Egg2024/blob/main/2_GIT_GITHUB/GIT_GITHUB_1_introduccion_a_git/teoria_introduccion_a_git.pdf)**.  

## ✅ Checklist  

Asegúrate de:  

- 📖 Leer el material teórico de **Introducción a Git**.  
- 🖥️ Tener **Visual Studio Code** instalado como editor de código recomendado.  


💡 **Revisar estos puntos es muy importante**, ya que ayudarán a que todos puedan tener la mejor experiencia posible y logren resolver los desafíos correspondientes.  


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




