
public class DaysOfChristmas 
{
	public static final int NUMBER_OF_VERSES = 12;
	public static final String DAY_ONE = "\na partridge in a pear tree. ";
	public static final String DAY_TWO = "\n2 turtle doves and ";
	public static final String DAY_THREE = "\n3 French hens, ";
	public static final String DAY_FOUR = "\n4 calling birds,";
	public static final String DAY_FIVE = "\n5 golden rings,";
	public static final String DAY_SIX = "\n6 geese a laying,";
	public static final String DAY_SEVEN = "\n7 swans a swimming,";
	public static final String DAY_EIGHT = "\n8 maids a milking,";
	public static final String DAY_NINE = "\n9 ladies dancing,";
	public static final String DAY_TEN = "\n10 lords a leaping,";
	public static final String DAY_ELEVEN = "\n11 pipers piping,";
	public static final String DAY_TWELVE = "\n12 drummers drumming,";

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String song = "";

		for(int verseCount=1; verseCount <= NUMBER_OF_VERSES ; verseCount++ )
		{
			String verseNumber = "";

			switch (verseCount)
			{

			case 1:
				verseNumber = "first ";
				song =  song + DAY_ONE ;
				break;
			case 2:
				;
				verseNumber = "second ";
				song = DAY_TWO + song ;
				break;
			case 3:
				verseNumber = "third ";
				song = DAY_THREE + song ;
				break;
			case 4: 
				verseNumber = "fourth ";
				song = DAY_FOUR + song;
				break;
			case 5:
				verseNumber = "fifth ";
				song = DAY_FIVE + song;
				break;
			case 6:
				verseNumber = "sixth ";
				song = DAY_SIX + song ;
				break;
			case 7:
				verseNumber = "seventh ";
				song = DAY_SEVEN + song;
				break;
			case 8:
				verseNumber = "eight ";
				song = DAY_EIGHT + song;
				break;
			case 9:
				verseNumber = "ninth ";
				song = DAY_NINE + song;
				break;
			case 10:
				verseNumber = "tenth ";
				song = DAY_TEN + song;
				break;
			case 11:
				verseNumber = "eleventh ";
				song = DAY_ELEVEN + song;
				break;
			case 12:
				verseNumber = "twelfth ";
				song = DAY_TWELVE + song;
				break;

			}

			System.out.println("On the " + verseNumber + "day of Christmas \nMy true love sent to me:"+ song + "\n" );

		}
	}
}



	
