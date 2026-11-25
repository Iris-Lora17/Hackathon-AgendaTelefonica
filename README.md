📒 Agenda Telefónica en Java

Aplicación de consola desarrollada en Java que permite administrar contactos telefónicos mediante un menú interactivo. El proyecto implementa conceptos fundamentales de programación orientada a objetos (POO), manejo de colecciones y validación de datos.

🚀 Características

La aplicación permite realizar las siguientes operaciones:

Añadir contacto: registra un nuevo contacto proporcionando nombre y teléfono.

Comprobar contacto: verifica si un contacto ya se encuentra registrado.

Listar contactos: muestra todos los contactos almacenados.

Buscar contacto: localiza un contacto mediante su nombre y muestra su número telefónico.

Eliminar contacto: elimina un contacto de la agenda.

Verificar agenda llena: comprueba si se alcanzó la capacidad máxima establecida.

Consultar espacios libres: muestra cuántos contactos adicionales se pueden registrar.

Salir: finaliza la ejecución del programa.

🛠️ Tecnologías utilizadas

Lenguaje: Java.

IDE: IntelliJ IDEA.

Colecciones: Java Collections Framework (Set, HashSet).

Entrada de datos: Scanner.

Control de versiones: Git y GitHub.

📂 Estructura del proyecto

AgendaTelefonica/
│
├── Main.java
├── Agenda.java
├── Contacto.java
└── README.md

Descripción de las clases

Main.java

Punto de entrada de la aplicación.

Interacción con el usuario mediante un menú.

Captura y validación de datos.

Invocación de las operaciones de la agenda.

Contacto.java

Modelo que representa un contacto.

Contiene los atributos nombre y teléfono.

Implementa validaciones para los datos.

Sobrescribe equals(), hashCode() y toString().

Agenda.java

Administra la colección de contactos.

Utiliza HashSet para evitar registros duplicados por nombre.

Implementa las operaciones de búsqueda, registro, eliminación y consulta de capacidad.
