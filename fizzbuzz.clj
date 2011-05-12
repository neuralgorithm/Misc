(ns org.neuralgorithm.fizzbuzz)

(defn lazy-fizzbuzz
  ([]
     (lazy-fizzbuzz (inc 0)))
  ([n]
     (lazy-seq
      (cons (cond
	     (zero? (rem n 15)) 'FizzBuzz
	     (zero? (rem n 3)) 'Fizz
	     (zero? (rem n 5)) 'Buzz
	     :else n) (lazy-fizzbuzz (inc n))))))

(take 100 (lazy-fizzbuzz))
