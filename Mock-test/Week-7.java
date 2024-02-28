class Result {
 /*
 * Complete the 'bigSorting' function below.
 *
 * The function is expected to return a STRING_ARRAY.
 * The function accepts STRING_ARRAY unsorted as parameter.
 */
 public static List<String> bigSorting(List<String> unsorted) {
 unsorted.sort((o1, o2) -> {
 if (o1.length() == o2.length()) {
 return new BigInteger(o1).compareTo(new BigInteger(o2));
 }
 return o1.length() - o2.length();
 });
 return unsorted;
}
 
}
