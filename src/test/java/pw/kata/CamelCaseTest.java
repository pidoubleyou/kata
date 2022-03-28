package pw.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {
  @Test
  void tests() {
    assertEquals( "camel Casing", CamelCase.camelCase("camelCasing"));
    assertEquals( "camel Casing Test", CamelCase.camelCase("camelCasingTest"));
    assertEquals( "camelcasingtest", CamelCase.camelCase("camelcasingtest"));
  }
}