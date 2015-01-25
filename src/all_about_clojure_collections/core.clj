(ns all-about-clojure-collections.core)

;; This is a list
'(1 2 3)

;; Often, you'll want to consume a sequence in it's entirety
(map    inc   '(1 2 3 4 5 6))
(map    first '([1 2] [2 3] [3 4] [4 5] [5 6]))
(filter even? '(1 2 3 4 5 6))
