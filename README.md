<h1 align="center"><strong>Sistema de Gestión de Papelería 🏪</strong></h1>
    

<p align="center">
  <img src="https://img.shields.io/badge/Proyecto-Esperanza-00c4ff?logo=sparkles">
  <img src="https://img.shields.io/badge/Versión-1.0.0-00c4ff?logo=semver">
  <img src="https://img.shields.io/badge/Estado-Activo-00c4ff?logo=heartbeat">
  <img src="https://img.shields.io/badge/PRs-Welcome-00c4ff?logo=github">
</p>

Sistema de gestión desarrollado en Java SE con MySQL para la administración integral de una papelería, incluyendo manejo de clientes, empleados e inventario de productos.

## Características del Sistema

- **Gestión de Clientes**: CRUD completo para administración de clientes
- **Gestión de Empleados**: Control de personal y sus datos
- **Gestión de Productos (Insumos)**: Inventario completo de artículos de papelería
- **Interfaz Gráfica**: Sistema de ventanas intuitivo desarrollado en Java Swing
- **Base de Datos**: Persistencia de datos con MySQL

## Tecnologías Utilizadas

- **Lenguaje**: Java SE 8+
- **GUI**: Java Swing con NetBeans Forms
- **Base de Datos**: MySQL
- **Conectividad**: JDBC
- **IDE**: NetBeans (formularios .form)

##  Estructura del Proyecto

```
Project-Papeleria/
└── src/
    ├── bd/
    │   └── Conexion.java              # Conexión a base de datos
    ├── controlador/
    │   └── Metodo.java                # Controlador principal
    ├── modelo/
    │   ├── Cliente.java               # Modelo de Cliente
    │   ├── Empleado.java              # Modelo de Empleado
    │   └── Insumo.java                # Modelo de Producto/Insumo
    ├── vista/                         # Interfaces gráficas
    │   ├── Form_menuPrincipal.*       # Menú principal
    │   ├── Form_menuCliente.*         # Menú de clientes
    │   ├── Form_menuEmpleado.*        # Menú de empleados
    │   ├── Form_menuProducto.*        # Menú de productos
    │   ├── Form_agregar*.*            # Formularios de alta
    │   ├── Form_actualizar*.*         # Formularios de edición
    │   ├── Form_eliminar*.*           # Formularios de baja
    │   └── Form_lista*.*              # Listados y consultas
    └── imagen/                        # Recursos gráficos
```

##  Instalación y Configuración

### Prerrequisitos
- Java JDK 8 o superior
- MySQL Server
- NetBeans IDE (recomendado para los formularios)

### Configuración de Base de Datos

1. **Crear la base de datos**:
```sql
CREATE DATABASE papeleria;
USE papeleria;

-- Crear tablas (ejemplo)
CREATE TABLE clientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    telefono VARCHAR(20),
    direccion TEXT
);

CREATE TABLE empleados (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    cargo VARCHAR(50),
    salario DECIMAL(10,2),
    fecha_ingreso DATE
);

CREATE TABLE insumos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(50),
    precio DECIMAL(10,2),
    stock INT,
    descripcion TEXT
);
```

2. **Configurar conexión** en `Conexion.java`:
```java
// Actualizar credenciales de base de datos
private static final String URL = "jdbc:mysql://localhost:3306/papeleria";
private static final String USER = "tu_usuario";
private static final String PASSWORD = "tu_contraseña";
```

### Ejecutar el Proyecto

1. Abrir el proyecto en NetBeans
2. Configurar las librerías de MySQL JDBC
3. Ejecutar desde `Form_menuPrincipal.java`
##

## 📱 Funcionalidades del Sistema

### 👥 Gestión de Clientes
- ➕ **Agregar Cliente**: Registro de nuevos clientes
- 📝 **Actualizar Cliente**: Modificación de datos existentes
- 🗑️ **Eliminar Cliente**: Baja de clientes
- 📋 **Lista de Clientes**: Consulta y visualización

### 👨‍💼 Gestión de Empleados
- ➕ **Agregar Empleado**: Alta de personal
- 📝 **Actualizar Empleado**: Modificación de información
- 🗑️ **Eliminar Empleado**: Baja de empleados
- 📋 **Lista de Empleados**: Nómina completa

### 📦 Gestión de Productos (Insumos)
- ➕ **Agregar Producto**: Nuevos artículos al inventario
- 📝 **Actualizar Producto**: Modificación de precios/stock
- 🗑️ **Eliminar Producto**: Baja de productos
- 📋 **Lista de Productos**: Catálogo completo

## 🔄 Flujo de Navegación

```
Menú Principal
├── Gestión de Clientes
│   ├── Agregar Cliente
│   ├── Actualizar Cliente  
│   ├── Eliminar Cliente
│   └── Lista de Clientes
├── Gestión de Empleados
│   ├── Agregar Empleado
│   ├── Actualizar Empleado
│   ├── Eliminar Empleado
│   └── Lista de Empleados
└── Gestión de Productos
    ├── Agregar Producto
    ├── Actualizar Producto
    ├── Eliminar Producto
    └── Lista de Productos
```
#

### Menú Principal
![Menú Principal](https://github.com/Anys-VS/Project-Papeleria-LaUltimaEsperanza/blob/master/Imagenes%20Interfaz/Inicio.png?raw=true) 


### Gestión de Clientes
| Pantalla |
|----------|
| ![Registro Cliente](https://github.com/Anys-VS/Project-Papeleria-LaUltimaEsperanza/blob/master/Imagenes%20Interfaz/Registro%20Cliente%20.png?raw=true)


### Gestión de Empleados
| Pantalla |
|----------|
| ![Registro Empleado](https://github.com/Anys-VS/Project-Papeleria-LaUltimaEsperanza/blob/master/Imagenes%20Interfaz/Registro%20empleado.png?raw=true)

### Gestión de Productos
| Pantalla |
|----------|
| ![Gestión de Productos](https://github.com/Anys-VS/Project-Papeleria-LaUltimaEsperanza/blob/master/Imagenes%20Interfaz/Gestion%20de%20Productos.png?raw=true)



## 🏗️ Arquitectura del Sistema

### Modelo de Capas
```
┌─────────────────┐
│ Vista (Forms)   │  ← Interfaz gráfica Swing
├─────────────────┤
│ Controlador     │  ← Metodo.java (lógica)
├─────────────────┤  
│ Modelo          │  ← Cliente, Empleado, Insumo
├─────────────────┤
│ Base de Datos   │  ← MySQL + Conexion.java
└─────────────────┘
```

### Entidades Principales

**Cliente**
- ID, Nombre, Email, Teléfono, Dirección

**Empleado**  
- ID, Nombre, Cargo, Salario, Fecha de Ingreso

**Insumo (Producto)**
- ID, Nombre, Categoría, Precio, Stock, Descripción

## 👨‍💻 Autor

- Desarrollo del sistema de gestión

**Carolina Flores** 

**Benjamin Gonzáles** 

**Gonzalo Urtubia** 

**Ana María Vidal** 


---


