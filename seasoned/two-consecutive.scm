;; CH-1-P-7

(define (->checked head tail)
  (if (null? tail) #f
      (eq? head (car tail))))

(define (two-consecutive? coll)
  (if (null? coll) #f
      (or (->checked (car coll) (cdr coll))
          (two-consecutive? (cdr coll)))))

(two-consecutive? '(a b c d)) ;; => #f
(two-consecutive? '(a b a d)) ;; => #f
(two-consecutive? '(b a a d)) ;; => #t

(define (two-in-a-row-rec? head tail)
  (if (null? tail) #f
      (or (eq? head (car tail))
          (two-in-a-row-rec? (car tail) (cdr tail)))))

(define (two-in-a-row? coll)
  (if (null? coll) #f
      (two-in-a-row-rec? (car coll) (cdr coll))))

(two-in-a-row? '(a b c d)) ;; => #f
(two-in-a-row? '(a b a d)) ;; => #f
(two-in-a-row? '(b a a d)) ;; => #t

(define (two-in-a-row-tail-rec? coll)
  (cond
   [(null? coll) #f]
   [(null? (cdr coll)) #f]
   [(eq? (car coll) (cadr coll)) #t]
   [else (two-in-a-row-tail-rec? (cdr coll))]))


(two-in-a-row-tail-rec? '(a b c d)) ;; => #f
(two-in-a-row-tail-rec? '(a b a d)) ;; => #f
(two-in-a-row-tail-rec? '(b a a d)) ;; => #t
