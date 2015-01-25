(ns all-about-clojure-collections.core)

;; This is a list
'(1 2 3)

;; This is a vector
[1 2 3]

;; This is the same vector
(vector 1 2 3)

;; Don't worry; there's nothing confusing here...
(assert (= '(1 2 3) [1 2 3]))
