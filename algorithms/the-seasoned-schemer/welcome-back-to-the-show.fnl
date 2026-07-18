(fn member? [x xs]
  (for [i 1 (length xs)]
    (when (= x (. xs i)) (lua "return true")))
  false)

(comment (member? 0 [1 2 3]))
(comment (member? :i [:a :i :s :p]))

(fn duplicates? [xs]
  (let [cache {}]
    (each [_ k (ipairs xs)]
      (if (. cache k)
          (lua "return true")
          (tset cache k true)))
    false))

(comment (duplicates? [1 2 3 0]))
(comment (duplicates? [:a :b :c :a]))

{: member? : duplicates?}
