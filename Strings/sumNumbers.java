public int sumNumbers(String str) {
        int sum = 0;
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter > 47 && letter < 59) num += letter;
            else {
              if (!num.equals("")) {
                  sum += (int) Integer.parseInt(num);
                  num = "";
              }
            }
        }
        
        if (num != "") sum += (int) Integer.parseInt(num);
        return sum;

}
