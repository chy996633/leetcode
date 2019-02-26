import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LettersOfPhoneNumberCombinations {

    List<String> result = new ArrayList<>();

    HashMap<String, String> numToLetterMap = new HashMap<String, String>(){
        {
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }
    };

    public List<String> solutions(String digits) {
        if (digits.equals("")) return new ArrayList<>();

        //define number-letters mapping
        Map<String, List<String>> numToLetterMap = new HashMap<>();
        numToLetterMap.put("2", Arrays.asList("abc".split("")));
        numToLetterMap.put("3", Arrays.asList("def".split("")));
        numToLetterMap.put("4", Arrays.asList("ghi".split("")));
        numToLetterMap.put("5", Arrays.asList("jkl".split("")));
        numToLetterMap.put("6", Arrays.asList("mno".split("")));
        numToLetterMap.put("7", Arrays.asList("pqrs".split("")));
        numToLetterMap.put("8", Arrays.asList("tuv".split("")));
        numToLetterMap.put("9", Arrays.asList("wxyz".split("")));

        //reduce to str list
        Iterator<String> itr = Arrays.asList(digits.split("")).iterator();
        List<String> result = numToLetterMap.get(itr.next());
        while (itr.hasNext()) {
            String a = itr.next();
            result = crossAppendingTwoLists(result, numToLetterMap.get(a));
        }

        return result;
    }

    private List<String> crossAppendingTwoLists(List<String> firstList, List<String> secondList) {
        List<String> result = new ArrayList<>();
        for (String first : firstList) {
            for (String second : secondList) {
                result.add(first + second);
            }
        }
        return result;
    }

    public List<String> solutionTwo(String digits) {
        backtrace("", digits);
        return result;
    }

    private void backtrace(String combination, String remainDigits) {
        if (remainDigits == null || remainDigits.equals("")) {
            result.add(combination);
        } else {
            String number = remainDigits.substring(0, 1);
            String letters = numToLetterMap.get(number);
            for (String letter : letters.split("")) {
                backtrace(combination + letter, remainDigits.substring(1));
            }
        }

    }




}
