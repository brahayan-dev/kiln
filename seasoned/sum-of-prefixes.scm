;; CH-1-P-9

(define (->calc-rec acc tail lat)
  (if (null? tail) (reverse lat)
      (let* ([new-acc (+ acc (car tail))]
             [new-lat (cons new-acc lat)])
        (->calc-rec new-acc (cdr tail) new-lat))))

(define (sum-of-prefixes coll)
  (if (null? coll) coll
      (let ([init (car coll)])
        (->calc-rec init (cdr coll) (list init)))))

(sum-of-prefixes '(1 1 1 1 1)) ;; => '(1 2 3 4 5)
(sum-of-prefixes '(1 2 3 4 5))

(define (sum-of-prefixes-tail-rec-aux acc base coll)
  (if (null? coll) base
      (let* ([acc' (+ acc (car coll))]
             [base' (cons acc' base)]
             [coll' (cdr coll)])
        (sum-of-prefixes-tail-rec-aux acc' base' coll'))))

(define (sum-of-prefixes-tail-rec coll)
  (if (null? coll) coll
      (sum-of-prefixes-tail-rec-aux 0 '() coll)))

(sum-of-prefixes-tail-rec '(1 1 1 1 1)) ;; => '(5 4 3 2 1)
(sum-of-prefixes-tail-rec '(1 2 3 4 5)) ;; => '(15 10 6 3 1)
