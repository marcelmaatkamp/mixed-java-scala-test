(ns mixed
  (:gen-class))

java.util.Date  ; ⇒ java.util.Date

(defn charge
  "Charge credit card with given amount.
   This function has side effects with a println in our example,
   but in a real world implementation could also include
   REST API calls, database access or other side effects."
  [cc amount]
  (println (str "Charge " amount " to credit card " (:number cc))))

(defn buy-coffee
  "Sample function to buy a coffee and charge the given credit card
   with the price of the coffee.
   The function returns coffee."
  [cc]
  (let [cup {:price 2.99}]
    (charge cc (:price cup))
    cup))

(defn -main
  "I don't do a whole lot ... yet.."
  [& args]
  (apply println "Hello," args))