package my.example.prac1;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// public class Student implements Comparable<Student> {
// 	private int id;
// 	private String fname;
// 	private double cgpa;
// 	public Student(int id, String fname, double cgpa) {
// 		super();
// 		this.id = id;
// 		this.fname = fname;
// 		this.cgpa = cgpa;
// 	}
// 	public int getId() {
// 		return id;
// 	}
// 	public String getFname() {
// 		return fname;
// 	}
// 	public double getCgpa() {
// 		return cgpa;
// 	}

//     @Override
//     public int compareTo(Student arg0) {

//         if (this.cgpa > arg0.cgpa) return 1;
//         if (this.cgpa < arg0.cgpa) return -1;
//         return (this.fname.compareTo(arg0.fname));
//     }

    
// }

public class Test {
    // public static void main(String[] args) throws IOException {
    //     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    //     int N = Integer.parseInt(bufferedReader.readLine().trim());

    //     bufferedReader.close();

    //     for (int i=1; i<=10; i++)
    //         System.out.printf("%d x %d = %d\n", N, i, N*i);
    // }

    public static int CalcHG(List<List<Integer>> arr, int x, int y) {

        int res = 0;

        res = arr.get(y).get(x) + arr.get(y).get(x+1) + arr.get(y).get(x+2) +
                arr.get(y+1).get(x+1) +
                arr.get(y+2).get(x) + arr.get(y+2).get(x+1) + arr.get(y+2).get(x+2);

        return res;
    }

    // public static void main(String[] args) throws IOException {
        
    //     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    //     List<List<Integer>> arr = new ArrayList<>();

    //     for (int i = 0; i < 6; i++) {
    //         String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    //         List<Integer> arrRowItems = new ArrayList<>();

    //         for (int j = 0; j < 6; j++) {
    //             int arrItem = Integer.parseInt(arrRowTempItems[j]);
    //             arrRowItems.add(arrItem);
    //         }

    //         arr.add(arrRowItems);
    //     }

    //     int res = Integer.MIN_VALUE;
    //     for (int i=0;i<4;i++) {

    //         for (int j=0;j<4;j++) {

    //             int currRes = CalcHG(arr, i, j);
    //             if (res < currRes)
    //                 res = currRes;
    //         }
    //     }
    //     System.out.print(res);

    //     bufferedReader.close();
    // }

    // Good: "{}()", "[{()}]", "({()})"
    // Bad: "{}(", "({)}", "[[", "}{"
    private static boolean checkBalParentheses(String input) {

        Stack<Character> pStack = new Stack<>();

        for (char c : input.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                pStack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {

                if (pStack.isEmpty())
                    return false;

                char top = pStack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {

                    return false;
                }
            }
        }

        return pStack.isEmpty();
    }

    // public static void main(String[] args) {
        
    //     String input = "[{()}]";

    //     System.out.println(checkBalParentheses(input));
    // }

    private static int checkPair(String[] leftPair, String[] rightPair) {

        HashSet<Integer> s = new HashSet<Integer>();

        for (int i=0; i< leftPair.length; i++) {

    
            int joinedPair = Objects.hash(leftPair[i], rightPair[i]);
            s.add(joinedPair);
        }
        return s.size();
    }

    // public static void main(String[] args) {
        
    //     int t = 3;
    //     String [] pair_left = new String[t];
    //     String [] pair_right = new String[t];
        
    //     pair_left[0] = "john";
    //     pair_right[0] = "tom";
    //     pair_left[1] = "tom";
    //     pair_right[1] = "john";
    //     pair_left[2] = "john";
    //     pair_right[2] = "tom";

    //     System.out.println(checkPair(pair_left, pair_right));
    // }

    // public static void main(String[] args) {
    
    //     // 1. Define your test input exactly as it would appear in the console
    //     String mockInput = "5\n" +
    //                         "5 41 77 74 22 44\n" +
    //                         "1 12\n" +
    //                         "4 37 34 36 52\n" +
    //                         "0\n" +
    //                         "3 20 22 33\n" +
    //                         "5\n" +
    //                         "1 3\n" +
    //                         "3 4\n" +
    //                         "3 1\n" +
    //                         "4 3\n" +
    //                         "5 5";

    //     // 2. Redirect System.in to use your mock string
    //     System.setIn(new ByteArrayInputStream(mockInput.getBytes()));

    //     Scanner sc = new Scanner(System.in);
    //     int numOfLines = sc.nextInt();

    //     ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>(numOfLines);

    //     for (int i=0; i<numOfLines; i++) {

    //         int lineSize = sc.nextInt();

    //         ArrayList<Integer> row = new ArrayList<>(lineSize);

    //         for (int j=0; j<lineSize; j++) {

    //             row.add(sc.nextInt());
    //         }
    //         lines.add(row);
    //     }

    //     int q = sc.nextInt();
    //     for (int i=0; i<q; i++) {
    //         int qLine = sc.nextInt();
    //         int pos = sc.nextInt();
            
    //         if (lines.size() >= qLine && lines.get(qLine-1).size() >= pos)
    //             System.out.println(lines.get(qLine-1).get(pos-1));
    //         else
    //             System.out.println("ERROR!");
    //     }


    //     sc.close();
    
    // }

        public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
       

        for (int i=0;i+k<=s.length(); i++) {

            String word = s.substring(i, i+k);

            if (smallest == "")
                smallest = word;
            if (largest == "")
                largest = word;

            if (word.compareTo(smallest) < 0) {
                smallest = word;
            }

            if (word.compareTo(largest) > 0) {
                largest = word;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        
        // System.out.println(getSmallestAndLargest("welcometojava", 3));
        String A = "maam";
        if (isParlindrom(A)) 
            System.out.println("Yes");
        else
            System.out.println("No");

        String a = "hello";
        String b = "ollehh";

        if (isAnagram(a, b)) {
            System.out.println("Anagram");

        }
        else {
            System.out.println("Not anagram");
        }
    }

    public static boolean isParlindrom(String s) {

        int palindromLen = (int)Math.floor(s.length()/2);
        String leftS = s.substring(0,palindromLen);
        String rightS = s.substring(s.length() - palindromLen, s.length());

        String rightS_rev = new StringBuilder(rightS).reverse().toString();

        return leftS.equals(rightS_rev);
    }

    private static boolean isAnagram(String a, String b) {
        // Complete the function

        HashMap<Character, Integer> d_a = new HashMap<>();
        HashMap<Character, Integer> d_b = new HashMap<>();
        
        for (int i=0;i<a.length(); i++) {

            Character c = Character.valueOf(a.charAt(i));
            Integer cnt = 0;
            if (d_a.containsKey(c)) {
                cnt = d_a.get(c);
            }
            d_a.put(c, cnt+1);
        }

        for (int i=0;i<b.length(); i++) {

            Character c = Character.valueOf(b.charAt(i));
            Integer cnt = 0;
            if (d_b.containsKey(c)) {
                cnt = d_b.get(c);
            }
            d_b.put(c, cnt+1);
        }

        // compare d_a to d_b
        if (d_a.size() != d_b.size()) return false;

        for (Map.Entry<Character, Integer> iterable_element : d_a.entrySet()) {

            if (!d_b.containsKey(iterable_element.getKey()) || !d_b.containsValue(iterable_element.getValue()))
                return false;
        }

        return  true;
    }
}


