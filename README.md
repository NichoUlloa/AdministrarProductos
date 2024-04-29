Se requiere un sistema que permita administrar diferentes productos en la base de datos. Genera un sistema que permita:

Mostrar productos (como considere conveniente, ej: lista).
Agregar productos.
Eliminar productos.
Buscar producto.
Considere los siguientes puntos.

La búsqueda debe permitir buscar el producto por id y marca, en caso de que se busque solo por marca muestre todos los productos de esa marca.
Al agregar un producto debe agregarse la id y el nombre, mientras que la marca debe ser seleccionada de marcas preexistentes.
Desarrollo:

Implemente código en java que cumpla con los siguientes paquetes:

model : Se incluyen las clases para el desarrollo del caso.
data: Se incluyen las clases para la conexión y creación de la base de datos.
dao: Se incluyen las clases para la gestión de los métodos CRUD (Create, Read, Delete) para las diferentes tablas en la base de datos.
gui/vista: Se incluyen las clases relacionadas con las interfaces gráficas que deberá incluir en el desarrollo del problema.
controller: Se incluyen las clases que gestiona y extrae los datos de la base de datos y el modelo para mostrarlo en las ventanas gráficas.
principal: Se incluye la clase que inicializa el proyecto