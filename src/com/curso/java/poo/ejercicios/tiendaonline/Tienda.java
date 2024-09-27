package com.curso.java.poo.ejercicios.tiendaonline;

import com.curso.java.utils.Utilidades;

public class Tienda {

	private String nombre;
	private Usuario[] usuarios;
	private Producto[] productos;
	private Usuario usuarioLogueado;
	private boolean adminLogueado;
	
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Tienda(String nombre, Usuario[] usuarios, Producto[] productos) {
		super();
		this.nombre = nombre;
		this.usuarios = usuarios;
		this.productos = productos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Usuario[] getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	public Producto[] getProductos() {
		return productos;
	}
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	public Usuario getUsuarioLogueado() {
		return usuarioLogueado;
	}
	public void setUsuarioLogueado(Usuario usuarioLogueado) {
		this.usuarioLogueado = usuarioLogueado;
	}
	public boolean isAdminLogueado() {
		return adminLogueado;
	}
	public void setAdminLogueado(boolean adminLogueado) {
		this.adminLogueado = adminLogueado;
	}

	public static void main(String[] args) {
		
		//TODO crear objetos, arrays y cambiar creación de la tienda
		Tienda tienda1= new Tienda("Tienda online");
		tienda1.abrirTienda();
		
	}
	
	public void abrirTienda() {
		login();
		autorizacion();
		if(adminLogueado) {
			menuAdmin();
		}else {
			menuCliente();
		}
	}
	
	public void login() {
		boolean usuarioValidado = false;
		System.out.println("Bienvenido, ingrese con su usuario y contraseña.");
		do {			
			String usuario = Utilidades.pideDatoString("Usuario:");
			String contraseña = Utilidades.pideDatoString("Contraseña:");
			
			for(Usuario usuariobbdd : this.getUsuarios()) {
				if(usuario.equalsIgnoreCase(usuariobbdd.getNombre()) && contraseña.equals(usuariobbdd.getContraseña())) {
					this.usuarioLogueado = usuariobbdd;
					usuarioValidado = true;
				}
			}
			if(usuarioValidado) {
				System.out.println("Usuario o contraseña incorrecta. Inténtelo de nuevo.");
			}
		}while(!usuarioValidado);
	}
	
	public void autorizacion() {
		if(this.usuarioLogueado instanceof Admin) {
			this.adminLogueado = true;
		}
	}
	
	public void logout() {
		usuarioLogueado = null;
		adminLogueado = false;
		login();
	}
	
	public void menuAdmin() {
		Admin administrador = (Admin)this.usuarioLogueado;
		String[] indiceMenuAdmin = { "Crear producto", "Crear usuario", "Salir" };
		String eleccion = Utilidades.pintaMenuFormatoConRespuesta("Bienvenido "+this.usuarioLogueado.getNombre()+", ¿que desea realizar?", indiceMenuAdmin);
		do {
			if(eleccion.contains("producto")) {
				administrador.crearProducto(this.getProductos());
			}else {
				administrador.crearUsuario(this.getUsuarios());
			}
		}while(eleccion.equals("Salir"));
		logout();
	}
	
	public void menuCliente() {
		String[] indiceMenu1 = { "Libros", "Móviles", "Ropa", "Salir"};
		String eleccion = Utilidades.pintaMenuFormatoConRespuesta("Bienvenido "+this.usuarioLogueado.getNombre()+", seleccione una categoría.", indiceMenu1);
		do {
			if(eleccion.equals("Libros")) {
				for(Producto producto : this.productos) {
					if(producto instanceof Libro) {
						System.out.println(producto.toString());
					}
				}
				
				
			}else if(eleccion.equals("Móviles")) {
				for(Producto producto : this.productos) {
					if(producto instanceof Movil) {
						System.out.println(producto.toString());
					}
				}
			}else {
				for(Producto producto : this.productos) {
					if(producto instanceof Ropa) {
						System.out.println(producto.toString());
					}
				}
			}
		}while(eleccion.equals("Salir"));
		logout();
	}
	
	public void mostrarCatalogo() {
		
	}
	
}

/*
Producto
ref
precio

Libro
	ISBN
	Titulo

Móvil
	Marca
	Modelo

Ropa
	talla
	color

Usuario
nombre
codigo_usuario
contraseña

Admin
	crearUsuarios

Cliente
	carritoCompra [10]
	vip
	pagar()
	

Tienda
nombre
usuarios [10] - Al menos 1 administrador
Productos


Pedir usuario y contraseña
Admin
Dar de alta producto
Dar de alta usuario (si tiene permisos)

Cliente
Tipos --> Seleccione --> Producto y cantidad(opcional)
Pagar
*/