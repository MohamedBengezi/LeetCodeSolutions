public String withoutString(String base, String remove) {
  String ans = base;
  if (base == null || remove == null) return "";
  
  while (true) {
    base = base.replaceAll("(?i)"+remove, "");
    if (!base.contains(remove) || !base.toLowerCase().contains(remove.toLowerCase()))
      break;
  }
  
  return base;
}
