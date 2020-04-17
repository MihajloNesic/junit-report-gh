package io.github.mihajlonesic.junitreport;

public class StringCalculator {

    public static int add(String numbers) {
        if(numbers.isEmpty()) return 0;
        numbers = numbers.replaceAll("\n", ",");
        String[] params = numbers.split(",");
        int sum = 0;
        for(String s : params)
            sum += Integer.parseInt(s.trim());
        if(sum>100) return 100;
        return sum;
    }
}
