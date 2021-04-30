(def mapSet  {:high 2 :medium 1 :low 0})

(defn mycompare
[x y] (> (x mapSet -1) (y mapSet -1)))

(= (sort mycompare [:high :high :low :medium])
[:high :high :medium :low])

(= (sort mycompare [:foo :high :low :medium])
[:high :medium :low :foo])

(= (sort mycompare [:low :medium :high :foobar])
[:high :medium :low :foobar])
