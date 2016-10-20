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

object FileMatcher {
    private def filesHere = (new java.io.File(".")).listFiles

    def filesEnding(query: String) =
       for (file <- filesHere; if file.getName.endsWith(query))
          yield file
    def filesContaining(query: String) =
       for (file <- filesHere; if file.getName.contains(query))
          yield file
    def filesRegex(query: String) =
       for (file <- filesHere; if file.getName.matches(query))
          yield file
}

object FileMatcherMain {
    def main(args: Array[String]) {
        for (file <- FileMatcher.filesEnding("."))
            println(file)
    }
}
