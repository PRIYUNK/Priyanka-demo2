import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class CompanyJobRepository {
static String getJobPrediction(int age, String highestQualification) throws
NotEligibleException{
String string;
if (age >= 19){
if (age >= 21 && highestQualification.equals("B.E"))
string = "We have openings for junior developer";
else if (age >= 26 &&
(highestQualification.equals("M.S"))||(highestQualification.equals("PhD")))
string = "We have openings for senior developer";
else if (age >= 19 && !(highestQualification.equals("B.E"))
&& !(highestQualification.equals("M.S")) &&
!(highestQualification.equals("PhD")))
throw new NotEligibleException("We do not have any job that matches your qualifications");
else
string = "Sorry we have no openings for now";
}
else
throw new NotEligibleException("You are underage for any job");
return string;
}
}
public class Source2 {
public static String searchForJob(int age, String highestQualification) throws
NotEligibleException {
String string = new String();
if (age >= 200 || age <= 0) {
throw new NotEligibleException("The age entered is not typical for a human being");

}
else {
string= CompanyJobRepository.getJobPrediction(age,
highestQualification);
}
return string;
}
public static void main(String args[] ) {
/*try {
searchForJob(34, "PhD");
} catch (NotEligibleException e) {
System.out.println(e);
}*/
}
}
class NotEligibleException extends Exception {
public NotEligibleException(String msg) {
super(msg);
}
}
