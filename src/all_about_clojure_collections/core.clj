(ns all-about-clojure-collections.core
  (:require [clojure.string :as str]))

;; This is a map
{:a 1 :b 2 :c 3 :d 4}

;; Maps have many standard functions
(keys {:a 1 :b 2 :c 3})
(vals {:a 1 :b 2 :c 3})
(seq {:a 1 :b 2 :c 3})

;; Maps are immutable
(assoc {:a 1} :a 3)
(update-in {:a 1} [:a] inc)

;; Maps can be nested
(get-in {:a {:b 2}} [:a :b])
(assoc-in {:a {:b 2}} [:a :b] 5)
(update-in {:a {:b 2}} [:a :b] inc)

;; You can get values without relying on nil-punning
(find {:a 1} :a)

;; You can get a subset of a map
(select-keys {:a 1 :b 2 :c 3 :d 4} [:a :d])

;; You can create a superset of a map
(merge {:a 1 :b 2} {:c 3 :d 4} {:e 5})

;; Make sure you put the value you want to keep last
(merge {:a 1 :b 2} {:a 3 :d 4})

;; Or, sometimes you want a smarter merge
(merge-with min {:a 1 :b 3} {:a 3 :d 4})
