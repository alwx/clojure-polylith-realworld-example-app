(ns dev.server
  (:require [clojure.realworld.rest-api.main :as main]))

(defn start! [port]
  (main/start! port))

(defn stop! []
  (main/stop!))

(defn run [opts]
  (start! 6003))