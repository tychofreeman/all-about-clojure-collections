(ns all-about-clojure-collections.core
  (:require [clojure.string :as str]))

;; This is a list
'(1 2 3)

;; Sometimes, you want to create a pipeline
(->> [1 2 3 4 5 6 7 8]
     (map #(list % (inc %)))
     (filter (comp odd? first))
     flatten
     reverse
     sort
     (map inc))
