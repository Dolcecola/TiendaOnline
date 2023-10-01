```mermaid
classDiagram
TiendaInicio <|--CrearCuenta
TiendaInicio <|--TiendaMain
TiendaInicio <|--Admin

TiendaMain <|--Cuenta
TiendaMain <|--Productos
TiendaMain <|--Categoria

Cuenta <|--Carrito
Cuenta <|--Pago

class TiendaInicio{
	-Usuario: String
	-Password: String
	+OlvidarContrasenia()
	+ValidarUsuario()
}

class CrearCuenta{
	-Nombre: String
	-Apellidos: String
	-Email: String
	-Telefono: int
	+Validar_cuenta()
}

class Admin{
	-Usuario_admin: String
	-Email: String
	+Actualizar_tienda()
}

class TiendaMain{
	-Buscador: String
	+Productos_oferta()
	+Favoritos()
	+Buscador()
	+Top_ventas()
}

class Productos{
	+Tallas()
	+Favoritos()
	+Color()
	+Descripcion()
	+Comentarios()
	+Valoraciones()
}

class Categoria{
	+Categorias_ropa()
}

class Cuenta{
	+Perfil()
	+Ajustes()
}

class Carrito{
	-n_productos: int
	+Productos_oferta()
	+Seguir_comprando()
}

class Pago{
	-Tarjeta: int
	-Caducidad: int
	-CVV: int
	-Nombre: int
	-Direccion: string
	-Descuento: string
	+Calcular_coste()
	+Finalizar()
	+Opciones_pago()
}
```
