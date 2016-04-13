(ns test-servlet.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] (do (.start (Thread. (do (Thread/sleep 5000)
                                       (println "From the dead!"))))
                  "Hello World"))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
