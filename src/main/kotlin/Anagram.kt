class Anagram(private val source: String) {

    fun match(anagrams: Collection<String>): Set<String> {

        return anagrams.filter {
            (it.toLowerCase() != source.toLowerCase()) && (it.sorted() == source.sorted()) }.toSet()
    }

    private fun String.sorted() = toLowerCase().toList().sorted()
}
