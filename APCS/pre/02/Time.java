public class Time{
  public static void main(String[] args){
int hour = 9;
int minute = 0;
int second = 6;
System.out.println("number of seconds since midnight: " + (second + (minute*60) + (hour*3600)));
System.out.println("number of seconds remaining in the day: " + (86400-(hour * 24)+(minute*1440)+(second)));
}}
