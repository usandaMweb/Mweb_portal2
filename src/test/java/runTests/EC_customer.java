package runTests;

import org.junit.Assert;
import org.junit.Test;
import testNG.NewCustomerFibreOrder;
import testNG.testSuites.EC_FibreOrder_Frogfoot;
import tools.DataRow;
import tools.GetTestData;

import java.util.List;

public class EC_customer {
    @Test
    public void test() {
        String dataPath = System.getProperty("user.dir") + "\\TestData\\Users1TestData.xlsx";
        List<DataRow> data = GetTestData.GetDataSet(dataPath, "Sheet1");
      //  String result = EC_FibreOrder_Frogfoot.execute(data);
      //  Assert.assertNull(result, result);
    }
}
