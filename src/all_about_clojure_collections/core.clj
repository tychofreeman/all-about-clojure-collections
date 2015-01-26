(ns all-about-clojure-collections.core
  (:require [clojure.string :as str]))

;; This is a list
'(1 2 3)

;; The function seq is interesting
(seq nil)
(seq [])
(seq [1])
(seq {1 1 2 2 3 3})

