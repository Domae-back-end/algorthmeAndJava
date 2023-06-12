package java_study;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String choiceList = sc.nextLine();
        String menu = sc.nextLine();

        switch (choiceList) {
            case "List": {
                ArrayList<String> ar = new ArrayList<>();
                ar.add("[ List으로 저장된 "+menu+" ]");
                for (int i = 1; true; i++) {
                    String msg = sc.nextLine();
                    if (msg.equals("끝")) {
                        break;
                    }
                    ar.add(i+". "+msg);
                }
                for (String msg : ar) {
                    System.out.println(msg);
                }
            }
            case "Set": {
                LinkedHashSet<String> hashSet = new LinkedHashSet<>();
                hashSet.add("[ Set으로 저장된 "+menu+" ]");
                for (int i = 1; true; i++) {
                    String msg = sc.nextLine();
                    if (msg.equals("끝")) {
                        break;
                    }
                    hashSet.add(i+". "+msg);
                }
                for (String ar: hashSet) {
                    System.out.println(ar);
                }
            }
            case "Map": {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("0","[ Map으로 저장된 "+menu+" ]");
                for (int i = 1; true; i++) {
                    String msg = sc.nextLine();
                    if (msg.equals("끝")) {
                        break;
                    }
                    hashMap.put(""+i,i+". "+msg);
                }
                for (int i = 0; i < hashMap.size() ; i++) {
                    System.out.println(hashMap.get(""+i));
                }
            }
            default: {
                System.out.println("잘못 입력.");
            }
        }

    }

}

