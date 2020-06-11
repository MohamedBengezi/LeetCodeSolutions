public String stringSplosion(String str) {
  String message = str;
  
  for (int i = 0; i < str.length(); i ++) {
    message = str.substring(0, str.length() - 1 - i) + message; 
  }
  return message;
}
