import akka.actor.ActorRef
import akka.util.Timeout

class UserAccountService {

  def create(accountDetails : List[List[String]],accountActorRef :ActorRef)  ={
    implicit val timeout = Timeout(100)

    val accountCreated = for{
      accountInformation <- accountDetails
      account = (accountActorRef ? accountInformation).mapTo[(String,String)]
    } yield account
  }

  def linkBillerToAccount

}
