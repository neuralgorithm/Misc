(ns org.neuralgorithm.nabeatsu)

(defn lazy-nabeatsu
  ([]
     (lazy-nabeatsu (inc 0)))
  ([n]
     (lazy-seq
      (cons (cond
	     (zero? (rem n 3)) 'Aho
	     (= (re-find #"3" (str n)) "3") 'Aho
	     :else n) (lazy-nabeatsu (inc n))))))

(defn nabeatsu
  [n]
  (take n (lazy-nabeatsu)))

(nabeatsu 40)
