//Challenge: Return an array that contains the sorted values from the input array with duplicates removed.

int[] sort(int[] a) {
  if (a.length == 0 || a.length == 1) return a;
  
  ArrayList<Integer> ans = new ArrayList<Integer>();
  Arrays.sort(a);
  
  for (int i : a) {
    if (!ans.contains(i)) ans.add(i);
    else {
      
    }
  }
  //converting Object[] to int[] and returning
  return ans.stream().filter(t -> t != null).mapToInt(t -> t).toArray();
  
}
