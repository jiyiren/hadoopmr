import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.ReduceDriver;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author yiji
 * @version v1.0.0
 * @date 2018/2/28 下午2:37
 * @Description
 */
public class MaxTemperatureReducerTest {

    @Test
    public void returnsMaximumIntegerInValues() throws IOException {
        new ReduceDriver<Text, IntWritable, Text, IntWritable>()
                .withReducer(new MaxTemperatureReducer())
                .withInput(new Text("1950"), Arrays.asList(new IntWritable(10),new IntWritable(5)))
                .withOutput(new Text("1950"),new IntWritable(10))
                .runTest();

    }
}