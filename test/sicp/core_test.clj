(ns sicp.core-test
  (:require [clojure.test :refer :all]
            [sicp.core :refer :all]))

(deftest test-squaring
  (testing "2 squared is 4"
    (is (= (sqr 2) 4)))
  (testing "1 squared is 1"
    (is (= (sqr 1) 1))))
