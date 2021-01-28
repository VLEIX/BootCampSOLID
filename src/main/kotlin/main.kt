import dip.RoboPub
import dip.model.BeerBot
import dip.model.WineBot
import ocp.HttpNetwork

fun main(args: Array<String>) {

//    val robot = Robot("R2D2", "recolector")
////    RobotUtil().greet(robot)
//    robot.greet()

//    val network = HttpNetwork()
//    network.callSaveProcess("imagen")


    val roboPub = RoboPub(listOf(BeerBot(), WineBot()))
    roboPub.dispenseDrinks()
}