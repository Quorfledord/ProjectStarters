 /** Webserver:disk offline
   * SERVER2:read error on disk DSK1
   * SERVER1:write error on disk DSK2
   * True:disk
   * True:error on disk
   * True:error on disk DSK1
   * 
   * 
   * ------ remaining messages after remove ------
   * CLIENT3:security alert – repeated login failures
   * SERVER1:file not found
   * Webserver:error on /dev/disk
   * False:DISK offline
   * False:error on disk3
   * False:error on /dev/disk
   * False:diskette
   * 
   **********************************************/
import java.util.List;
import java.util.ArrayList;

public class SystemLog
{
  private List<LogMessage> messageList;

  public SystemLog(String[] messages)
  {
    messageList = new ArrayList<LogMessage>();
    for (String s : messages)
      messageList.add(new LogMessage(s));
  }

  public List<LogMessage> removeMessages(String keyword)  {
  /* Complete for Part (c) */
  }

  public String toString()  {
    String s = "";
    for (LogMessage msg : messageList)
      s += msg + "\n";
    return s;
  }
  
  /************************************************
   * The main tester method below is complete
   ************************************************/ 
  public static void main(String[] args)
  {
    String[] messages = {
        "CLIENT3:security alert – repeated login failures",
        "Webserver:disk offline",
        "SERVER1:file not found",
        "SERVER2:read error on disk DSK1",
        "SERVER1:write error on disk DSK2",
        "Webserver:error on /dev/disk",
        "True:disk",
        "True:error on disk",
        "True:error on disk DSK1",
        "False:DISK offline",
        "False:error on disk3",
        "False:error on /dev/disk",
        "False:diskette"};
        
    System.out.println("------ test contains keyWord \"disk\" ------");    
    for (String s : messages)
    {
      LogMessage msg = new LogMessage(s);
      System.out.println(msg.getMachineId() + ":" + msg.getDescription() + "==>" + msg.containsWord("disk"));
    }

    SystemLog theLog  = new SystemLog(messages);
    List<LogMessage> removed = theLog.removeMessages("disk");
    
    System.out.println("\n------ removed messages containing keyWord \"disk\" ------");    
    for (LogMessage msg : removed)
      System.out.println(msg);
    System.out.println();

    System.out.println("\n------ remaining messages after remove ------");    
    System.out.println(theLog);

  }
}

