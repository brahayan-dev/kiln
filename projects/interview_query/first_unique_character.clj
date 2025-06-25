(def word-1 "concussion")
(def word-2 "helloworld")

(defn ->string [characters]
  (map str characters))

(defn create-schema [characters]
  (letfn [(->schema [index character]
            {:index index :character character})]
    (map-indexed ->schema characters)))

(defn count-characters [schemas]
  (group-by :character schemas))

(defn filter-by-lower-frequency [grouped-schemas]
  (->> grouped-schemas
       vals
       (filter #(= 1 (count %)))))

(defn sort-by-index [schemas]
  (sort-by :index schemas))

(defn get-index [first-schema]
  (get-in first-schema [0 :index]))

(defn first-unique-character [word]
  (-> word
      vec
      ->string
      create-schema
      count-characters
      filter-by-lower-frequency
      sort-by-index
      first
      get-index))

(-> word-1 first-unique-character print)
