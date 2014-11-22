(ns cl-playground.max)

(defn my-max [x & more]
  (if more
    (let [y (first more)]
      (recur (if (> x y) x y) (next more)))
    x))

(defn my-max [& more] (reduce max more))

(my-max 4 3 6)

(+ (+ 1 2) 3)

(-> 1
 (+ 2)
 (+ 3)
 )

