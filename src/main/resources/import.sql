INSERT INTO users (email, pwd) VALUES ('account@debuggeandoieas.com', 'to_be_encoded');
INSERT INTO users (email, pwd) VALUES ('cards@debuggeandoieas.com', 'to_be_encoded');
INSERT INTO users (email, pwd) VALUES ('loans@debuggeandoieas.com', 'to_be_encoded');
INSERT INTO users (email, pwd) VALUES ('balance@debuggeandoieas.com', 'to_be_encoded');

INSERT INTO roles (role_name, id_user) VALUES ('ROLE_ADMIN', 1);      
INSERT INTO roles (role_name, id_user) VALUES ('ROLE_ADMIN', 2); 
INSERT INTO roles (role_name, id_user) VALUES ('ROLE_USER', 3); 
INSERT INTO roles (role_name, id_user) VALUES ('ROLE_USER', 4); 


INSERT INTO `propietario` (`nombre`, `telefono`) VALUES ('Juan Pérez', '1234567890');
INSERT INTO `propietario` (`nombre`, `telefono`) VALUES ('María García', '0987654321');
INSERT INTO `propietario` (`nombre`, `telefono`) VALUES ('Carlos López', '1122334455');
INSERT INTO `propietario` (`nombre`, `telefono`) VALUES ('Ana Martínez', '5544332211');
INSERT INTO `propietario` (`nombre`, `telefono`) VALUES ('Luis Rodríguez', '6677889900');
INSERT INTO `propietario` (`nombre`, `telefono`) VALUES ('Laura Sánchez', '9988776655');
INSERT INTO `propietario` (`nombre`, `telefono`) VALUES ('Pedro Gómez', '4433221100');
INSERT INTO `propietario` (`nombre`, `telefono`) VALUES ('Sofía Hernández', '6655443322');
INSERT INTO `propietario` (`nombre`, `telefono`) VALUES ('Pablo Díaz', '2200334455');
INSERT INTO `propietario` (`nombre`, `telefono`) VALUES ('Elena Ruiz', '5566778899');

INSERT INTO `estancias` (`habitaciones`, `baños`, `aseos`, `cocinas`, `caracteristicas`) VALUES (3, 2, 1, 1, 0);
INSERT INTO `estancias` (`habitaciones`, `baños`, `aseos`, `cocinas`, `caracteristicas`) VALUES (2, 1, 0, 1, 2);
INSERT INTO `estancias` (`habitaciones`, `baños`, `aseos`, `cocinas`, `caracteristicas`) VALUES (4, 3, 2, 2, 1);
INSERT INTO `estancias` (`habitaciones`, `baños`, `aseos`, `cocinas`, `caracteristicas`) VALUES (1, 1, 0, 0, 0);
INSERT INTO `estancias` (`habitaciones`, `baños`, `aseos`, `cocinas`, `caracteristicas`) VALUES (5, 4, 3, 1, 2);
INSERT INTO `estancias` (`habitaciones`, `baños`, `aseos`, `cocinas`, `caracteristicas`) VALUES (3, 2, 1, 1, 0);
INSERT INTO `estancias` (`habitaciones`, `baños`, `aseos`, `cocinas`, `caracteristicas`) VALUES (2, 1, 1, 1, 1);
INSERT INTO `estancias` (`habitaciones`, `baños`, `aseos`, `cocinas`, `caracteristicas`) VALUES (4, 3, 2, 1, 0);
INSERT INTO `estancias` (`habitaciones`, `baños`, `aseos`, `cocinas`, `caracteristicas`) VALUES (2, 1, 1, 1, 2);
INSERT INTO `estancias` (`habitaciones`, `baños`, `aseos`, `cocinas`, `caracteristicas`) VALUES (3, 2, 1, 1, 1);

INSERT INTO `zonas` (`nombre`) VALUES ('Zona Norte');
INSERT INTO `zonas` (`nombre`) VALUES ('Zona Sur');
INSERT INTO `zonas` (`nombre`) VALUES ('Zona Este');
INSERT INTO `zonas` (`nombre`) VALUES ('Zona Oeste');
INSERT INTO `zonas` (`nombre`) VALUES ('Centro');
INSERT INTO `zonas` (`nombre`) VALUES ('Zona Industrial');

INSERT INTO `oficina` (`nombre`, `direccion`) VALUES ('Oficina Central', 'Av. Principal #123');
INSERT INTO `oficina` (`nombre`, `direccion`) VALUES ('Sucursal Norte', 'Calle 1 #456');
INSERT INTO `oficina` (`nombre`, `direccion`) VALUES ('Sucursal Sur', 'Carrera 2 #789');

INSERT INTO `estado_inmueble` (`venta`, `alquiler`) VALUES (true, false);
INSERT INTO `estado_inmueble` (`venta`, `alquiler`) VALUES (false, true);
INSERT INTO `estado_inmueble` (`venta`, `alquiler`) VALUES (true, true);
INSERT INTO `estado_inmueble` (`venta`, `alquiler`) VALUES (false, false);
INSERT INTO `estado_inmueble` (`venta`, `alquiler`) VALUES (true, false);
INSERT INTO `estado_inmueble` (`venta`, `alquiler`) VALUES (false, true);
INSERT INTO `estado_inmueble` (`venta`, `alquiler`) VALUES (true, true);
INSERT INTO `estado_inmueble` (`venta`, `alquiler`) VALUES (false, false);
INSERT INTO `estado_inmueble` (`venta`, `alquiler`) VALUES (true, false);
INSERT INTO `estado_inmueble` (`venta`, `alquiler`) VALUES (false, true);

INSERT INTO `cliente` (`cedula`, `nombre`, `apellido`, `email`, `telefono`) VALUES (123456789, 'Gabriel', 'González', 'gabriel@example.com', '1122334455');
INSERT INTO `cliente` (`cedula`, `nombre`, `apellido`, `email`, `telefono`) VALUES (987654321, 'Valeria', 'Vásquez', 'valeria@example.com', '9988776655');
INSERT INTO `cliente` (`cedula`, `nombre`, `apellido`, `email`, `telefono`) VALUES (112233445, 'Santiago', 'Sánchez', 'santiago@example.com', '6677889900');
INSERT INTO `cliente` (`cedula`, `nombre`, `apellido`, `email`, `telefono`) VALUES (554433221, 'Camila', 'Cortés', 'camila@example.com', '4433221100');
INSERT INTO `cliente` (`cedula`, `nombre`, `apellido`, `email`, `telefono`) VALUES (667788990, 'Martín', 'Martínez', 'martin@example.com', '6655443322');
INSERT INTO `cliente` (`cedula`, `nombre`, `apellido`, `email`, `telefono`) VALUES (998877665, 'Luciana', 'López', 'luciana@example.com', '2200334455');
INSERT INTO `cliente` (`cedula`, `nombre`, `apellido`, `email`, `telefono`) VALUES (443322110, 'Mateo', 'Méndez', 'mateo@example.com', '5566778899');
INSERT INTO `cliente` (`cedula`, `nombre`, `apellido`, `email`, `telefono`) VALUES (665544332, 'Renata', 'Ramírez', 'renata@example.com', '5544332211');
INSERT INTO `cliente` (`cedula`, `nombre`, `apellido`, `email`, `telefono`) VALUES (220033445, 'Benjamín', 'Bustos', 'benjamin@example.com', '1234567890');
INSERT INTO `cliente` (`cedula`, `nombre`, `apellido`, `email`, `telefono`) VALUES (556677889, 'Isabella', 'Iglesias', 'isabella@example.com', '0987654321');

INSERT INTO `visitas` (`id_cliente`, `fecha`, `hora`, `comentario_cliente`) VALUES (1, '2024-04-10', '10:00:00', 'Interesado en comprar casa en Zona Norte');
INSERT INTO `visitas` (`id_cliente`, `fecha`, `hora`, `comentario_cliente`) VALUES (2, '2024-04-11', '11:30:00', 'Buscar opciones de alquiler de locales');
INSERT INTO `visitas` (`id_cliente`, `fecha`, `hora`, `comentario_cliente`) VALUES (3, '2024-04-12', '09:15:00', 'Visita programada para ver apartamentos en Centro');
INSERT INTO `visitas` (`id_cliente`, `fecha`, `hora`, `comentario_cliente`) VALUES (4, '2024-04-10', '14:00:00', 'Revisar disponibilidad de villas en Zona Sur');
INSERT INTO `visitas` (`id_cliente`, `fecha`, `hora`, `comentario_cliente`) VALUES (5, '2024-04-11', '15:45:00', 'Consulta sobre características de una casa en Zona Este');
INSERT INTO `visitas` (`id_cliente`, `fecha`, `hora`, `comentario_cliente`) VALUES (6, '2024-04-12', '12:20:00', 'Interesado en oficina en Oficina Central');
INSERT INTO `visitas` (`id_cliente`, `fecha`, `hora`, `comentario_cliente`) VALUES (7, '2024-04-10', '16:30:00', 'Verificar opciones de alquiler de pisos en Zona Oeste');
INSERT INTO `visitas` (`id_cliente`, `fecha`, `hora`, `comentario_cliente`) VALUES (8, '2024-04-11', '08:00:00', 'Revisar locales disponibles en Zona Industrial');
INSERT INTO `visitas` (`id_cliente`, `fecha`, `hora`, `comentario_cliente`) VALUES (9, '2024-04-12', '14:45:00', 'Visita para ver pisos en Centro');
INSERT INTO `visitas` (`id_cliente`, `fecha`, `hora`, `comentario_cliente`) VALUES (10, '2024-04-10', '17:45:00', 'Interesado en comprar una villa en Zona Norte');

INSERT INTO `locales` (`numero_puertas_entrada`, `diafano`, `acondicionado`, `id_zona`) VALUES (1, 1, 1, 1);
INSERT INTO `locales` (`numero_puertas_entrada`, `diafano`, `acondicionado`, `id_zona`) VALUES (2, 0, 1, 2);
INSERT INTO `locales` (`numero_puertas_entrada`, `diafano`, `acondicionado`, `id_zona`) VALUES (1, 1, 0, 3);
INSERT INTO `locales` (`numero_puertas_entrada`, `diafano`, `acondicionado`, `id_zona`) VALUES (3, 1, 1, 4);
INSERT INTO `locales` (`numero_puertas_entrada`, `diafano`, `acondicionado`, `id_zona`) VALUES (1, 0, 1, 5);
INSERT INTO `locales` (`numero_puertas_entrada`, `diafano`, `acondicionado`, `id_zona`) VALUES (2, 1, 1, 6);

INSERT INTO `casas` (`id_estancia`, `id_zona`) VALUES (1, 1);
INSERT INTO `casas` (`id_estancia`, `id_zona`) VALUES (2, 2);
INSERT INTO `casas` (`id_estancia`, `id_zona`) VALUES (3, 3);
INSERT INTO `casas` (`id_estancia`, `id_zona`) VALUES (4, 4);
INSERT INTO `casas` (`id_estancia`, `id_zona`) VALUES (5, 5);
INSERT INTO `casas` (`id_estancia`, `id_zona`) VALUES (6, 6);

INSERT INTO `villa` (`tamaño_parcela`, `urbanizacion`, `id_estancia`) VALUES (500.00, 'Villa Alta', 7);
INSERT INTO `villa` (`tamaño_parcela`, `urbanizacion`, `id_estancia`) VALUES (600.00, 'Villa Baja', 8);
INSERT INTO `villa` (`tamaño_parcela`, `urbanizacion`, `id_estancia`) VALUES (700.00, 'Villa del Mar', 9);
INSERT INTO `villa` (`tamaño_parcela`, `urbanizacion`, `id_estancia`) VALUES (800.00, 'Villa del Sol', 10);
INSERT INTO `villa` (`tamaño_parcela`, `urbanizacion`, `id_estancia`) VALUES (900.00, 'Villa Esperanza', 1);
INSERT INTO `villa` (`tamaño_parcela`, `urbanizacion`, `id_estancia`) VALUES (1000.00, 'Villa Feliz', 2);


INSERT INTO `pisos` (`id_estancia`, `id_zona`) VALUES (8, 1);
INSERT INTO `pisos` (`id_estancia`, `id_zona`) VALUES (9, 2);
INSERT INTO `pisos` (`id_estancia`, `id_zona`) VALUES (10, 3);
INSERT INTO `pisos` (`id_estancia`, `id_zona`) VALUES (1, 4);
INSERT INTO `pisos` (`id_estancia`, `id_zona`) VALUES (2, 5);
INSERT INTO `pisos` (`id_estancia`, `id_zona`) VALUES (3, 6);


INSERT INTO `tipo_inmueble` (`superficie`, `direccion`, `id_casa`, `id_villa`, `id_local`, `id_pisos`) VALUES (120.00, 'Calle 1 #123', 1, NULL, NULL, NULL);
INSERT INTO `tipo_inmueble` (`superficie`, `direccion`, `id_casa`, `id_villa`, `id_local`, `id_pisos`) VALUES (80.00, 'Av. Principal #456', NULL, 1, NULL, NULL);
INSERT INTO `tipo_inmueble` (`superficie`, `direccion`, `id_casa`, `id_villa`, `id_local`, `id_pisos`) VALUES (200.00, 'Carrera 2 #789', NULL, NULL, 1, NULL);
INSERT INTO `tipo_inmueble` (`superficie`, `direccion`, `id_casa`, `id_villa`, `id_local`, `id_pisos`) VALUES (150.00, 'Calle 3 #1011', NULL, NULL, NULL, 1);
INSERT INTO `tipo_inmueble` (`superficie`, `direccion`, `id_casa`, `id_villa`, `id_local`, `id_pisos`) VALUES (180.00, 'Av. Central #1213', 2, NULL, NULL, NULL);
INSERT INTO `tipo_inmueble` (`superficie`, `direccion`, `id_casa`, `id_villa`, `id_local`, `id_pisos`) VALUES (100.00, 'Carrera 4 #1415', NULL, 2, NULL, NULL);
INSERT INTO `tipo_inmueble` (`superficie`, `direccion`, `id_casa`, `id_villa`, `id_local`, `id_pisos`) VALUES (250.00, 'Av. Norte #1617', NULL, NULL, 2, NULL);
INSERT INTO `tipo_inmueble` (`superficie`, `direccion`, `id_casa`, `id_villa`, `id_local`, `id_pisos`) VALUES (200.00, 'Calle Sur #1819', NULL, NULL, NULL, 2);
INSERT INTO `tipo_inmueble` (`superficie`, `direccion`, `id_casa`, `id_villa`, `id_local`, `id_pisos`) VALUES (220.00, 'Carrera Este #2021', 3, NULL, NULL, NULL);
INSERT INTO `tipo_inmueble` (`superficie`, `direccion`, `id_casa`, `id_villa`, `id_local`, `id_pisos`) VALUES (130.00, 'Av. Oeste #2223', NULL, 3, NULL, NULL);

INSERT INTO `inmuebles` (`numero_referencia`, `id_tipo_inmueble`, `id_estado`, `precio`, `id_propietario`, `llaves`, `id_oficina`, `id_visitas`) VALUES ('REF-001', 1, 1, 150000.00, 1, 1, 1, 1);
INSERT INTO `inmuebles` (`numero_referencia`, `id_tipo_inmueble`, `id_estado`, `precio`, `id_propietario`, `llaves`, `id_oficina`, `id_visitas`) VALUES ('REF-002', 2, 2, 800.00, 2, 1, 2, 2);
INSERT INTO `inmuebles` (`numero_referencia`, `id_tipo_inmueble`, `id_estado`, `precio`, `id_propietario`, `llaves`, `id_oficina`, `id_visitas`) VALUES ('REF-003', 3, 3, 250000.00, 3, 1, 1, 3);
INSERT INTO `inmuebles` (`numero_referencia`, `id_tipo_inmueble`, `id_estado`, `precio`, `id_propietario`, `llaves`, `id_oficina`, `id_visitas`) VALUES ('REF-004', 4, 4, 50000.00, 4, 1, 2, 4);
INSERT INTO `inmuebles` (`numero_referencia`, `id_tipo_inmueble`, `id_estado`, `precio`, `id_propietario`, `llaves`, `id_oficina`, `id_visitas`) VALUES ('REF-005', 5, 5, 300000.00, 5, 1, 1, 5);
INSERT INTO `inmuebles` (`numero_referencia`, `id_tipo_inmueble`, `id_estado`, `precio`, `id_propietario`, `llaves`, `id_oficina`, `id_visitas`) VALUES ('REF-006', 6, 6, 1200.00, 6, 1, 2, 6);
INSERT INTO `inmuebles` (`numero_referencia`, `id_tipo_inmueble`, `id_estado`, `precio`, `id_propietario`, `llaves`, `id_oficina`, `id_visitas`) VALUES ('REF-007', 7, 7, 200000.00, 7, 1, 1, 7);
INSERT INTO `inmuebles` (`numero_referencia`, `id_tipo_inmueble`, `id_estado`, `precio`, `id_propietario`, `llaves`, `id_oficina`, `id_visitas`) VALUES ('REF-008', 8, 8, 1000.00, 8, 1, 2, 8);
INSERT INTO `inmuebles` (`numero_referencia`, `id_tipo_inmueble`, `id_estado`, `precio`, `id_propietario`, `llaves`, `id_oficina`, `id_visitas`) VALUES ('REF-009', 9, 9, 180000.00, 9, 1, 1, 9);
INSERT INTO `inmuebles` (`numero_referencia`, `id_tipo_inmueble`, `id_estado`, `precio`, `id_propietario`, `llaves`, `id_oficina`, `id_visitas`) VALUES ('REF-010', 10, 10, 600.00, 10, 1, 2, 10);

