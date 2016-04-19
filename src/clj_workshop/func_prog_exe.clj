(ns clj-workshop.func-prog-exe
  (:require [clj-workshop.utils :refer :all]))

(defn count-chars
  "Returns count of the provided character `c` in string `s`"
  [s c]
  (reduce (fn [acc x]
            (if (= c x)
              (+ acc 1)
              acc)) 0 s))

(defn candidate-names
  [candidates]
  (map :name candidates))

(defn candidates-with-minimum-rating
  [min-rating candidates]
  (filter (fn [{rating :rating}]
             (> rating min-rating))
           candidates))

(defn palindrome?
  "Checks if the given sequence is a palindrome"
  [xs]
  (loop [coll xs]
    (let [f (first coll)
          l  (last coll)]
    (cond
      (< (count coll) 2) true
      (not (= l f)) false
      true (recur (drop-last (drop 1 coll)))))))

(defn count-palindromes
  [start end]
  (unimplemented))

(defn is-prime? [n]
  (let [range-to-n (range 2 n)]
    (not-any? #(zero? (mod n %)) range-to-n)))

(defn primes
  "Returns a lazy seq of prime numbers"
  []
  (filter is-prime?
          (drop 2 (range))))


(defn mungle-candidate-name
  "Returns uppercased and reversed name of the candidate"
  [{name :name}]
  (apply str (reverse (clojure.string/upper-case name))))

(defn select-values
  "Selects keys from the provided map
  and return their values. For example:
  (select-values {:a 1 :b 2 :c 3} [:a :c]) => (1 3)"
  [map keyseq]
  (unimplemented))

(defn rcomp
  "Composes provided functions so that
  ((rcomp f1 f2 f3) args) is the same as (f3 (f2 (f1 args)))"
  [& fns]
  (unimplemented))

(defn power
  "Returns n to the power of m"
  [n m]
  (loop [acc n counter m]
    (if (= counter 1)
      acc
      (recur (* acc n) (dec counter)))))

(defn range-sum
  "Calculates the sum of numbers [0..n)"
  [n]
  (loop [acc 0 c 0]
    (if (= c n)
      acc
      (recur (+ acc c) (inc c)))))

(defn ratings-avg
  [candidates]
  (unimplemented))

(defn distance-tuple
  "Calculates a distance between two points.
  Points are two element vectors with x and y
  coordinates."
  [p1 p2]
  (unimplemented))

(defn distance-map
  "Calculates a distance between two points.
  Points are maps with :x and :y keys."
  [p1 p2]
  (unimplemented))
