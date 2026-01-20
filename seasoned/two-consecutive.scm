;; CH-1-P-7

(define (->checked head tail)
  (if (null? tail) #f
      (eq? head (car tail))))

(define (two-consecutive? coll)
  (if (null? coll) #f
      (or (->checked (car coll) (cdr coll))
          (two-consecutive? (cdr coll)))))

(two-consecutive? '(a b c d)) ;; #f
(two-consecutive? '(a b a d)) ;; #f
(two-consecutive? '(b a a d)) ;; #t
