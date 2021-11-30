package tools;

import com.google.common.base.Predicate;

import java.util.LinkedList;

public class DataRow {
    public LinkedList<DataColumn> DataColumns;

    public DataRow()
    {
        DataColumns = new LinkedList<>();
    }

    public String getColumnValue(String columnHeader)
    {
        try
        {
            Predicate<DataColumn> predicate = c-> c.getKey().equals(columnHeader);
            DataColumn obj = DataColumns.stream().filter(predicate).findFirst().get();
            String value = obj.getValue();
            return value;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage() + " - [ERROR] Could not find column - " + columnHeader + " - in table row");
            return "";
        }

    }
}
