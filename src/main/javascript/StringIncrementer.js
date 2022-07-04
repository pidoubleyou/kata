// https://www.codewars.com/kata/54a91a4883a7de5d7800009c
function incrementString (strng) {
  match=strng.match("[0-9]+$")
  if (!match)
    return strng+"1"
  return strng.slice(0,match.index).concat(String((+(match[0]))+1).padStart(match[0].length, 0))
}

describe("Tests", () => {
  it("test", () => {
Test.assertEquals(incrementString("foo"), "foo1");
Test.assertEquals(incrementString("foo123bar000"), "foo123bar001");
Test.assertEquals(incrementString("foobar000"), "foobar001");
Test.assertEquals(incrementString("foobar001"), "foobar002");
Test.assertEquals(incrementString("foobar99"), "foobar100");
Test.assertEquals(incrementString("foobar099"), "foobar100");
Test.assertEquals(incrementString(""), "1");
  });
});
