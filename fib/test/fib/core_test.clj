(ns fib.core-test
  (:require [clojure.test :refer :all]
            [fib.core :refer :all]))

; (deftest a-test
;   (testing "FIXME, I fail."
;     (is (= 0 1))))


(deftest fib-zero
	(testing "Zero return"
		(is ((fib 0) 0) )))

; lein help test
; lein test :only fib.core-test/a-test
; lein test :all

; Run the project's tests.

; Marking deftest or ns forms with metadata allows you to pick selectors to
; specify a subset of your test suite to run:

;     (deftest ^:integration network-heavy-test
;       (is (= [1 2 3] (:numbers (network-operation)))))

; Write the selectors in project.clj:

;     :test-selectors {:default (complement :integration)
;                      :integration :integration}

; Arguments to this task will be considered test selectors if they are keywords,
; otherwise arguments must be test namespaces or files to run. With no
; arguments the :default test selector is used if present, otherwise all
; tests are run. Test selector arguments must come after the list of namespaces.

; A default :only test-selector is available to run select tests. For example,
; `lein test :only leiningen.test.test/test-default-selector` only runs the
; specified test. A default :all test-selector is available to run all tests.

; Arguments: ([& tests])

; lein uberjar