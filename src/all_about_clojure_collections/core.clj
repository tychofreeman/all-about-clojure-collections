(ns all-about-clojure-collections.core)

;; This is a list
'(1 2 3)

;; Often, you'll want to consume a sequence in it's entirety
(map    inc   '(1 2 3 4 5 6))
(map    first '([1 2] [2 3] [3 4] [4 5] [5 6]))
(filter even? '(1 2 3 4 5 6))

;; Or your may want to transform it into another type
(into [] '(1 2 3 4 5))
(into {} '([:one 1] [:two 2] [:three 3]))
