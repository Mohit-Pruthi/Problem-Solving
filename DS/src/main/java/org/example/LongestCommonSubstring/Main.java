package org.example.LongestCommonSubstring;

class Main {
    public static void main(String args[])
    {
        String arr[] ={"hdjdjdvdvdvflflowdon","dvdvdvdonflowfjkfl","jjfknnflowdonmsnfl"};

        int n = arr.length;
        String s = arr[0];
        int len = s.length();
        String max = "";
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String commStr = s.substring(i, j);
                int k = 1;
                for (k = 1; k < n; k++)
                    if (!arr[k].contains(commStr))
                        break;
                if (k == n && max.length() < commStr.length())
                    max = commStr;
            }
        }
        System.out.println(max);
    }
}