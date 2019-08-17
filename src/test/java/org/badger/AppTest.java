package org.badger;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class AppTest {

  @Test
  @Ignore
  public void someTest() {
    Assert.assertEquals(1 , 3);
  }

  @Test
  public void moarTests() {
     Assert.assertEquals(1 , 3);
  }

}
