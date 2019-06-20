package main;

public class DRoot {
    public static int getCountsOfDigits(int num){
        int count = (num == 0) ? 1 : 0;
        while (num != 0){
            count++;
            num /= 10;
        }
        return count;
    }

    public static int getSumOfDigits(int num){
       int sum = 0;
       int cnt = getCountsOfDigits(num);
       int i = 1;
       int num1 = num;
       while (i <= cnt){
          sum += num1 % 10;
          num1 /= 10;
          i++;
       }
       return sum;
    }

    public static int digital_root(int n){
        int res = getSumOfDigits(n);
        while (getCountsOfDigits(res) > 1){
            res = getSumOfDigits(res);
        }
        return res;
    }
}
