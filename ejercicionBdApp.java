
public class ejercicionBdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		funcionesBD db = new funcionesBD();
		
		db.connectionDB();
		
		/*---------------------------------Ejercicio 1--------------------------------------*/
		//db.createDB("TiendaInformatica");
		
		
		/*String query="CREATE TABLE `fabricantes` (`codigo` int NOT NULL AUTO_INCREMENT, `nombre` varchar(100) NOT NULL, PRIMARY KEY (`codigo`));";
		String query1 ="CREATE TABLE `articulos` (`CODIGO` int NOT NULL, `NOMBRE` varchar(255) NOT NULL,`PRECIO` decimal(10,0) NOT NULL,`FABRICANTE` int NOT NULL,PRIMARY KEY (`CODIGO`),KEY(`FABRICANTE`), foreign key(FABRICANTE)references fabricantes(codigo));";
				
		db.createTable("TiendaInformatica",query);
		db.createTable("TiendaInformatica",query1);
		*/
		//String datos="INSERT INTO fabricantes(nombre)values('sony'),('phillips'),('lg'),('siemens'),('samsung');";
		//String datos1="INSERT INTO articulos(codigo, nombre, precio, fabricante)values(1, 'smartphone', 150, 1), (2, 'nevera', 350, 2), (3, 'microondas', 350, 3), (4, 'tele', 350, 4), (5, 'tostadora', 60, 5);";	
		
		//db.insertData("TiendaInformatica", datos);
		//db.insertData("TiendaInformatica", datos1);
		
		/*---------------------------------Ejercicio 2----------------------------------------*/
		/*
		db.createDB("Empleados");
		
		String query="CREATE TABLE `departamentos` (\r\n"
				+ "  `CODIGO` int NOT NULL,\r\n"
				+ "  `NOMBRE` varchar(255) NOT NULL,\r\n"
				+ "  `PRESUPUESTO` decimal(10,0) NOT NULL,\r\n"
				+ "  PRIMARY KEY (`CODIGO`))";
		String query1="CREATE TABLE `empleados` (\r\n"
				+ "  `DNI` int NOT NULL,\r\n"
				+ "  `NOMBRE` varchar(255) NOT NULL,\r\n"
				+ "  `APELLIDOS` varchar(255) NOT NULL,\r\n"
				+ "  `DEPARTAMENTO` int NOT NULL,\r\n"
				+ "  PRIMARY KEY (`DNI`),\r\n"
				+ "  KEY `DEPARTAMENTO` (`DEPARTAMENTO`),\r\n"
				+ "  CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`DEPARTAMENTO`) REFERENCES `departamentos` (`CODIGO`)\r\n"
				+ ")";
		db.createTable("Empleados",query);
		db.createTable("Empleados",query1);
		*/
		
		//String datos="INSERT INTO departamentos(codigo, nombre, presupuesto)values(1, 'dept1', 150), (2, 'dept2', 350), (3, 'dept3', 350), (4, 'dept4', 350), (5, 'dept5', 60);";
		//String datos1="INSERT INTO empleados(dni, nombre, apellidos, departamento)values('458789856', 'izan', 'abad', 1), ('65874589', 'julio', 'perez', 2), ('587478744', 'pedro', 'maldonado', 3), ('032014100', 'alberto', 'abad', 4), ('625145455', 'jesus', 'nado', 5);";
		
		
		//db.insertData("Empleados", datos);
		//db.insertData("Empleados", datos1);
		
		/*---------------------------------Ejercicio 3----------------------------------------*/
		
		//db.createDB("Almacenes");
		/*
		String query="CREATE TABLE `almacenes` (\r\n"
				+ "  `codigo` int NOT NULL AUTO_INCREMENT,\r\n"
				+ "  `lugar` varchar(100) NOT NULL,\r\n"
				+ "  `capacidad` int NOT NULL,\r\n"
				+ "  PRIMARY KEY (`codigo`)\r\n"
				+ ");";
		
		String query1="CREATE TABLE `cajas` (\r\n"
				+ "  `numReferencia` char(5) NOT NULL,\r\n"
				+ "  `contenido` varchar(100) NOT NULL,\r\n"
				+ "  `valor` int NOT NULL,\r\n"
				+ "  `almacen` int NOT NULL,\r\n"
				+ "  PRIMARY KEY (`numReferencia`),KEY(almacen), foreign key(almacen)references almacenes(codigo)"
				+ ");";
		*/
		//db.createTable("Almacenes",query);
		//db.createTable("Almacenes",query1);
		/*
		String datos="INSERT INTO almacenes(codigo, lugar, capacidad)values(1, 'bcn', 150), (2, 'vlc', 350), (3, 'reus', 350), (4, 'albacete', 350), (5, 'madrid', 60);";
		String datos1="INSERT INTO cajas(numReferencia, contenido, valor, almacen)values(1, 'tuerca', 20, 1), (2, 'tornillo', 10, 2), (3, 'rosca', 20, 3), (4, 'grifo', 20, 4), (5, 'pared', 50, 5);";
		
		//db.insertData("Almacenes", datos);
		db.insertData("Almacenes", datos1);
		*/
		
		/*---------------------------------Ejercicio 4------------------------------------------*/
		//db.createDB("Peliculas");
		
		/*
		String query="CREATE TABLE `peliculas` (\r\n"
				+ "  `codigo` int unsigned NOT NULL AUTO_INCREMENT,\r\n"
				+ "  `nombre` varchar(100) NOT NULL,\r\n"
				+ "  `calificacionEdad` int NOT NULL,\r\n"
				+ "  PRIMARY KEY (`codigo`)\r\n"
				+ ");";
		String query1="CREATE TABLE `salas` (\r\n"
				+ "  `codigo` int unsigned NOT NULL AUTO_INCREMENT,\r\n"
				+ "  `nombre` varchar(100) NOT NULL,\r\n"
				+ "  `pelicula` int unsigned not NULL,\r\n"
				+ "  PRIMARY KEY (`codigo`), key(pelicula), foreign key(pelicula) references peliculas(codigo)"
				+ ")";
		
		db.createTable("Peliculas",query);
		db.createTable("Peliculas",query1);
		*/
	//	String datos="INSERT INTO peliculas(nombre, calificacionEdad)values('Harry potter 1', 12), ('Harry potter 2', 12), ('Harry potter 3', 12), ('Harry potter 4', 12), ('Harry potter 5', 12);";
	//	String datos1="INSERT INTO salas(nombre, pelicula)values('Sala 1', 1), ('Sala 1', 2), ('Sala 1', 3), ('Sala 1', 4), ('Sala 1', 5);";

	//	db.insertData("Peliculas", datos);
	//	db.insertData("Peliculas", datos1);
		
		/*---------------------------------Ejercicio 5------------------------------------------*/
		/*
		db.createDB("Directores");
		
		String query="CREATE TABLE `despachos` (\r\n"
				+ "  `numero` int unsigned NOT NULL AUTO_INCREMENT,\r\n"
				+ "  `capacidad` int unsigned NOT NULL,\r\n"
				+ "  PRIMARY KEY (`numero`)\r\n"
				+ ")";
		String query1="CREATE TABLE `directores` (\r\n"
				+ "  `dni` varchar(8) NOT NULL,\r\n"
				+ "  `nomApels` varchar(255) NOT NULL,\r\n"
				+ "  `dniJefe` varchar(8) NOT NULL,\r\n"
				+ "  `despacho` int unsigned NOT NULL,\r\n"
				+ "  PRIMARY KEY (`dni`),\r\n"
				+ "  KEY `dniJefe` (`dniJefe`,`despacho`),\r\n"
				+ "  KEY `despacho` (`despacho`),\r\n"
				+ "  CONSTRAINT `directores_ibfk_1` FOREIGN KEY (`dniJefe`) REFERENCES `directores` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,\r\n"
				+ "  CONSTRAINT `directores_ibfk_2` FOREIGN KEY (`despacho`) REFERENCES `despachos` (`numero`) ON DELETE CASCADE ON UPDATE CASCADE\r\n"
				+ ")";
		
		db.createTable("Directores",query);
		db.createTable("Directores",query1);
		
		String datos="INSERT INTO despachos(capacidad)values(10), (20), (15), (12), (50);";
		String datos1="INSERT INTO directores(dni,nomApels,dnijefe,despacho)values('45874877','David','45874877',1), ('6588','jose','45874877',1), ('254879','Pedro','45874877',1), ('3325487','Izan','45874877',1), ('3200210','Jesus','45874877',1);";
		
		db.insertData("Directores", datos);
		db.insertData("Directores", datos1);
		*/
		
		/*---------------------------------Ejercicio 6------------------------------------------*/

		//db.createDB("Proveedores");
		/*
		String query="CREATE TABLE `piezas` (\r\n"
				+ "  `codigo` int unsigned NOT NULL AUTO_INCREMENT,\r\n"
				+ "  `nombre` varchar(100) NOT NULL,\r\n"
				+ "  PRIMARY KEY (`codigo`)\r\n"
				+ ");";
				*/
		/*String query1="CREATE TABLE `proveedores` (\r\n"
				+ "  `id` int(4) NOT NULL auto_increment,\r\n"
				+ "  `nombre` varchar(100) NOT NULL,\r\n"
				+ "  PRIMARY KEY (`id`)\r\n"
				+ ");";
		*/
		/*String query2="CREATE TABLE `suministra` (\r\n"
				+ "  `codigoPieza` int unsigned NOT NULL AUTO_INCREMENT,\r\n"
				+ "  `idProveedor` int(4) NOT NULL,\r\n"
				+ "  `precio` int unsigned NOT NULL,\r\n"
				+ "  PRIMARY KEY (`codigoPieza`,`idProveedor`),\r\n"
				+ "  KEY `idProveedor` (`idProveedor`),\r\n"
				+ "  CONSTRAINT `suministra_ibfk_1` FOREIGN KEY (`codigoPieza`) REFERENCES `piezas` (`codigo`),\r\n"
				+ "  CONSTRAINT `suministra_ibfk_2` FOREIGN KEY (`idProveedor`) REFERENCES `proveedores` (`id`)\r\n"
				+ ");";
		*/
		//db.createTable("Proveedores",query);
		//db.createTable("Proveedores",query1);
		//db.createTable("Proveedores",query2);
		/*
		
		String datos="INSERT INTO proveedores(nombre)values('Porveedor 1'), ('Porveedor 2'), ('Porveedor 3'), ('Porveedor 4'), ('Porveedor 5');";
		String datos1="INSERT INTO piezas(nombre)values('rosca'), ('alicate'), ('tornillo'), ('rodamiento'), ('alicate');";
		String datos2="INSERT INTO suministra(codigopieza, idproveedor, precio)values(1,1,10), (2,2,10), (3,3,10), (4,4,10), (5,5,10);";
		
		db.insertData("Proveedores", datos);
		db.insertData("Proveedores", datos1);
		db.insertData("Proveedores", datos2);
		*/
		db.closeConnection();
		
	}

}
