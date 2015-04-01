#!/usr/bin/env swearjure

;; This is from https://gist.github.com/timmc/3916042, by Tim McCormack.
;; It implements the `rest` function in Clojure, which is not available in
;; Swearjure.

(#(((% (+(*))) (+)) %)
 [[:+ :++ :+++ :++++ :+++++] ;; for ease of reading
  [#(({[] ((% (+(*))) (+(*)))}
      (% (+))
      ((% (+(*))) (+(*)(*))))
     [(% (+)) (% (+(*)))])
   #({} %& [])
   #(((% (+(*))) (+(*)(*)(*)))
     [(% (+)) (% (+(*))) [(+(*)) []]])
   #(({(% (+)) ((% (+(*))) (+(*)(*)(*)(*)))}
      `[~((% (+)) (+))
        ~@((% (+(*)(*))) (+(*)))]
      ((% (+(*))) (+(*)(*)(*)(*)(*))))
     [(% (+)) (% (+(*))) (% (+(*)(*)))])
   #((% (+(*)(*))) (+(*)))
   #(((% (+(*))) (+(*)(*)(*)))
     [(% (+)) (% (+(*))) [(+ (+(*)) ((% (+(*)(*))) (+)))
                   `[~@((% (+(*)(*))) (+(*)))
                     ~((% (+)) ((% (+(*)(*))) (+)))]]])]])
