import Models.{Account, BillerToUserTransfer}

import scala.collection.mutable

object DatabaseAccesss {

  val accountInfo: mutable.Map[String, Account] = mutable.Map("Umang" -> Account(5000L, "paliwal", "Kanpur", 700),
    "umang" -> Account(5000L, "Paras", "Etawah", 900))

  val database: mutable.Map[Long, (Account, List[BillerToUserTransfer])] = mutable.Map()

}