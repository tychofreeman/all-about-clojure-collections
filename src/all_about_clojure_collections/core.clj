(ns all-about-clojure-collections.core
  (:require [clojure.string :as str]))

;; repeat creates an infinite lazy sequence
(nth (repeat 10) 1000)

;; repeatedly creates an infinite lazy sequence
(nth (repeatedly #(rand-int 1000)) 1000)

;; Simple Fibonacci generator
(take 89 (map second
              (iterate
               (fn [[a b]] (list b (+ a b)))
               '(0 1))))
