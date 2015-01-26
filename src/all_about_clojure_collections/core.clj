(ns all-about-clojure-collections.core
  (:require [clojure.string :as str]))

;; This is a list
'(1 2 3)

;; Often, you'll want to consume a sequence in it's entirety
(map    inc   '(1 2 3 4 5 6))
(map    first '([1 2] [2 3] [3 4] [4 5] [5 6]))
(filter even? '(1 2 3 4 5 6))

;; Map can take multiple sequences
(map vector '(1 2 3 4 5) '(6 7 8 9 10))


;; Let's implement a Markov chain generator
(def sentence 
  (str/split "when I went to school they asked me what I wanted to be when I grew up I wrote down happy they said I didn't understand the assignment I said they didn't understand life" #" "))

(def word-pairs (map vector sentence (rest sentence)))

(def word-map
  (reduce (fn [acc [a b]] (assoc acc a (conj (get acc a) b))) {} word-pairs))

(loop [i 20
       word "I"
       build ""]
  (if (and (pos? i) (not (nil? word)))
    (recur (dec i) (rand-nth (get word-map word)) (str build word " "))
    build))
