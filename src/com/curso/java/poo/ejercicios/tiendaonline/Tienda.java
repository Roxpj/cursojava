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
		
		
		Libro libro1 = new Libro(0001, 15, 987531315, "Libro 1");
		Libro libro2 = new Libro(0002, 21, 987326882, "Libro 2");
		Libro libro3 = new Libro(0003, 10, 987874555, "Libro 3");
		Libro libro4 = new Libro(0004, 35, 987235416, "Libro 4");
		
		Movil movil1 = new Movil(0005, 150, "Motorola", "25J");
		Movil movil2 = new Movil(0006, 360, "Motorola", "27X");
		Movil movil3 = new Movil(0007, 200, "Samsung", "500");
		Movil movil4 = new Movil(0010, 600, "Samsung", "800");
		Movil movil5 = new Movil(0011, 990, "Motorola", "20N");
		
		Ropa ropa1 = new Ropa(0012, 20, "Pantalon", 36, "Negro");
		Ropa ropa2 = new Ropa(0013, 40, "Pantalon", 42, "Blanco");
		Ropa ropa3 = new Ropa(0014, 34, "Blusa", 46, "Verde");
		Ropa ropa4 = new Ropa(0015, 16, "Camiseta", 38, "Azul");

		Producto[] productos = { libro1, libro2, libro3, libro4, movil1, movil2, movil3, movil4, movil5, ropa1, ropa2, ropa3, ropa4 };
		
		Admin user1 = new Admin("admin1", "admin_01", "admin1234");
		Cliente user2 = new Cliente("cliente1", "cliente_01", "cliente1234");
		Usuario[] usuarios = {user1, user2 };
		
		Tienda tienda1= new Tienda("Tienda online", usuarios, productos);
		tienda1.abrirTienda();
		
	}
	
	public void abrirTienda() {
		login();
//		autorizacion();
		if(this.adminLogueado) {
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
				if(usuario.equalsIgnoreCase(usuariobbdd.getCodigoUsuario()) && contraseña.equals(usuariobbdd.getContraseña())) {
					this.usuarioLogueado = usuariobbdd;
					usuarioValidado = true;
					if(usuariobbdd instanceof Admin) {
						this.adminLogueado = true;
					}
				}
			}
			if(!usuarioValidado) {
				System.out.println("Usuario o contraseña incorrecta. Inténtelo de nuevo.");
			}
		}while(!usuarioValidado);
	}
	
//	public void autorizacion() {
//		if(this.usuarioLogueado instanceof Admin) {
//			this.adminLogueado = true;
//		}
//	}
	
	public void logout() {
		this.usuarioLogueado = null;
		this.adminLogueado = false;
		login();
	}
	
	public void menuAdmin() {
		Admin administrador = (Admin)this.usuarioLogueado;
		String[] indiceMenuAdmin = { "Crear producto", "Crear usuario", "Salir" };
		String eleccion = Utilidades.pintaMenuFormatoConRespuesta("Bienvenido "+this.usuarioLogueado.getNombre()+", ¿que desea realizar?", indiceMenuAdmin);
		do {
			if(eleccion.contains("producto")) {
				Producto[] productosActualizada = administrador.crearProducto(this.getProductos());
				this.productos = productosActualizada;
			}else {
				administrador.crearUsuario(this.getUsuarios());
			}
		}while(!eleccion.equals("Salir"));
		logout();
	}
	
	public void menuCliente() {
		Cliente cliente = (Cliente)getUsuarioLogueado();
		String[] indiceMenu1 = { "Libros", "Móviles", "Ropa", "Tu Cesta", "Salir"};
		String eleccion = "";
		do {
			eleccion = Utilidades.pintaMenuFormatoConRespuesta("Bienvenido "+this.usuarioLogueado.getNombre()+", seleccione una categoría.", indiceMenu1);
			
			if(eleccion.equals("Libros")) {
				System.out.println("Categoría Libros:");
				System.out.println("\tNºRef    Título      ISBN     Precio");
				for(Producto producto : this.productos) {
					if(producto instanceof Libro) {
						System.out.println("\t"+producto.toString());
					}
				}
				seleccionProducto(cliente);
				
			}else if(eleccion.equals("Móviles")) {
				System.out.println("Categoría Móviles:");
				System.out.println("\tNºRef    Marca      Modelo     Precio");
				for(Producto producto : this.productos) {
					if(producto instanceof Movil) {
						System.out.println("\t"+producto.toString());
					}
				}
				seleccionProducto(cliente);
				
			}else if(eleccion.equals("Ropa")){
				System.out.println("Categoría Ropa:");
				System.out.println("\tNºRef    Prenda     Talla    Color     Precio");
				for(Producto producto : this.productos) {
					if(producto instanceof Ropa) {
						System.out.println("\t"+producto.toString());
					}
				}
				seleccionProducto(cliente);
			}else if(eleccion.equals("Tu Cesta")) {
				double totalCarrito = cliente.mostrarCarrito();
				//TODO añadir opcion borrar artículos de la cesta
				boolean pagarOVolver = Utilidades.pideBoolean("Elija una opcion: [Pagar/Volver]", "Pagar");
				if(pagarOVolver){
					cliente.pagarCarrito(totalCarrito);
				}
			}
		}while(!eleccion.equals("Salir"));
		logout();
	}
	
	public void seleccionProducto(Cliente cliente) {
		boolean añadidoCesta = false;
		int seleccion = Utilidades.pideDatoNumerico("¿Qué artículo deseas añadir a tu cesta? Indica su número de referencia:");
		for(Producto producto : productos) {
			if(producto.getRef()==seleccion) {
				for(int i=0; i<cliente.getCarritoCompra().length ; i++) {
					if(cliente.getCarritoCompra()[i]==null) {
						cliente.getCarritoCompra()[i] = producto;
						añadidoCesta = true;
						break;
					}
				}
				if (!añadidoCesta) {
					System.out.println("No tienes más hueco en tu cesta de la compra, no se puede agregar el artículo. Paga los artículos de tu cesta.");
				
				}
			}
		}
		if(añadidoCesta) {
			boolean decision = Utilidades.pideBoolean("¿Deseas añadir otro artículo de esta categoría a tu carrito? [si/no]", "si");
			if(decision) {
				seleccionProducto(cliente);
			}	
		}
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