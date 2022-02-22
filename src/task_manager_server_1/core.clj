(ns task-manager-server-1.core
  (:require [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [org.httpkit.server :as server]
            [compojure.core :refer [defroutes GET PUT DELETE POST]]
            ))


(defroutes app-routes
  (GET "/" [] 
    (println "HI")
    "Hello Worasdfld")
  (route/not-found "Not Found"))


(def app
  (wrap-defaults app-routes site-defaults))

(defn -main
  [& args]
  (server/run-server app {:port (Integer/parseInt "3030")})
  (println "We are up"))
