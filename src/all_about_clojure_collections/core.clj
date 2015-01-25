(ns all-about-clojure-collections.core)

;; This is a list
'(1 2 3)

;; You can access elements in the list
(nth '(1 2 3) 2)

;; and in a vector
(nth [1 2 3] 2)
(get [1 2 3] 2)
([1 2 3] 2)
