(use '(incanter core))

(defn replace-at
  ([i j elm coll]
     (let [[a b] (split-at i coll)
	   [c d] (split-at j (first b))
	   new-row (concat c [elm] (rest d))]
       (matrix (concat a [new-row] (rest b)))))
  ([n elm coll]
     (let [[a b] (split-at n coll)]
       (matrix (concat a [elm] (rest b))))))
