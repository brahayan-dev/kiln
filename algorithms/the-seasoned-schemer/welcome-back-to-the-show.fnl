(fn member? [x xs]
  (var found? false)
  (for [i 1 (length xs)]
    (when (= x (. xs i)) (set found? true)))
  found?)

(member? 0 [1 2 3])
(member? :sardines [:italian :sardines :spaghetti :parsley])
