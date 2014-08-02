(ns sub.num
 (:gen-class :methods [#^{:static true} [add [int int] int]])
)

(defn -add [a b]
  (+ a b)
)
