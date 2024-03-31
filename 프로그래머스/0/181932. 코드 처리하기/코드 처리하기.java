class Solution {
    public String solution(String code) {
        
        if (code.isEmpty()) {
            return "EMPTY";
        }

        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char currentChar = code.charAt(i);

            if (mode == 0) {

                if (currentChar != '1' && i % 2 == 0) {
                    ret.append(currentChar);
                } else if (currentChar == '1') {
                    mode = 1;
                }

            } else {

                if (currentChar != '1' && i % 2 != 0) { //5

                    ret.append(currentChar);

                } else if (currentChar == '1') {
                    mode = 0;
                }

            }
        }

        if (ret.length() == 0) {
            return "EMPTY";
        }


        return ret.toString();
    }
}