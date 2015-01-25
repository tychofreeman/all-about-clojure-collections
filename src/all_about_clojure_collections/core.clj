(ns all-about-clojure-collections.core)

;; This is a list
'(1 2 3)

;; And it's a collection
(assert (coll? '(1 2 3)))

;; And it's a sequence
(assert (seq? '(1 2 3)))

;; Vectors are collections
(assert (coll? [1 2 3]))

