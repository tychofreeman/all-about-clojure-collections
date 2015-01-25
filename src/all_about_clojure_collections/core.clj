(ns all-about-clojure-collections.core)

;; This is a list
'(1 2 3)

;; For any sequence, you can get first
(first '(1 2 3))

;; and you can get the rest
(rest '(1 2 3))

;; And for any collection, you can know if it's empty
(empty? '())
(empty? '(1 2 3))
