(define (test a b)
  ((if (> a b) + -) a b))

(test 2 3) ;;=> -1
(test 3 2) ;;=> 5
