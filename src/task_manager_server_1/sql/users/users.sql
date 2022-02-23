-- :name user-login :!
-- :doc add new user to database
insert into user (`name`, `password`, email)
values (:name, :password, :email )