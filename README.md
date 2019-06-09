# Fast Break Truck

Mick & Rorty TM quedan atrapados en el planeta Wabalabadu sin recarga para la pistola de dimensiones de Mick y _out of cash_ (sin parné), porque en ese planeta se paga con Pigcoins y los dólares no sirven para nada.

Se ven obligados a aceptar un trabajo como cocineros en una _food truck_ que reparte desayunos a las crías de los alienígenas antes de entrar en la escuela de educación primaria.

## El desayuno

El desayuno consta de:

- una caja de cereales de uno de los dos tipos: _eyeholes_ o _smiggles_
- una bebida: _fleeb juice_ o _turbulent juice_
- un juguete: un _plumbus_

![Eyeholes](https://i.redd.it/h0brsb41byxy.jpg)
![Smiggles](https://http2.mlstatic.com/fresa-smiggles-rick-y-morty-cereales-para-el-desayuno-fy-D_NQ_NP_788308-MLM26604455613_012018-F.jpg)
![Fleeb juice](https://images-na.ssl-images-amazon.com/images/I/61uEBPcFdOL._SY679_.jpg)
![Turbulent juice](https://i.imgur.com/D6yz7nC.jpg)
![Plumbus](https://i.pinimg.com/originals/65/8f/42/658f428f66876ba5fef850ca2a410117.jpg)

## Diagrama de clases UML

Construye la aplicación según la arquitectura que se representa en el diagrama de clases UML de la figura.

Respeta los nombres de las clases, métodos y propiedades que se indican.

## Prepara el proyecto

 1. Crea un nuevo repo en tu cuenta en **Github**.
 2. Crea un nuevo directorio en tu equipo y **clona el repositorio** de Github.
 3. Abre VSCode /Eclipse /Netbeans y **establece como workspace** el directorio que has clonado.
 4. Crea un proyecto **Maven** que incluya tu **nombre y apellidos**.
 5. Pon el proyecto en seguimiento en **Git** y configura `.gitignore`.
 6. Copia y pega la función principal `App.java`. Utilízala como guía en el proceso TDD. **No puedes modificar su código**, pero sí puedes comentar aquellas partes que aun no hayas implementado.
 7. Añade al proyecto la clase `GenSig.java` que ofrece varias utilidades que emplearás.
 8. Completa las clases que aquí se indican **implementando los casos test que necesites**. Practica **TDD**.
 9. Realiza `commits` como mínimo cada vez que termines una historia de usuario.

## Cómo entregar el código

 1. Desde Eclipse exporta el proyecto a un fichero.
 2. En VSCode, comprime la carpeta del proyecto.
 3. Envíame el archivo por correo electrónico.
 4. **Realiza commits periódicamente** mientras avanzas en el desarrollo de la aplicación.
 5. Realiza un `push` al repo remoto en GitHub **SOLO cuando hayas terminado el proyecto**.

## Salida de la aplicación

Intenta que la salida del programa sea lo más parecida posible a las imágenes que se proporcionan.

## Historias de usuario

Las hitorias de usuario están enunciadas en el script principal `App.java`

Utiliza este script para guiar el desarrollo del diagrama de clases UML.

## Codigo

### FastBreakTruck

Prepara dos tipos desayuno:

Eyeholes + Turbulent Juice

o

Smiggles + Fleeb Juice

Para ello, crea un `Desayuno` con un `Item` del tipo `Eyeholes` y otro del tipo `TurbulentJuice`; o crea un `Desayuno` con `Smiggles` y `FleebJuice`

### Desasyuno

Tiene una colección de `Item`.

- `mostratItems()` recorre los items y mostrarlos en pantalla.
- `getCoste()` calcula el precio total del desayuno sumando el precio de cada item que lo compone.

### Item

Los métodos de este componente devuelven el nombre, el empaquetado y el precio de cada `Item`

### Eyeholes - Smiggles - TurbulentJuice - FleebJuice

Estas clases crean un `Item` u objeto de ese tipo e inicializan sus propiedades nombre, empaquetado y precio.

### Caja - Tubo

Devuelven el nombre del empaquetado: `caja` o `tubo`.
