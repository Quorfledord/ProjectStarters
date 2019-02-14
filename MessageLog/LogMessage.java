public class LogMessage
{
  private String machineId;
  private String description;

  public LogMessage(String message)
  {/* Complete for Part (a) */}

  public boolean containsWord(String keyword)
  {/* Complete for Part (b) */}

  public String getMachineId()
  { return machineId; }

  public String getDescription()
  { return description; }

  public String toString()
  {  return getMachineId() + ":" + getDescription();  }
}

