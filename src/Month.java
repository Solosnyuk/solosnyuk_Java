public class Month {
    private final String name;
    private final int day;
    private final int workDay;

    public Month(String name, int day, int workDay) {
        this.name = name;
        this.day = day;
        this.workDay = workDay;
    }

    public static Month[] monthsOneQartal (int qartal) {
        switch (qartal) {
            case 1 :
                return new Month[] {MonthUthils.getYnuar(),
                        MonthUthils.getFebrual(),
                        MonthUthils.getMart()
                };
            case 2 :
                return new Month[] {
                        MonthUthils.getApril(),
                        MonthUthils.getYun(),
                        MonthUthils.getYul()
                };
            case 3 :
                return new Month[] {
                        MonthUthils.getAvgust(),
                        MonthUthils.getSeptember(),
                        MonthUthils.getOctober()
                };
            case 4 :
                return new  Month[] {
                        MonthUthils.getNovember(),
                        MonthUthils.getDecember()
                };
            default :
                throw new IllegalArgumentException("Неверный квартал: " + qartal);
        }
    }

    public String getName () {
        return name;
    }

    public int getDay () {
        return day;
    }

    public int getWorkDay () {
        return workDay;
    }
}
