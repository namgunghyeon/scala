import scala.io.Source

/*
Array[java.io.File] = Array(./.android, ./.atom, ./.avcd,
    ./.aws, ./.babel.json, ./.bash, ./.bash_history,
    ./.bash_profile, ./.bash_profile.pysave,
    ./.bash_sessions, ./.cache, ./.cassandra,
    ./.CFUserTextEncoding, ./.CloudStation,
    ./.composer, ./.config, ./.cordova,
    ./.cups, ./.dropbox, ./.DS_Store,
    ./.ebvenv, ./.elasticbeanstalk, ...
*/

object FileMatcher2 {
    private def filesHere = (new java.io.File(".")).listFiles

    def filesMatching(query: String, matcher: (String, String) => Boolean) =
        for (file <- filesHere; if matcher(file.getName, query))
           yield file

}

object FileMatcher2Main {
    def main(args: Array[String]) {
        println(FileMatcher2.filesMatching(".", _.endsWith(_)))
        println(FileMatcher2.filesMatching(".", _.contains(_)))
        println(FileMatcher2.filesMatching(".", _.matches(_)))
    }
}
