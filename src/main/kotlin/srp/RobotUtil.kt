package srp

class RobotUtil {
    fun greet(robot: Robot) {
        robot.apply {
            println("Hi! barrio, es $name, y soy de tipo: $type")
        }
    }
}