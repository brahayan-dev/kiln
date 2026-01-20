;; CH-1-P-3

(define (member? item coll)
  (if (null? coll) #f
      (or (eq? item (car coll))
          (member? item (cdr coll)))))


(member? 3 '(1 2 3)) ;; => #t
(member? 'd '(a b c)) ;; => #f
