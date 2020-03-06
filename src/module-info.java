List<Integer> nbrs = new ArrayList<Integer>();
  for (int i = 0; i < 100; i += 10) {
      nbrs.add(i);
      nbrs.add(i);    // notera: talet läggs till två gånger}
        for (int a : nbrs) {
           System.out.println(a);
}