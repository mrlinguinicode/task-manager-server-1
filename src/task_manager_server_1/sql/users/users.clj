(ns task_manager_server_1.sql.users.users
    (:require [huqsql.core :as hugsql]))

(hugsql/def-db-fns "task_manager_server_1/sql/users/users.sql")