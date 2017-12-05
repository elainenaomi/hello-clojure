(ns fib.core)

(defn fib[x]
    (if (= x 0) 0 
    (if (= x 1) 1 
    (+ (fib (- x 1)) (fib (- x 2))))))



(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
