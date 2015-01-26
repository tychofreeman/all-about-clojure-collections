(ns all-about-clojure-collections.core
  (:require [clojure.string :as str]))

;; This is a map
{:a 1 :b 2 :c 3 :d 4}

;; Maps have many standard functions
(keys {:a 1 :b 2 :c 3})
(vals {:a 1 :b 2 :c 3})
(seq {:a 1 :b 2 :c 3})

