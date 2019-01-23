import java.io.File;
import java.io.FileReader;
import java.util.Calendar;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class CreateDirectory {

    public static void main(String [] args)throws Exception{

        Object obj = new JSONParser().parse(new FileReader("C:\\workspace\\SHPEDirectory\\src\\main\\java\\directory.json") );
        JSONObject jo = (JSONObject)obj;

        System.out.println( (String)jo.get(0));

        String base = "C://Users/Edward/Desktop/";

        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);

        int year = cal.get(Calendar.YEAR);

        int nextYear= cal.get(Calendar.YEAR)+1;

        String folderYear = "FY "+year+"-"+nextYear;
        System.out.println("year "+year+" next year: "+nextYear);

        //Root folder
        File file = new File(base+folderYear);


        if(!file.exists()){
            if(file.mkdir()){

                File file2 = new File(base+folderYear+"/Agenda");
                if(file2.mkdir())
                    System.out.println(base+folderYear+"/Agenda Created");
                File file3 = new File(base+folderYear+"/Board Meetings & Calls");
                if(file3.mkdir())
                    System.out.println(base+folderYear+"/Board Meetings & Calls Created");
                File file4 = new File(base+folderYear+"/CFF for NRP");
                if(file4.mkdir())
                    System.out.println(base+folderYear+"/CFF for NRP Created");
                File file5 = new File(base+folderYear+"/Events Calendar");
                if(file5.mkdir())
                    System.out.println(base+folderYear+"/Events Calendar Created");
                File file6 = new File(base+folderYear+"/Finances");
                if(file6.mkdir())
                    System.out.println(base+folderYear+"/Finances Created");
                File file7 = new File(base+folderYear+"/Membership");
                if(file7.mkdir())
                    System.out.println(base+folderYear+"/Membership Created");
                File file8 = new File(base+folderYear+"/Regional Roundup Submissions");
                if(file8.mkdir())
                    System.out.println(base+folderYear+"/Regional Roundup Submissions Created");

                System.out.println("Root Directory created.");
            }
            else{
                System.out.println("Failed to create directory.");
            }
        }



    }

}
