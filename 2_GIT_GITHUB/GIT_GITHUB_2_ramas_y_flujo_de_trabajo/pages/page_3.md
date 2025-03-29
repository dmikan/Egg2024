# Analizar y eliminar ramas

En este paso, profundizarás en el uso de ramas para establecer un flujo de trabajo eficiente con Git. Si lo desean, un integrante del equipo puede compartir su pantalla para que lo resuelvan de manera colaborativa. Sin embargo, es importante que todos realicen la actividad en sus propios ordenadores para asegurarse de que cada uno practique de manera individual.

## ✏️ Actividad: Verificar commits

**Objetivo:** Analizar el historial de commits en cada rama.

Desde la rama `develop`, cambia a una de las ramas previamente creadas usando el comando correspondiente:

```sh
 git checkout nombreDeLaRama
```

Ejecuta el siguiente comando para listar el historial de commits de esa rama:

```sh
 git log --oneline
```

Verifica que se muestren todos los commits realizados en esa rama.

Repite la acción con cada rama. Ten en cuenta que puedes moverte directamente entre las ramas secundarias sin necesidad de volver a `develop` cada vez. Una vez que las ramas se crean a partir de `develop`, son independientes y puedes cambiar entre ellas usando el comando:

```sh
 git checkout nombreDeLaRama
```

Por ejemplo:

![Ejemplo de git log](image4)

Los commits de cada rama están en espera de ser subidos al repositorio remoto y supervisados, para luego poder ser parte del proyecto de trabajo.

A medida que te muevas entre cada rama, notarás que el archivo solo mostrará el contenido específico para esa rama. Esto significa que siempre verás el título, la sección "About Me" y "Contact Me", junto con la sección correspondiente a la rama en la que te encuentres, reflejando las ediciones realizadas en esa área.

---

## BORRAR RAMAS EN UN REPOSITORIO LOCAL

Gestionar adecuadamente las ramas locales en Git es esencial para mantener tu repositorio limpio y organizado, evitando la acumulación de ramas obsoletas que pueden generar confusión.

Antes de eliminar cualquier rama, primero es útil saber qué ramas tienes en tu repositorio local. Para listar todas las ramas locales, usa el siguiente comando:

```sh
 git branch
```

Si una rama ya ha sido fusionada con la rama principal (por ejemplo, `main` o `develop`) y ya no la necesitas, puedes eliminarla de forma segura con el siguiente comando:

```sh
 git branch -d nombreDeLaRama
```

Este comando eliminará la rama sólo si sus cambios ya han sido integrados a la rama principal.

Si, en cambio, deseas eliminar una rama que aún no ha sido fusionada y no te importa perder los cambios que contiene, puedes usar:

```sh
 git branch -D nombreDeLaRama
```

Este comando forzará la eliminación de la rama, sin importar si tiene cambios no fusionados.

Es importante tener cuidado al borrar ramas locales, ya que una vez eliminadas, no podrás recuperarlas fácilmente si tienes cambios no fusionados.

---

## ✏️ Actividad: Eliminar la rama `family`

**Objetivo:** Eliminar la rama `family` de tu proyecto.

Utilizando el comando:

```sh
 git branch -D family
```

Elimina la rama indicada.

Verifica con el comando correspondiente que sólo tengas las ramas correspondientes, es decir, `main` o `master`, `develop`, `technologies`, `skills`, `hobbies`.

💡 **Te recomendamos actualizar tu documento de comandos** con los comandos utilizados en esta sección. Tenerlos a mano te será útil mientras te familiarizas con ellos.

---

## 🎯 No te quedes solo con lo solicitado

Si ya terminaste las actividades propuestas, ¡no te detengas ahí! Aprovecha este tiempo para ir más allá y profundizar tus conocimientos. Practica con proyectos que tengas en tu ordenador, crea nuevos repositorios locales, y sigue explorando las posibilidades que Git te ofrece.

Recuerda que cuanto más practiques, más confianza y fluidez ganarás. Cada repositorio, cada commit y cada práctica adicional te acercan un paso más a dominar el control de versiones. ¡Tú decides hasta dónde quieres llegar! 🚀

---

## Puntos clave de la sección: Ramas y Flujo de Trabajo

### Las ramas en Git:

- Funcionan como caminos paralelos para desarrollar nuevas funcionalidades o corregir errores sin afectar la versión principal (`main`/`master`).
- Facilitan el trabajo en equipo, permitiendo que cada colaborador trabaje en su rama y luego fusione sus cambios al proyecto principal.
- Ofrecen un entorno aislado para pruebas y desarrollos, con la posibilidad de integrar los cambios una vez completados y validados.

### Git Workflow:

- Es un conjunto de prácticas recomendadas para trabajar de forma organizada y eficiente en proyectos de software.
- Permite revertir cambios fácilmente, trabajar con equipos de cualquier tamaño y mantener un flujo claro y coordinado.
- Incluye pasos como asignación de tareas, creación de ramas, desarrollo en paralelo, sincronización periódica con la rama principal, y revisión y fusión de cambios.

### Comandos esenciales para ramas en Git:

- `git branch` → Lista todas las ramas locales.
- `git branch nombre-de-la-nueva-rama` → Crea una nueva rama.
- `git branch -D nombre-de-la-rama` → Elimina una rama local.
- `git checkout nombre-de-la-rama` → Cambia a una rama existente.
- `git checkout -b nombre-de-la-nueva-rama` → Crea y cambia a una nueva rama.
- `git switch nombre-de-la-rama` → Alternativa más reciente para cambiar de rama.
- `git push origin nombre-de-la-rama` → Sube la rama al repositorio remoto para compartir o respaldar el trabajo.
