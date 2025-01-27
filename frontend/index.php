<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listado de Productos</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Listado de Productos</h1>
    <?php
    $url = 'http://springapp:8080/api/products';
    $json = file_get_contents($url);
    $products = json_decode($json, true);

    if ($products === null && json_last_error() !== JSON_ERROR_NONE) {
        echo "<p>Error al obtener los productos: " . json_last_error_msg() . "</p>";
    } elseif (empty($products)) {
        echo "<p>No se encontraron productos.</p>";
    } else {
        echo "<table>";
        echo "<tr><th>ID</th><th>Nombre</th><th>Precio</th><th>Stock</th></tr>";
        foreach ($products as $product) {
            echo "<tr>";
            echo "<td>" . $product['id'] . "</td>";
            echo "<td>" . $product['nombre'] . "</td>";
            echo "<td>" . $product['precio'] . "</td>";
            echo "<td>" . $product['stock'] . "</td>";
            echo "</tr>";
        }
        echo "</table>";
    }
    ?>
</body>
</html>