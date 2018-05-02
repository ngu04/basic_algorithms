import akka.actor.Actor.Receive
import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/**
  * Created by ngu04 on 29/11/2017.
  */

case class Message(txt:String)

class Hello extends Actor {
  override def receive: Receive = {
    case Message(a) => println(a);sender ! s"Receive $a"
    case a => println(a)
  }
}

class World extends Actor{
  override def receive: Receive = {
    case Message(a) => println(a);sender ! s"Receive $a"
    case a => println(a)

  }
}

object ExampleAkka extends  App {

  val system  = ActorSystem("HelloSystem")

  val helloRef = system.actorOf(Props[Hello])

  val worldRef = system.actorOf(Props[World])

  helloRef.tell(Message("First Hello"),worldRef)

  worldRef.tell(Message("First World"),helloRef)
}
