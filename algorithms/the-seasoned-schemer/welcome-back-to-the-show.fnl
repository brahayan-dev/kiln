(fn member? [x xs]
  (case xs
    [y & rest] (or (= x y) (member? x rest))
    _ false))

(member? 0 [1 2 3])
(member? :sardines [:italian :sardines :spaghetti :parsley])
