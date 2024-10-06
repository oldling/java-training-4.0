Season Example
Season season;
...
switch (month) {
case "December":
case "January":
case "February":
season = Season.WINTER;
break;
case "March":
case "April":
case "May":
season = Season.SPRING;
break;
case "June":
case "July":
case "August":
season = Season.SUMMER;
break;
case "September":
case "October":
case "November":
season = Season.AUTUMN;
break;
default:
System.out.println("No this month");
