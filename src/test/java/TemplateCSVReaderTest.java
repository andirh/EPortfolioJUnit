import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

public class TemplateCSVReaderTest {

    private final String[] mockResult = new String[]{"NAME","LAST_NAME","ADDRESS","COUNTRY"};
    private TemplateCSVReader cut;
    private BufferedReader mockReader;


    @Before
    public void setup(){
        cut = new TemplateCSVReader();
        mockReader = mock(BufferedReader.class);
        try {
            when(mockReader.readLine()).thenReturn("NAME,LAST_NAME,ADDRESS,COUNTRY");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void CSVReaderReturnsRightArray(){
        String[] header = cut.getCSVHeader(mockReader);
        assertThat(header.length).isEqualTo(mockResult.length);
        for (int i = 0; i < header.length; i++){
            assertThat(header[i]).isEqualTo(mockResult[i]);
        }
    }

    @Test(expected = NullPointerException.class)
    public void readerIsNullThrowsException(){
        cut.getCSVHeader(null);
    }

}
