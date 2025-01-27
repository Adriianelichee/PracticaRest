-- Crear la tabla productos si no existe
CREATE TABLE IF NOT EXISTS productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    stock INT NOT NULL
);

-- Insertar datos de ejemplo
INSERT INTO productos (nombre, precio, stock) VALUES
('Laptop HP', 799.99, 50),
('Smartphone Samsung', 599.99, 100),
('Auriculares Sony', 149.99, 200),
('Tablet Apple', 399.99, 75),
('Monitor LG', 249.99, 60),
('Teclado Mecánico', 89.99, 150),
('Ratón Inalámbrico', 29.99, 300),
('Impresora Epson', 179.99, 40),
('Disco Duro Externo', 79.99, 120),
('Cámara Web Logitech', 69.99, 80);