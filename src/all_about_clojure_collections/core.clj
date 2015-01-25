(ns all-about-clojure-collections.core)

;; This is a list
'(1 2 3)

;; And this is a map
{"hi" "there"}

;; A map is a collection
(assert (coll? {"hi" "there"}))

;; but not a seq
(assert (seq? {"hi" "there"}))
