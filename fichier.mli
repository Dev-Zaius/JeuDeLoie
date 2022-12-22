let create_array (n: int) : string array =
  Array.init n (fun i -> Element  ^ string_of_int i)
