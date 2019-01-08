package lib.elasticsearch

import lib.querysyntax._
import org.joda.time.{DateTime, DateTimeZone}

trait ConditionFixtures {

  val fieldPhraseMatchCondition = Match(SingleField("afield"), Phrase("avalue"))
  val wordsMatchCondition = Match(SingleField("awordfield"), Words("foo bar"))
  val anotherFieldPhraseMatchCondition = Match(SingleField("anotherfield"), Phrase("anothervalue"))

  val dateRangeStart: DateTime = new DateTime(2016, 1, 1, 0, 0).withZone(DateTimeZone.UTC)
  val dateRangeEnd: DateTime = dateRangeStart.plusHours(1)
  val dateMatchCondition = Match(SingleField("adatefield"), DateRange(dateRangeStart, dateRangeEnd))
  val hasFieldCondition = Match(HasField, HasValue("foo"))

}
