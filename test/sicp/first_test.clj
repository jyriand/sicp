(ns sicp.first-test
  (:require [clojure.test :refer :all]
            [sicp.first :refer :all]))

(deftest test-pascal
  (testing "top is one"
    (is (= (pascal 1 1) 1)))
  (testing "3 2 is 2"
    (is (= (pascal 3 2) 2)))
  (testing "13 6 is 792"
    (is (= (pascal 13 6) 792))))

