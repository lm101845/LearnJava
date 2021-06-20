package day04;

/*
 * @姓名 李明
 * @日期 2018年10月30日下午12:44:18
 * 
 * switch语句中的测试只能是可转换为int的基本数据类型，如char或字符串。不能在switch中使用更大的数据类型，如long,default,也
 * 不能测试除相等性外的其他关系
 */
class DayCounter {
	
    public static void main(String[] arguments) {
    	
        int yearIn = 2016;
        int monthIn = 1;
        if (arguments.length > 0)
            monthIn = Integer.parseInt(arguments[0]);
        if (arguments.length > 1)
            yearIn = Integer.parseInt(arguments[1]);
        System.out.println(monthIn + "/" + yearIn + " has "
            + countDays(monthIn, yearIn) + " days.");
    }

    static int countDays(int month, int year) {
        int count = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0)
                    count = 29;
                else
                    count = 28;
                if ((year % 100 == 0) & (year % 400 != 0))
                    count = 28;
        }
        return count;
    }
}
