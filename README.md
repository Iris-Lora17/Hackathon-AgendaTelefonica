**📒 Agenda Telefónica en Java**

Aplicación de consola desarrollada en Java que permite administrar contactos telefónicos mediante un menú interactivo. El proyecto implementa conceptos fundamentales de programación orientada a objetos (POO), manejo de colecciones y validación de datos.

**🎯 Objetivo del proyecto**
Fortalecer los conocimientos de Java mediante el desarrollo de una aplicación práctica que permita comprender la creación de clases, la manipulación de objetos, el uso de colecciones y la implementación de operaciones CRUD básicas.

**🚀 Características**

La aplicación permite realizar las siguientes operaciones:

**Añadir contacto:** registra un nuevo contacto proporcionando nombre y teléfono.
**Comprobar contacto:** verifica si un contacto ya se encuentra registrado.
**Listar contactos:** muestra todos los contactos almacenados.
**Buscar contacto:** localiza un contacto mediante su nombre y muestra su número telefónico.
**Eliminar contacto:** elimina un contacto de la agenda.
**Verificar agenda llena:** comprueba si se alcanzó la capacidad máxima establecida.
**Consultar espacios libres:** muestra cuántos contactos adicionales se pueden registrar.
**Salir:** finaliza la ejecución del programa.


**🛠️ Tecnologías utilizadas**

**Lenguaje:** Java.
**IDE:** IntelliJ IDEA.
**Colecciones:** Java Collections Framework (Set, HashSet).
**Entrada de datos:** Scanner.
**Control de versiones:** Git y GitHub.

**📂 Estructura del proyecto**

**AgendaTelefonica/**
│
├── Main.java
├── Agenda.java
├── Contacto.java
└── README.md

**Descripción de las clases**

**Main.java**
Punto de entrada de la aplicación.
Interacción con el usuario mediante un menú.
Captura y validación de datos.
Invocación de las operaciones de la agenda.

**Contacto.java**
Modelo que representa un contacto.
Contiene los atributos nombre y teléfono.
Implementa validaciones para los datos.
Sobrescribe equals(), hashCode() y toString().

**Agenda.java**
Administra la colección de contactos.
Utiliza HashSet para evitar registros duplicados por nombre.
Implementa las operaciones de búsqueda, registro, eliminación y consulta de capacidad.

**📋 Validaciones implementadas**

**Nombre:**
- No puede estar vacío.
- No permite números.
- Se eliminan espacios al inicio y al final.

**Teléfono:**
- Debe contener exactamente 10 dígitos.
- No permite letras ni caracteres especiales.
- Se almacena como String para conservar posibles ceros iniciales.

**## 💻 Instalación y ejecución**

**1. Clona el repositorio:**

bash
git clone URL_DEL_REPOSITORIO


**2. Ingresa a la carpeta del proyecto:**

bash
cd AgendaTelefonica


**3. Compila los archivos:**

bash
javac Main.java Agenda.java Contacto.java


**4. Ejecuta la aplicación:**

bash
java Main


Se solicitará la capacidad máxima de la agenda y posteriormente aparecerá el menú principal.

**🧠 Conceptos de programación aplicados**

**Este proyecto permite practicar los siguientes conceptos:**

- Programación orientada a objetos.
- Encapsulamiento.
- Constructores.
- Métodos estáticos y de instancia.
- Colecciones y genéricos.
- Interfaces Set.
- Implementación HashSet.
- Ciclos for-each.
- Estructuras condicionales (if, switch).
- Validación de datos.
- Manejo de excepciones.
- Sobrescritura de métodos (@Override).
- Comparación de objetos mediante equals() y hashCode().

**📌 Consideraciones**

- La capacidad máxima de la agenda se establece al iniciar el programa.
- No se permiten contactos con nombres duplicados, independientemente de las mayúsculas o minúsculas.
- Los contactos se almacenan en memoria durante la ejecución; no existe persistencia en archivos o bases de datos.
- HashSet no garantiza un orden específico al listar los contactos.



***Proyecto de práctica desarrollado con Java.***
