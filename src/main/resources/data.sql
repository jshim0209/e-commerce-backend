INSERT INTO user_roles (user_role)
VALUES  ('ROLE_BUYER'),
('ROLE_SELLER'),
('ROLE_ADMIN');

INSERT INTO users (user_email, user_password, user_first_name, user_last_name, role_user_id, is_user_active)
VALUES
('jshim0209@hotmail.com', 'password', 'Jay', 'Shim', 1, true),
('buyer@email.com', '$2a$10$Z.LeqmZEqwoBKnjWWXA04.oYta1kpqvzPSOJsv1bdDWenG3yfPrrK', 'John', 'Doe', 1, true),
('tenzin@email.com', '$2a$10$Z.LeqmZEqwoBKnjWWXA04.oYta1kpqvzPSOJsv1bdDWenG3yfPrrK', 'Tenzin', 'Chandrakant', 1, true),
('seller@email.com', '$2a$10$Z.LeqmZEqwoBKnjWWXA04.oYta1kpqvzPSOJsv1bdDWenG3yfPrrK', 'Jane', 'Doe', 2, true),
('admin@email.com', '$2a$10$Z.LeqmZEqwoBKnjWWXA04.oYta1kpqvzPSOJsv1bdDWenG3yfPrrK', 'Aruna', 'Pero', 3, true);

INSERT INTO product_category (category_name)
VALUES
('Classics'),
('Trucks'),
('Futuristics'),
('Flying Cars');

-- -----------------------------------------------------
-- Flying Cars
-- -----------------------------------------------------z
INSERT INTO products (name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES
('Bell Nexus', 'The most famous flying car model came back!!', 'assets/images/products/flyingCar/flyingCar_bellNexus.png', 1, 100, 144899.99, 4, NOW()),
('O7 Antelope', 'The award winning compact & economic model!!', 'assets/images/products/flyingCar/flyingCar_O7-antelope.png', 1, 100, 144899.99, 4, NOW()),
('Red Lobster', 'The most famous flying car model came back!!', 'assets/images/products/flyingCar/flyingCar_red_lobster.png', 1, 100, 144899.99, 4, NOW()),
('SF-20', 'The award winning compact & economic model!!', 'assets/images/products/flyingCar/flyingCar_SF-20.png', 1, 100, 144899.99, 4, NOW()),
('Bell Nexus', 'The most famous flying car model came back!!', 'assets/images/products/flyingCar/flyingCar_bellNexus.png', 1, 100, 144899.99, 4, NOW()),
('O7 Antelope', 'The award winning compact & economic model!!', 'assets/images/products/flyingCar/flyingCar_O7-antelope.png', 1, 100, 144899.99, 4, NOW()),
('Red Lobster', 'The most famous flying car model came back!!', 'assets/images/products/flyingCar/flyingCar_red_lobster.png', 1, 100, 144899.99, 4, NOW()),
('SF-20', 'The award winning compact & economic model!!', 'assets/images/products/flyingCar/flyingCar_SF-20.png', 1, 100, 144899.99, 4, NOW()),
('Bell Nexus', 'The most famous flying car model came back!!', 'assets/images/products/flyingCar/flyingCar_bellNexus.png', 1, 100, 144899.99, 4, NOW()),
('O7 Antelope', 'The award winning compact & economic model!!', 'assets/images/products/flyingCar/flyingCar_O7-antelope.png', 1, 100, 144899.99, 4, NOW()),
('Red Lobster', 'The most famous flying car model came back!!', 'assets/images/products/flyingCar/flyingCar_red_lobster.png', 1, 100, 144899.99, 4, NOW()),
('SF-20', 'The award winning compact & economic model!!', 'assets/images/products/flyingCar/flyingCar_SF-20.png', 1, 100, 144899.99, 4, NOW()),
('Bell Nexus', 'The most famous flying car model came back!!', 'assets/images/products/flyingCar/flyingCar_bellNexus.png', 1, 100, 144899.99, 4, NOW()),
('O7 Antelope', 'The award winning compact & economic model!!', 'assets/images/products/flyingCar/flyingCar_O7-antelope.png', 1, 100, 144899.99, 4, NOW()),
('Red Lobster', 'The most famous flying car model came back!!', 'assets/images/products/flyingCar/flyingCar_red_lobster.png', 1, 100, 144899.99, 4, NOW()),
('SF-20', 'The award winning compact & economic model!!', 'assets/images/products/flyingCar/flyingCar_SF-20.png', 1, 100, 144899.99, 4, NOW()),
('Bell Nexus', 'The most famous flying car model came back!!', 'assets/images/products/flyingCar/flyingCar_bellNexus.png', 1, 100, 144899.99, 4, NOW()),
('O7 Antelope', 'The award winning compact & economic model!!', 'assets/images/products/flyingCar/flyingCar_O7-antelope.png', 1, 100, 144899.99, 4, NOW()),
('Red Lobster', 'The most famous flying car model came back!!', 'assets/images/products/flyingCar/flyingCar_red_lobster.png', 1, 100, 144899.99, 4, NOW()),
('SF-20', 'The award winning compact & economic model!!', 'assets/images/products/flyingCar/flyingCar_SF-20.png', 1, 100, 144899.99, 4, NOW()),
-- -----------------------------------------------------
-- Trucks
-- -----------------------------------------------------
('Chiayi', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_chiayi.png', 1, 100, 144899.99, 2, NOW()),
('Cybertruck 3', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_cyberTruck.png', 1, 100, 144899.99, 2, NOW()),
('Gigante', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_gigante.png', 1, 100, 144899.99, 2, NOW()),
('Rivian', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_rivian.png', 1, 100, 144899.99, 2, NOW()),
('Slick', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_slick.png', 1, 100, 144899.99, 2, NOW()),
('Tesla X4', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_tesla_x4.png', 1, 100, 144899.99, 2, NOW()),
('Chiayi', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_chiayi.png', 1, 100, 144899.99, 2, NOW()),
('Cybertruck 3', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_cyberTruck.png', 1, 100, 144899.99, 2, NOW()),
('Gigante', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_gigante.png', 1, 100, 144899.99, 2, NOW()),
('Rivian', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_rivian.png', 1, 100, 144899.99, 2, NOW()),
('Slick', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_slick.png', 1, 100, 144899.99, 2, NOW()),
('Tesla X4', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_tesla_x4.png', 1, 100, 144899.99, 2, NOW()),
('Chiayi', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_chiayi.png', 1, 100, 144899.99, 2, NOW()),
('Cybertruck 3', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_cyberTruck.png', 1, 100, 144899.99, 2, NOW()),
('Gigante', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_gigante.png', 1, 100, 144899.99, 2, NOW()),
('Rivian', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_rivian.png', 1, 100, 144899.99, 2, NOW()),
('Slick', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_slick.png', 1, 100, 144899.99, 2, NOW()),
('Tesla X4', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_tesla_x4.png', 1, 100, 144899.99, 2, NOW()),
('Chiayi', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_chiayi.png', 1, 100, 144899.99, 2, NOW()),
('Cybertruck 3', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_cyberTruck.png', 1, 100, 144899.99, 2, NOW()),
('Gigante', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_gigante.png', 1, 100, 144899.99, 2, NOW()),
('Rivian', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_rivian.png', 1, 100, 144899.99, 2, NOW()),
('Slick', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_slick.png', 1, 100, 144899.99, 2, NOW()),
('Tesla X4', 'The notorious cybertruck is back!!', 'assets/images/products/truck/truck_tesla_x4.png', 1, 100, 144899.99, 2, NOW()),
-- -----------------------------------------------------
-- Futuristic
-- -----------------------------------------------------
('Audi Fnatic', 'The evolutionary design!!', 'assets/images/products/futuristic/futuristic_audi_fnatic.png', 1, 100, 144899.99, 3, NOW()),
('Bilt', 'You might want this one!!', 'assets/images/products/futuristic/futuristic_bilt.png', 1, 100, 144899.99, 3, NOW()),
('Bukari', 'Futuristic design with a drop of classic!!', 'assets/images/products/futuristic/futuristic_bukari.png', 1, 100, 144899.99, 3, NOW()),
('Rodeo', 'The evolutionary design!!', 'assets/images/products/futuristic/futuristic_rodeo.png', 1, 100, 144899.99, 3, NOW()),
('String', 'Futuristic design with a drop of classic!!', 'assets/images/products/futuristic/futuristic_sting.png', 1, 100, 144899.99, 3, NOW()),
('Audi Fnatic', 'The evolutionary design!!', 'assets/images/products/futuristic/futuristic_audi_fnatic.png', 1, 100, 144899.99, 3, NOW()),
('Bilt', 'You might want this one!!', 'assets/images/products/futuristic/futuristic_bilt.png', 1, 100, 144899.99, 3, NOW()),
('Bukari', 'Futuristic design with a drop of classic!!', 'assets/images/products/futuristic/futuristic_bukari.png', 1, 100, 144899.99, 3, NOW()),
('Rodeo', 'The evolutionary design!!', 'assets/images/products/futuristic/futuristic_rodeo.png', 1, 100, 144899.99, 3, NOW()),
('String', 'Futuristic design with a drop of classic!!', 'assets/images/products/futuristic/futuristic_sting.png', 1, 100, 144899.99, 3, NOW()),
('Audi Fnatic', 'The evolutionary design!!', 'assets/images/products/futuristic/futuristic_audi_fnatic.png', 1, 100, 144899.99, 3, NOW()),
('Bilt', 'You might want this one!!', 'assets/images/products/futuristic/futuristic_bilt.png', 1, 100, 144899.99, 3, NOW()),
('Bukari', 'Futuristic design with a drop of classic!!', 'assets/images/products/futuristic/futuristic_bukari.png', 1, 100, 144899.99, 3, NOW()),
('Rodeo', 'The evolutionary design!!', 'assets/images/products/futuristic/futuristic_rodeo.png', 1, 100, 144899.99, 3, NOW()),
('String', 'Futuristic design with a drop of classic!!', 'assets/images/products/futuristic/futuristic_sting.png', 1, 100, 144899.99, 3, NOW()),
('Audi Fnatic', 'The evolutionary design!!', 'assets/images/products/futuristic/futuristic_audi_fnatic.png', 1, 100, 144899.99, 3, NOW()),
('Bilt', 'You might want this one!!', 'assets/images/products/futuristic/futuristic_bilt.png', 1, 100, 144899.99, 3, NOW()),
('Bukari', 'Futuristic design with a drop of classic!!', 'assets/images/products/futuristic/futuristic_bukari.png', 1, 100, 144899.99, 3, NOW()),
('Rodeo', 'The evolutionary design!!', 'assets/images/products/futuristic/futuristic_rodeo.png', 1, 100, 144899.99, 3, NOW()),
('String', 'Futuristic design with a drop of classic!!', 'assets/images/products/futuristic/futuristic_sting.png', 1, 100, 144899.99, 3, NOW()),
-- -----------------------------------------------------
-- Classics
-- -----------------------------------------------------
('Jeep Rubicon', 'The classic Jeep Rubicon!!', 'assets/images/products/classic/classic_jeep.png', 1, 100, 144899.99, 1, NOW()),
('Chevrolet Corvette', 'The classic Chevrolet Corvette!!', 'assets/images/products/classic/classic_chevrolet_corvette.png', 1, 100, 144899.99, 1, NOW()),
('Ferrari Daytona', 'Most wanted!!', 'assets/images/products/classic/classic_ferrari_daytona.png', 1, 100, 144899.99, 1, NOW()),
('Ferrari Enzo', 'Most wanted slick design!!', 'assets/images/products/classic/classic_ferrari_enzo.png', 1, 100, 144899.99, 1, NOW()),
('Lamborghini Aventador', 'The classic Jeep Rubicon!!', 'assets/images/products/classic/classic_lamborghini_aventador.png', 1, 100, 144899.99, 1, NOW()),
('Mercedes G Class', 'Most wanted slick design!!', 'assets/images/products/classic/classic_mercedes_g_class.png', 1, 100, 144899.99, 1, NOW()),
('Jeep Rubicon', 'The classic Jeep Rubicon!!', 'assets/images/products/classic/classic_jeep.png', 1, 100, 144899.99, 1, NOW()),
('Chevrolet Corvette', 'The classic Chevrolet Corvette!!', 'assets/images/products/classic/classic_chevrolet_corvette.png', 1, 100, 144899.99, 1, NOW()),
('Ferrari Daytona', 'Most wanted!!', 'assets/images/products/classic/classic_ferrari_daytona.png', 1, 100, 144899.99, 1, NOW()),
('Ferrari Enzo', 'Most wanted slick design!!', 'assets/images/products/classic/classic_ferrari_enzo.png', 1, 100, 144899.99, 1, NOW()),
('Lamborghini Aventador', 'The classic Jeep Rubicon!!', 'assets/images/products/classic/classic_lamborghini_aventador.png', 1, 100, 144899.99, 1, NOW()),
('Mercedes G Class', 'Most wanted slick design!!', 'assets/images/products/classic/classic_mercedes_g_class.png', 1, 100, 144899.99, 1, NOW()),
('Jeep Rubicon', 'The classic Jeep Rubicon!!', 'assets/images/products/classic/classic_jeep.png', 1, 100, 144899.99, 1, NOW()),
('Chevrolet Corvette', 'The classic Chevrolet Corvette!!', 'assets/images/products/classic/classic_chevrolet_corvette.png', 1, 100, 144899.99, 1, NOW()),
('Ferrari Daytona', 'Most wanted!!', 'assets/images/products/classic/classic_ferrari_daytona.png', 1, 100, 144899.99, 1, NOW()),
('Ferrari Enzo', 'Most wanted slick design!!', 'assets/images/products/classic/classic_ferrari_enzo.png', 1, 100, 144899.99, 1, NOW()),
('Lamborghini Aventador', 'The classic Jeep Rubicon!!', 'assets/images/products/classic/classic_lamborghini_aventador.png', 1, 100, 144899.99, 1, NOW()),
('Mercedes G Class', 'Most wanted slick design!!', 'assets/images/products/classic/classic_mercedes_g_class.png', 1, 100, 144899.99, 1, NOW()),
('Jeep Rubicon', 'The classic Jeep Rubicon!!', 'assets/images/products/classic/classic_jeep.png', 1, 100, 144899.99, 1, NOW()),
('Chevrolet Corvette', 'The classic Chevrolet Corvette!!', 'assets/images/products/classic/classic_chevrolet_corvette.png', 1, 100, 144899.99, 1, NOW()),
('Ferrari Daytona', 'Most wanted!!', 'assets/images/products/classic/classic_ferrari_daytona.png', 1, 100, 144899.99, 1, NOW()),
('Ferrari Enzo', 'Most wanted slick design!!', 'assets/images/products/classic/classic_ferrari_enzo.png', 1, 100, 144899.99, 1, NOW()),
('Lamborghini Aventador', 'The classic Jeep Rubicon!!', 'assets/images/products/classic/classic_lamborghini_aventador.png', 1, 100, 144899.99, 1, NOW()),
('Mercedes G Class', 'Most wanted slick design!!', 'assets/images/products/classic/classic_mercedes_g_class.png', 1, 100, 144899.99, 1, NOW());