package modificators

class ModificatorClass {

    /**
     * 4 типа:
     * Kotlin         аналог Java
     * - private        private
     * - [public]       public
     * - protected      protected
     *   НЕТ            default(package-private)
     *   internal       НЕТ
     */

    private val privateInt: Int = 0
    val publicInt: Int = 0
    protected val protectedInt: Int = 0
    internal val internalInt: Int = 0


}