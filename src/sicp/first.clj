(ns sicp.first)

(defn pascal [row column]
  (if (first-rows? row column)
    1
    (+ (pascal (- row 1) column)
       (pascal (- row 1) (- column 1)))))

(defn first-rows? [row column]
  (or (= row 1) (= column 1) (= column row)))
