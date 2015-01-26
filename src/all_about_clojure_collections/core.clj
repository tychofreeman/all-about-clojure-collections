(ns all-about-clojure-collections.core
  (:require [clojure.string :as str]))

;; repeat creates an infinite lazy sequence
(nth (repeat 10) 1000)
