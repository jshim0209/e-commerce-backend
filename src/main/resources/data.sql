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