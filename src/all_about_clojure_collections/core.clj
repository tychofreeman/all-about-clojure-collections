(ns all-about-clojure-collections.core)

;; This is a list
'(1 2 3)

;; And this is a map
{"hi" "there"}

;; A map is a collection
(assert (coll? {"hi" "there"}))

;; but not a seq
(assert (seq? {"hi" "there"}))

;; And this is a set
#{1 2 3}

;; A set is a collection
(assert (coll? #{1 2 3}))

;; but not a seq
(assert (seq? #{1 2 3}))
