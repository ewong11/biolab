/*********************************
class Normal extends Student
**********************************/
public class Normal extends Student{
    public Normal(String s) {
	intel = 50;
	friendCount = 5;
	average = 100.0;
	sleep = 75.0;
	mental = 75;
	physical = 50;
	charisma = 50;
	name = s;
  	schedule = new String[]{"Geometry", "World History", "Biology",
		    "PE", "Freshman Composition",
		    "Art Appreciation", "Math Research"};
    }
}
