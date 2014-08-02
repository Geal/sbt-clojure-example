(ns hello
 (:gen-class :methods [#^{:static true} [printhello [] void]])
)

(defn -printhello []
  (println "Hello world from Clojure!"))
