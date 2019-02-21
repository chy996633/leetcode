public class IntToRoman {

    public String solution(int num) {

        //normal case
        StringBuilder roman = new StringBuilder();
        int nums[] = {1000, 900, 500,400,100,90,50,40,10,9,5,4,1};
        String roms[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int temp = num;
        for (int i = 0; i < nums.length ;i++){
            while (temp >= nums[i]){
                temp -= nums[i];
                roman.append(roms[i]);
            }
        }
        return roman.toString();

//        int temp = num;
//        int i = temp / 1000;
//        temp = temp % 1000;
//        while (i-->0) {
//            roman.append("M");
//        }
//
//        i = temp / 900;
//        temp = temp % 900;
//        while (i-->0) {
//            roman.append("CM");
//        }
//
//        i = temp / 500;
//        temp = temp % 500;
//        while (i-->0) {
//            roman.append("D");
//        }
//
//        i = temp / 400;
//        temp = temp % 400;
//        while (i-->0) {
//            roman.append("CD");
//        }
//
//        i = temp / 100;
//        temp = temp % 100;
//        while (i-->0) {
//            roman.append("C");
//        }
//
//        i = temp / 90;
//        temp = temp % 90;
//        while (i-->0) {
//            roman.append("XC");
//        }
//
//        i = temp / 50;
//        temp = temp % 50;
//        while (i-->0) {
//            roman.append("L");
//        }
//
//        i = temp / 40;
//        temp = temp % 40;
//        while (i-->0) {
//            roman.append("XL");
//        }
//
//        i = temp / 10;
//        temp = temp % 10;
//        while (i-->0) {
//            roman.append("X");
//        }
//
//        i = temp / 9;
//        temp = temp % 9;
//        while (i-->0) {
//            roman.append("IX");
//        }
//
//        i = temp / 5;
//        temp = temp % 5;
//        while (i-->0) {
//            roman.append("V");
//        }
//
//        i = temp / 4;
//        temp = temp % 4;
//        while (i-->0) {
//            roman.append("IV");
//        }
//
//        i = temp;
//        while (i-->0) {
//            roman.append("I");
//        }

//        return roman.toString();
    }

}
