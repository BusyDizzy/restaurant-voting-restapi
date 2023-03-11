DELETE
FROM user_role;
DELETE
FROM vote;
DELETE
FROM restaurant;
DELETE
FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES ('User', 'user@yandex.ru', 'password'),
       ('Admin', 'admin@gmail.com', 'admin'),
       ('Guest', 'guest@gmail.com', 'guest');

INSERT INTO user_role (role, user_id)
VALUES ('USER', 100000),
       ('ADMIN', 100001),
       ('USER', 100002);


INSERT INTO restaurant(name, address)
VALUES ('Pizza Palace', '123 Main St'),
       ('Burger Joint', '456 Oak St'),
       ('Sushi Spot', '789 Maple Ave');

INSERT INTO menu(date_added, restaurant_id)
VALUES ('2023-03-06', 100003),
       ('2023-03-06', 100004),
       ('2023-03-06', 100005);


INSERT INTO dish(name, price, menu_id)
VALUES ('Pepperoni Pizza', 10.99, 100006),
       ('Coca Cola', 2.99, 100006),
       ('Cheeseburger', 8.99, 100006),
       ('Bacon Cheeseburger', 9.99, 100007),
       ('California Roll', 11.99, 100007),
       ('Spicy Tuna Roll', 12.99, 100008);

INSERT INTO vote(user_id, restaurant_id, vote_date)
VALUES (100000, 100003, '2023-03-06'),
       (100001, 100004, '2023-03-06'),
       (100002, 100003, '2023-03-06'),
       (100000, 100004, '2023-03-11'),
       (100001, 100004, '2023-03-11'),
       (100002, 100003, '2023-03-11');
