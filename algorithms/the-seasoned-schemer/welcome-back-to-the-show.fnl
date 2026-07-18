(fn member? [x xs]
  (var found? false)
  (for [i 1 (length xs) &until found?]
    (->> i (. xs) (= x) (set found?)))
  found?)

(comment (member? 0 [1 2 3]))
(comment (member? :i [:a :i :s :p]))

(fn duplicates? [xs]
  (var found? false)
  (let [cache {}]
    (each [_ k (ipairs xs) &until found?]
      (set found? (. cache k))
      (tset cache k true))
    found?))

(comment (duplicates? [1 2 3 0]))
(comment (duplicates? [:a :b :c :a]))

{: member? : duplicates?}
