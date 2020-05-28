package Day_3;

class EqualsTester {
    public static void main(String[] arguments) {
        String str1, str2;
        str1 = "Boy, that escalated quickly.";
        str2 = str1;
        //此时str1和str2指向同一个对象，即使值不同，他们也指向同一个对象，在17，18行中有所体现
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2));

        str2 = new String(str1);                //str2换对象了

        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2));   //指向不同对象
        System.out.println("Same value? " + str1.equals(str2)); //但是值相同
    }
}