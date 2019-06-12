# Fast Break Truck

Mick & Rorty TM quedan atrapados en el planeta Wabalabadu sin recarga para la pistola de dimensiones de Mick y _out of cash_ (sin parné), pues en ese planeta se paga con EnZinIums y los dólares no sirven para nada.

En vez de hacerse repartidores de Jlobo le quitan el trabajo a dos robococineros en una _fast-break truck_ que prepara desayunos a las crías de los alienígenas antes de entrar en la escuela de educación wabalabadaria.

## El desayuno

El desayuno consta de:

- Una caja de cereales de uno de los dos tipos: _eyeholes_ o _smiggles_
- Una bebida: _fleeb juice_ o _turbulent juice_

![Eyeholes](https://i.redd.it/h0brsb41byxy.jpg)
![Smiggles](https://http2.mlstatic.com/fresa-smiggles-rick-y-morty-cereales-para-el-desayuno-fy-D_NQ_NP_788308-MLM26604455613_012018-F.jpg)
![Fleeb juice](https://images-na.ssl-images-amazon.com/images/I/61uEBPcFdOL._SY679_.jpg)
![Turbulent juice](https://i.imgur.com/D6yz7nC.jpg)

## Diagrama de clases UML

Construye la aplicación según la arquitectura que se representa en el diagrama de clases UML de la figura que se proporciona en papel. Al final del examen tendrás que añadir nuevos componentes al diagrama. **Pon tu nombre y devuélvemela al finalizar el examen**.

Respeta los nombres de todos los componentes, métodos y propiedades que se indican.

## Prepara el proyecto

 1. Crea un nuevo repo en tu cuenta en **Github**.
 2. Crea un nuevo directorio en tu equipo y **clona el repositorio** de Github.
 3. Abre VSCode /Eclipse /Netbeans y **establece como workspace** el directorio que has clonado.
 4. Crea un proyecto **Maven**.
 5. Pon el proyecto en seguimiento en **Git** y configura `.gitignore`.
 6. Copia y pega la función principal `App.java`. Utilízala como guía en el proceso TDD. **No puedes modificar su código**, pero sí puedes comentar aquellas partes que aun no hayas implementado.
 7. Completa las clases que aquí se indican **implementando los casos test que necesites**. Practica **TDD**.
 8. Realiza `commits` como mínimo cada vez que termines una historia de usuario.

## Cómo entregar el código

 1. Desde Eclipse exporta el proyecto a un fichero.
 2. En VSCode, comprime la carpeta del proyecto.
 3. Envíame el archivo por correo electrónico.
 4. **Realiza commits periódicamente** mientras avanzas en el desarrollo de la aplicación.
 5. Realiza un `push` al repo remoto en GitHub **SOLO cuando hayas terminado el proyecto**.

## Salida de la aplicación

Intenta que la salida del programa sea lo más parecida posible a las imágenes que se proporcionan.

## Historias de usuario

Las historias de usuario están enunciadas en el script principal `App.java`

Utiliza este script para guiar el desarrollo del diagrama de clases UML.

## Codigo

### SOLID

Garantiza que tu solución satisfaga los 5 principios SOLID.

### FastBreakTruck

Prepara dos tipos desayuno:

Eyeholes + Turbulent Juice

y

Smiggles + Fleeb Juice

Para ello, crea un `Desayuno` con un `Item` del tipo `Eyeholes` y otro del tipo `TurbulentJuice`; luego crea un `Desayuno` con `Smiggles` y `FleebJuice`

### Desayuno

- `mostratItems()` recorre los items y los muestra en pantalla.
- `getCoste()` calcula el precio total del desayuno.

### Item

Los métodos de este componente devuelven el nombre, el empaquetado y el precio de cada `Item`

### FleebJuice - TurbulentJuice -  Smiggles - Eyeholes

Estas clases crean un `Item` u objeto de ese tipo e inicializan sus propiedades nombre, empaquetado y precio (pvp).

### Caja - Tubo

`envoltorio()` devuelve el nombre del empaquetado: `caja` o `tubo`.

## El juguete

Una vez que hayas terminado de implementar la app según la arquitectura indicada en el diagrama de clases UML, añade al desayuno la posibilidad de incluir un juguete, un _plumbus_ en el caso del `Desayuno` de tipo `Eyeholes`. Su precio es de 100 y viene en una caja.

Comprueba que tu código es OCP de modo que no necesites modificar el código que ya has escrito de la clase `Eyeholes` para añadir esta nueva funcionalidad. Si has de modificarlo... _code smell_.

- Prepara un desayuno de tipo `Eyeholes` que incluya un _plumbus_.

- Chequea que el _plumbus_ aparece en la salida del tercer caso test en el _script_ principal de la app.

- Añade al diagrama de clases los componentes necesarios para reflejar la extensión que has hecho a la arquitectura del programa y entrégame la hoja.

![Plumbus](https://i.pinimg.com/originals/65/8f/42/658f428f66876ba5fef850ca2a410117.jpg)
