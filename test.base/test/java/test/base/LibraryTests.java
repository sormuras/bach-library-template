package test.base;

import com.github.sormuras.library.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LibraryTests {
  @Test
  void failIfToStringReturnsNull() {
    Assertions.assertNotNull(new Library().toString());
  }
}
