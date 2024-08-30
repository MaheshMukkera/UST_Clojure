(ns task-1.core
  (:gen-class))

;; Function declaration.
(declare add)
(declare sub)
(declare mul)
(declare dev)

;; Global Varaibles declaration.
(def name "Mahesh Mukkera")
(def employeeId 248008)
(def salary 100.123)

(def ^:dynamic *dvar* 32)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println "Addition of two values : " (add 10 20))
  (println "Subtraction of two values : " (sub 10 20))
  (println "Multiplication of two values : " (mul 10 20))
  (println "divided by two values : " (dev 10 20))
  (println "Employee Name : " name)
  (println "Employee Id : " employeeId)
  (println "Employee Salary : " salary)
  (println "Employee Age : " *dvar*)
  (binding  [*dvar* 33]
    (println "Inside Binding Employee Age : " *dvar*))
  )

;; Define Finctions
(defn add [a b]
  (+ a b))

(defn sub [a b]
  (- b a))

(defn mul [a b]
  (* a b))

(defn dev [a b]
  (/ b a))