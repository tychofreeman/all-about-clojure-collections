(ns all-about-clojure-collections.core
  (:require [clojure.string :as str]))

;; This is a map
{:a 1 :b 2 :c 3 :d 4}

;; You can get values from a map
(get {:a 1} :a)
